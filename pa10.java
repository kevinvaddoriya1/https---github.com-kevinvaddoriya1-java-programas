public class pa10 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = (num * (i-j))/(j + 1);
            }
            System.out.println();
        }
    }
}
