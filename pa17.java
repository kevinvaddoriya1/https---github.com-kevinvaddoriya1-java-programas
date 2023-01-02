public class pa17 {
    public static void main(String[] args) {
        Area a = new Area();
        a.area(5);
        a.area(5, 8);
        a.area(5.0, 2.0);
    }
}

class Area {

    void area(int l){
        System.out.println("Area of squear : "+ (l*l));
    }
    void area(int l,int w){
        System.out.println("Area of rectangle : "+(l*w));
    }
    void area(double l ,double w){
        System.out.println("Area of triangle : " + (0.5*l*w));
    }
}