public class pa13 {
    public static void main(String[] args) {
        product p1 = new product("fan");
        product.total(500);
        p1.disp();
        product p2 = new product("pcb");
        product.total(5000);
        p2.disp();
        product p3 = new product("mobile");
        product.total(12000);
        p3.disp();
    }
} 
class product {

    String pr ;
    product(String a){
        pr = a;
        System.out.print(pr +" : ");
    }
    static int n = 0;
    public static void total(int amt){
        n = n + amt;
        System.out.println(""+amt);
    }
    void disp(){
        System.out.println("Total bill is : "+n);
    }

}
