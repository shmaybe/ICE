package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author May Tran Feb 3, 2023
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
             Card[] hand = new Card[7];
        hand[0]= new Card();
        hand[0].setValue(1);
        hand[0].setSuit("Hearts");        
        hand[1]= new Card();
        hand[1].setValue(2);
        hand[1].setSuit("Clubs");        
        hand[2]= new Card();
        hand[2].setValue(3);
        hand[2].setSuit("Diomonds");
        hand[3]= new Card();
        hand[3].setValue(4);
        hand[3].setSuit("Spades");
        hand[4]= new Card();
        hand[4].setValue(5);
        hand[4].setSuit("Clubs");
        hand[5]= new Card();
        hand[5].setValue(12);
        hand[5].setSuit("Hearts");
        hand[6]= new Card();
        hand[6].setValue(11);
        hand[6].setSuit("Hearts");

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner input = new Scanner(System.in);
        int userValue =input.nextInt();
        String userSuit= input.nextLine();
        for(int i =0;i<hand.length;i++){
            if(hand[i].getValue()==userValue &&
               hand[i].getSuit().equals(userSuit)){
                printInfo();
            }//end of if
        }//end of for
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author May Tran Feb 3, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is May");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- stop crying");
        System.out.println("-- have a farm");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- crying");
        System.out.println("-- stardew");
        System.out.println("-- nuggets");
        System.out.println("-- more crying");

        System.out.println();
        
    
    }

}
