
import java.util.Scanner;

public class LineComparisonComputation {
    static Integer lineLength1 = lineLengthCal1();
    static Integer lineLength2 = lineLengthCal2();

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println("The length of 1st line is: " + lineLength1);
        System.out.println("The length of 2nd line is: " + lineLength2);

        int compare = lineLength1.compareTo(lineLength2);     // comparing Line 1 with Line 2
        System.out.println(compare);
        if (compare == 0)
            System.out.println("Both lines are equal");
        else if (compare == 1 )
            System.out.println("Line 1 is bigger than Line 2");
        else
            System.out.println("Line 1 smaller than Line 2");
    }

    public static int lineLengthCal1() {                     // method for calculating length of line 1
        int x1,y1,x2,y2;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of line (x1,y2)(x2,y2)");
        x1 = scanner1.nextInt();
        y1 = scanner1.nextInt();
        x2 = scanner1.nextInt();
        y2 = scanner1.nextInt();
        System.out.println("("+x1+","+y1+")"+"("+x2+","+y2+")");
        // computation for length of line 1
        lineLength1 = (int) Math.sqrt(Math.pow((x2-x1), 2)
                + Math.pow((y2-y1), 2) );
        return lineLength1;
    }
    public static int lineLengthCal2(){                     // method for calculating length of line 2
        int x3,y3,x4,y4;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of line (x1,y2)(x2,y2)");
        x3 = scanner2.nextInt();
        y3 = scanner2.nextInt();
        x4 = scanner2.nextInt();
        y4 = scanner2.nextInt();
        System.out.println("("+x3+","+y3+")"+"("+x4+","+y4+")");
        // computation for length of line 2
        lineLength2 = (int) Math.sqrt(Math.pow((x4-x3), 2)
                + Math.pow((y4-y3), 2) );
        return lineLength2;
    }
}
