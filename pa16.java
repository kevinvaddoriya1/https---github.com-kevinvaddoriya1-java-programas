import java.util.Scanner;

public class pa16 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        calc a = new calc();
        Scanner myobj = new Scanner(System.in);
        while (true) {

            System.out.println("Chose an opration.");
            System.out.println("0.exit");
            System.out.println("1.Input two numbers");
            System.out.println("2.+");
            System.out.println("3.-");
            System.out.println("4.*");
            System.out.println("5./");
            int ch = myobj.nextInt();

            if (ch == 1) {
                System.out.println("enter a num1 : ");
                num1 = myobj.nextInt();

                System.out.println("enter a num2 : ");
                num2 = myobj.nextInt();
            }
            if (ch == 2) {
                a.sum(num1, num2);
            }

            if (ch == 3) {
                a.sub(num1, num2);
            }
            if (ch == 4) {
                a.mul(num1, num2);
            }
            if (ch == 5) {
                a.div(num1, num2);
            }
            if (ch == 0) {
                break;
            }
        }
        myobj.close();
    }
}

class calc {
    int n1;
    int n2;

    void sum(int a, int b) {
        n1 = a;
        n2 = b;
        System.out.println("sum is " + (n1 + n2));
    }

    void sub(int a, int b) {
        n1 = a;
        n2 = b;
        System.out.println("subtraction is " + (n1 - n2));
    }

    void mul(int a, int b) {
        n1 = a;
        n2 = b;
        System.out.println("multiplication is " + (n1 * n2));
    }

    void div(int  a, int b) {
        float n1 = a;
        float n2 = b;
        float ans = (n1 / n2);
        System.out.println("division is " + ans);
    }

}