import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void printCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index of card: ");
        int index = scanner.nextInt();
        System.out.println(cards.get(index));
    }

    public void sameCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter suit to find same cards: ");
        String suitToFind = scanner.nextLine();
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suitToFind)) {
                System.out.println(card);
            }
        }
    }

    public void compareCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rank to compare cards: ");
        int rankToCompare = scanner.nextInt();
        for (Card card : cards) {
            if (card.getRank() == rankToCompare) {
                System.out.println(card);
            }
        }
    }

    public void findCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter suit of card to find: ");
        String suitToFind = scanner.nextLine();
        System.out.print("Enter rank of card to find: ");
        int rankToFind = scanner.nextInt();
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suitToFind) && card.getRank() == rankToFind) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    public void dealCard() {
        Random random = new Random();
        System.out.println("Dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(cards.size());
            System.out.println(cards.get(index));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
