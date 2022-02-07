import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        System.out.print("Number of flips = ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int tailcount = 0, headcount =0;

        for (int i =0; i < count; i++) {
        double Random = Math.random();
        if (Random < 0.5)
            tailcount++;
        else
            headcount++;
        }
        System.out.println("Percentage of Tails ("+"Tails:"+tailcount+") : " + (tailcount*100f /(tailcount+headcount)));
        System.out.println("Percentage of Heads ("+"Heads:"+headcount+") : " + (headcount*100f /(tailcount+headcount)));

    }
}