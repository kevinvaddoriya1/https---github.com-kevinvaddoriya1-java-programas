import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa18 {     
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] a = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter a numer "+i +" : ");
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("After Shorting : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
