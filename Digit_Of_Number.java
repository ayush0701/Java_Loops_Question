import java.util.Scanner;

public class Digit_Of_Number {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Digit_of_Number = Integer.toString(n);
        for(int i =0 ;i<Digit_of_Number.length();i++){
            System.out.println(Digit_of_Number.charAt(i));
        }
    }
}
