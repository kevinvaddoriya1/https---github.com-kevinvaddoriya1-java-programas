import java.util.Scanner;

public class pa7 {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuseday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        
            default:
                break;
        }
        myobj.close();
    }
}
