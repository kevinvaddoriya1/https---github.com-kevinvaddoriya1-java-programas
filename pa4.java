public class pa4 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 5) {
            while (j <= i) {
                System.out.print(" " + i * j);
                j++;
            }
            j=1;
            System.out.println();
            i++;
        }
    }
}
