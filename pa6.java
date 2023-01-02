import java.util.Scanner;

public class pa6 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = myobj.nextInt();
        int fact = 1;
        int i = 1;
        do {
            fact=fact*i;
            i++;
        } while (i <= n);
        System.out.println(fact);
        myobj.close();
    }
}
