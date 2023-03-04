import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in){
        int n = sc.nextInt();
        String Digit_of_Number = Integer.toString(n);
        int M = Digit_of_Number.length()-1 ;
        for(int i= M; i>=0; i--){
            System.out.print(Digit_of_Number.charAt(i));
        }
    }
}
}
