public class pa8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j < 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = 2 * i - 1; j > i - 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
