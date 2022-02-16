// Line Comparison Computation using OOP

import java.util.Scanner;

public class LineComparisonComputationUC4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Double line1 = lineLengthCal1();
        System.out.println("The length of line 1 is: " + line1);
        Double line2 = lineLengthCal2();
        System.out.println("The length of line 2 is: " + line2);

        // Checking equality of two lines using equals method
        Boolean equal = line1.equals(line2);
        System.out.println("Both lines are equal: " + equal);
        System.out.println("------------------------------");

        // comparing Line 1 with Line 2 using compareTo method
        int compare = line1.compareTo(line2);
        System.out.println("Compare output: " + compare);
        if (compare == 0)
            System.out.println("Both lines are equal");
        else if (compare == 1 )
            System.out.println("Line 1 is bigger than Line 2");
        else
            System.out.println("Line 1 smaller than Line 2");
    }

    public static Double lineLengthCal1() {               // method for calculating length of line 1
        int x1,y1,x2,y2;
        System.out.println("Enter the co-ordinates of line (x1,y2)(x2,y2)");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("("+x1+","+y1+")"+"("+x2+","+y2+")");
        // computation for length of line 1
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }
    public static Double lineLengthCal2(){                 // method for calculating length of line 2
        int x3,y3,x4,y4;
        System.out.println("Enter the co-ordinates of line (x3,y3)(x4,y4)");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        System.out.println("("+x3+","+y3+")"+"("+x4+","+y4+")");
        // computation for length of line 2
        return Math.sqrt(Math.pow((x4-x3), 2) + Math.pow((y4-y3), 2));
    }
}
