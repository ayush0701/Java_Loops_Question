public class ArmstrongNo_1_N {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            double result = 0;
            int originalnumber = i;
            while (originalnumber > 0) {
                int m = originalnumber % 10;
                double z = Math.pow(m, 3);
                result = result + z;
                originalnumber /= 10;
            }
            if (result == i) {
                System.out.println(i + " is an Armstrong Number");
            } else {
                System.out.println(i + " is not an Armstrong Number");
            }
        }
    }
}