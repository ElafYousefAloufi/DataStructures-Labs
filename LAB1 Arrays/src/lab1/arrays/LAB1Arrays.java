package lab1.arrays;

public class LAB1Arrays {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 5; i++) {
            String Suit = suits[deck[i] / 13];
            String Rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + Rank + " of " + Suit);

        }

    }

}
