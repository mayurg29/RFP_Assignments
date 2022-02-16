// Checking equality of two lines using equals method

import java.util.Scanner;

public class LineComparisonComputationUC2 {
    
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
        // computation for length of line 1
        Double line1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        System.out.println("The length of line 1 is: " + line1);
   
        int x3,y3,x4,y4;
        System.out.println("Enter the co-ordinates of line (x3,y3)(x4,y4)");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        System.out.println("("+x3+","+y3+")"+"("+x4+","+y4+")");
        // computation for length of line 2
        Double line2 = Math.sqrt(Math.pow((x4-x3), 2) + Math.pow((y4-y3), 2) );
        System.out.println("The length of line 2 is: " + line2);

        // equals method
        Boolean equal = line1.equals(line1);           
        System.out.println("Both lines are equal: " + equal);
    }
}
