import java.util.Scanner;

public class PrimeNo {
    static int Prime(int N){
        if(N<2){
            return 0;
        }

            for(int i=2;i<=Math.sqrt(N);i++){
                if((N%i)==0){
                    return 0;
                }

            }
            return 1;



    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Prime(n);
        if(result == 1){
            System.out.println("The Number is prime Number");
        }
        else{
            System.out.println("The number is not Prime Number");
        }
        
        }

}
        
    
