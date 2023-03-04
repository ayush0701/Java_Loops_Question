import java.util.Scanner;
public class PrimeN0_from1toN {

    public static void main(String[] args) {
         static int Prime(int N) {
            if (N < 2) {
                return 0;
            }
    
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if ((N % i) == 0) {
                    return 0;
                }
    
            }
            return 1;
        }
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1;i<=n;i++) {
                int result = Prime(i);

                if (result == 1) {
                    System.out.println( i +" The Number is prime Number");
                } else {
                    System.out.println( i + " The number is not Prime Number");

                }
            }
        }

    }
