import java.util.Scanner;

public class pa21 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][4];
        int[][] c = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Matrix 1 :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Enter a ["+i+"]"+"["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix 2 :");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length+1; j++) {
                System.out.print("Enter a ["+i+"]"+"["+j+"] : ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 :");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length+1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplicaton of 2 matrix : ");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length+1; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

       sc.close(); 
    }
}
