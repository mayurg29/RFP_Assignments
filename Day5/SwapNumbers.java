import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){

        System.out.println("Enter two numbers: ");
        Scanner N = new Scanner(System.in);
        int i = N.nextInt();
        int j = N.nextInt();

        System.out.println( "i = " + i + " and j = " + j);
        int swap = i;
        i = j;
        j = swap;
        System.out.println( "i = " + i + " and j = " + j);
    }
}
