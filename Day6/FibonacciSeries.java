import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int first = 0, second = 1, sum = 0;
        System.out.print(first + "\t" + second + "\t");

        while (sum < range){
            sum = first + second;
            if (sum <= range) {
                System.out.print(sum + "\t");
                first = second;
                second = sum;
            } else
                break;
        }
    }
}
