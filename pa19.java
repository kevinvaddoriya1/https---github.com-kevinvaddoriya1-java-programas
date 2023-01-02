import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa19 {     
    public static void main(String[] args) throws IOException {
        String[] a = new String[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter a name "+i +" : ");
            a[i] = br.readLine();
        }
        System.out.println("After Shorting : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i].compareTo(a[j])>0){
                    String temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
