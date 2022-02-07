public class SnakeAndLadderSolo {
    public static void main(String[] args) {
        int position = 0;

        while (position < 100) {

            int Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Dice number: " + Dice);

            int play = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Play:"+play);

            if (play == 0) {
                System.out.println("No Play");
                position = position;
            } else if (play == 1) {
                System.out.println("Ladder");
                position = position + Dice;
                if (position > 100)
                    position = position - Dice;
            } else {
                System.out.println("Snake");
                position = position - Dice;
            }
            if (position < 0) {
                position = 0;
            }
            System.out.println("Position:"+position);
            System.out.println("-----------------------");
        }
        System.out.println("Victory");
    }
}
