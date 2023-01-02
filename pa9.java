public class pa9 {
    public static void main(String[] args) {
        int alphabet = 64;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
