import java.util.Scanner;

public class pa20 {

    public static void main(String[] args) {
        int a, s, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Stack : ");
        s = sc.nextInt();
        ds d = new ds();
        d.size = s;
        boolean t = true;
        while (t) {
            System.out.println("0.exit");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");

            a = sc.nextInt();
            switch (a) {
                case 0:
                    t = false;
                    break;

                case 1:
                    System.out.println("Enter a elemnet : ");
                    x = sc.nextInt();
                    d.push(x);
                    break;
                case 2:
                    d.pop();
                    break;
                case 3:
                    d.disp();
                    break;

                default:
                    break;
            }

        }
        sc.close();
    }
}

class ds {
    int size = 5;
    // ds(int a){
    // size = a;
    // }
    int[] stack = new int[size];
    int top = -1;

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("stack is overflow.");
        } else {
            top++;
            stack[top] = x;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
        } else {
            int a;
            a = stack[top];
            top--;
            System.out.println("poped element is " + a);
        }
    }

    public void disp() {
        for (int i = 0; i < top + 1; i++) {
            System.out.println("element " + i + " : " + stack[i]);
        }
    }
}
