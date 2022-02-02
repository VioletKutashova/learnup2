public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        if (isGreenLight == false && speedOfPlayer1 > 0) {
            System.out.println("выбыл");
        } else {
            System.out.println("в игре");
        }

        int speedOfPlayer2 = 0;
        if (isGreenLight == false && speedOfPlayer2 > 0) {
            System.out.println("выбыл");
        } else {
            System.out.println("в игре");
        }
        int speedOfPlayer3 = 2;
        if (isGreenLight == false && speedOfPlayer3 > 0) {
            System.out.println("выбыл");
        } else {
            System.out.println("в игре");
        }
    }
}

