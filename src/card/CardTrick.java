import java.util.Random;

public class CardTrick {
    // Add your name and student number here
    // Name: Deepika Deepika
    // Student Number: 991709593

    private Card[] hand;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final int HAND_SIZE = 7;

    public CardTrick() {
        hand = new Card[HAND_SIZE];
        fillHand();
    }

    private void fillHand() {
        Random random = new Random();
        for (int i = 0; i < HAND_SIZE; i++) {
            int value = random.nextInt(13) + 1; // Values 1-13
            String suit = SUITS[random.nextInt(SUITS.length)]; // Random suit
            hand[i] = new Card(value, suit);
        }
    }

    public void displayHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        CardTrick cardTrick = new CardTrick();
        cardTrick.displayHand();
    }

    private class Card {
        private int value;
        private String suit;

        public Card(int value, String suit) {
            this.value = value;
            this.suit = suit;
        }

        @Override
        public String toString() {
            String valueStr;
            switch (value) {
                case 1:
                    valueStr = "Ace";
                    break;
                case 11:
                    valueStr = "Jack";
                    break;
                case 12:
                    valueStr = "Queen";
                    break;
                case 13:
                    valueStr = "King";
                    break;
                default:
                    valueStr = String.valueOf(value);
                    break;
            }
            return valueStr + " of " + suit;
        }
    }
}