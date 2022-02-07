import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int base = 2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the exponent: ");
        int expo = sc.nextInt();
        long power = 1;
        for (int i = 1; i <= expo; i++){
            power = power * base;
        }
        System.out.println("Result:"+power);
    }
}
