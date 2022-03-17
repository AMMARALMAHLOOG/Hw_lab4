import java.util.Scanner;
// Solution of joseph problem
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Q1 q = new Q1(n);
        for (int i = 0; i <n ; i++) {
            q.enqueue(i+1);
        }
        int max = 3;
        while (q.size()>1){
            for (int i = 0; i <max-1 ; i++) {
                q.rotate();
                Object e = q.dequeue();
                System.out.println("\t" + e + "is out");
            }
        }

        q.print();
    }
}
