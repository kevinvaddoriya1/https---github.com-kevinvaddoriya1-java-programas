import java.util.Scanner;

public class pa2 {
    public static void main(String[] args) {
        try (Scanner myobj = new Scanner(System.in)) {
            System.out.println("enter a number 1 : ");
            int num1 = myobj.nextInt();
            System.out.println("enter a number 2 : ");
            int num2 = myobj.nextInt();
            System.out.println("enter a number 3 : ");
            int num3 = myobj.nextInt();
            if ((num1 > num2 && num1 < num3) || (num1>num3 && num1<num2)) {
                System.out.println("middile number is  : " + num1);
            }
            if ((num2 > num1 && num2 < num3) || (num2>num3 && num2<num1)) {
                System.out.println("middile number is  : " + num2);
            }
            if ((num3 > num2 && num3 < num1) || (num3>num1 && num3<num2)) {
                System.out.println("middile number is  : " + num3);
            }     
        }

    }
}
