//Rushil Shah
//22070126091
//AIML-B1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        // Create a deck
        deck.createDeck();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Same Cards");
            System.out.println("4. Compare Cards");
            System.out.println("5. Find Card");
            System.out.println("6. Deal 5 Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.printCard();
                    break;
                case 3:
                    deck.sameCard();
                    break;
                case 4:
                    deck.compareCard();
                    break;
                case 5:
                    deck.findCard();
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 8);
    }
}