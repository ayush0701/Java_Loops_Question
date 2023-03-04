public class Armstrong {
    public static void main(String[] args) {
        int n = sc.nextInt();
        double result =0 ;
        int originalnumber = n;
        while(originalnumber>0){
            int m = originalnumber%10;
            double z = Math.pow(m,3);
            result = result+z;
            originalnumber/= 10;
        }
        if(result == n){
            System.out.println( n + " is an Armstrong Number");
        }
        else{
            System.out.println( n + " is not an Armstrong Number");
        }
    }
}
