import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.io.*;

class Huffman
{
    public static void encode(Node root, String str,
                              Map<Character, String> huffmanCode)
    {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.ch, str);
        }


        encode(root.left, str + "0", huffmanCode);
        encode(root.right, str + "1", huffmanCode);
    }

    public static int decode(Node root, int index, StringBuilder sb)
    {
        if (root == null)
            return index;

        if (root.left == null && root.right == null)
        {
            System.out.print(root.ch);
            return index;
        }

        index++;

        if (sb.charAt(index) == '0')
            index = decode(root.left, index, sb);
        else
            index = decode(root.right, index, sb);

        return index;
    }

    public static byte[] readFile(String filename) throws IOException {
        return new FileInputStream(filename).readAllBytes();
    }

    public static void writeFile(String filename, byte[] data) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        fos.write(data);
        fos.close();
    }

    public static void encodeFile(String inputFile, String outputFile) throws Exception {
        byte[] data = readFile(inputFile);
        String text = new String(data);

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((l, r) -> l.freq - r.freq);
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (pq.size() != 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.add(new Node('\0', left.freq + right.freq, left, right));
        }

        Node root = pq.peek();
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);

        StringBuilder encoded = new StringBuilder();
        for (char c : text.toCharArray()) {
            encoded.append(huffmanCode.get(c));
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile));
        oos.writeObject(huffmanCode);
        oos.writeObject(encoded.toString());
        oos.close();
    }

    public static void decodeFile(String inputFile, String outputFile) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile));
        Map<Character, String> huffmanCode = (Map<Character, String>) ois.readObject();
        String encoded = (String) ois.readObject();
        ois.close();

        Node root = new Node('\0', 0);
        for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
            Node current = root;
            for (char bit : entry.getValue().toCharArray()) {
                if (bit == '0') {
                    if (current.left == null)
                        current.left = new Node('\0', 0);
                    current = current.left;
                } else {
                    if (current.right == null)
                        current.right = new Node('\0', 0);
                    current = current.right;
                }
            }
            current.ch = entry.getKey();
        }

        StringBuilder result = new StringBuilder();
        Node current = root;
        for (char bit : encoded.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;
            if (current.left == null && current.right == null) {
                result.append(current.ch);
                current = root;
            }
        }

        writeFile(outputFile, result.toString().getBytes());
    }

    public static void main(String[] args) throws Exception
    {
        if (args.length != 3) {
            System.out.println("Использование:");
            System.out.println("java Huffman encode input.txt output.huff");
            System.out.println("java Huffman decode input.huff output.txt");
            return;
        }

        if (args[0].equals("encode")) {
            encodeFile(args[1], args[2]);
        } else if (args[0].equals("decode")) {
            decodeFile(args[1], args[2]);
        }
    }
}