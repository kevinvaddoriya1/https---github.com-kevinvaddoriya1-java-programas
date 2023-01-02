import java.util.Scanner;

public class pa14 {
    public static void main(String[] args) {
        int id, qty, price;
        String name;
        Scanner sc = new Scanner(System.in);
        Scanner myobj = new Scanner(System.in);
        System.out.println("PID    PNAME    QTY   PRICE    TOTAL    BILL_AMT");
        System.out.print("Enter a id : ");
        id = sc.nextInt();
        System.out.print("Enter product name : ");
        name = myobj.nextLine();
        System.out.print("Enter a QTY : ");
        qty = sc.nextInt();
        System.out.print("Enter a price : ");
        price = sc.nextInt();
        purchase a = new purchase(id, name, qty, price);

        System.out.print("Enter a id : ");
        id = sc.nextInt();
        System.out.print("Enter product name : ");
        name = myobj.nextLine();
        System.out.print("Enter a QTY : ");
        qty = sc.nextInt();
        System.out.print("Enter a price : ");
        price = sc.nextInt();
        purchase b = new purchase(id, name, qty, price);

        System.out.print("Enter a id : ");
        id = sc.nextInt();
        System.out.print("Enter product name : ");
        name = myobj.nextLine();
        System.out.print("Enter a QTY : ");
        qty = sc.nextInt();
        System.out.print("Enter a price : ");
        price = sc.nextInt();
        purchase c = new purchase(id, name, qty, price);
        a.disp();
        b.disp();
        c.disp();

        c.totalbill();
        sc.close();
        myobj.close();
    }
}

class purchase {

    int id;
    String name;
    int qty;
    int price;
    int total_price;
    static int bill;

    purchase(int id, String name, int qty, int price) {
        this.id = id;
        this.name = name;
        this.total_price = qty * price;
        this.qty = qty;
        this.price = price;
        // bill = bill + this.total_price;
    }

    static void tbill(int qty, int price) {
        bill = bill + (qty * price);
    }

    void disp() {
        tbill(qty, price);
        System.out.println(
                id + "      " + name + "      " + qty + "     " + price + "      " + total_price + "     " + bill);
    }

    void totalbill() {
        System.out.println("Total bill is : " + bill);
    }
}