// Calculating length of a line

import java.util.Scanner;

public class LineComparisonComputationUC1 {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);
        
        int x1,y1,x2,y2;
        System.out.println("Enter the co-ordinates of line (x1,y2)(x2,y2)");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("("+x1+","+y1+")"+"("+x2+","+y2+")");
        Double lineLength = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        System.out.println("The length of a line is: " + lineLength);
    }
}
