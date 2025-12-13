class Point{
    private int x;
    private int y;
    Point(int x, int y){

        this.x = x;
        this.y = y;
    }

    void print(){  System.out.printf("(%d, %d)", x, y); }

    @Override
    public boolean equals(Object otherObject){
        // проверка на идентичноть (по ссылкам)
        if (this == otherObject) return true;

        // проверка на принадлежность классу
        if (!(otherObject instanceof Point)) return false;

        // преобразуем объект к типу Point
        Point p = (Point)otherObject;
        // проверка на равенство координат
        return this.x == p.x  && this.y == p.y;
    }
}