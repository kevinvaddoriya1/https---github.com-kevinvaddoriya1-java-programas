import java.util.Scanner;

public class pa3 {
    public static void main(String[] args) {
        try (Scanner myobj = new Scanner(System.in)) {
            System.out.println("enter a marks.");
            System.out.println("Maths:");
            float maths = myobj.nextFloat();
            System.out.println("CPP:");
            float cpp = myobj.nextFloat();
            System.out.println("java:");
            float java = myobj.nextFloat();
            System.out.println("android:");
            float android = myobj.nextFloat();
            float total = maths+cpp+java+android;
            float avg = total/4;
            if (avg > 70) {
                System.out.println("Distinction");
            }
            else if (avg > 60) {
                System.out.println("First class.");
            } 
            else if (avg > 50) {
                System.out.println("Second class.");
            } 
            else if (avg > 35) {
                System.out.println("Pass.");
            } 
            else {
                System.out.println("Fail");
            }
        }
    }
}
