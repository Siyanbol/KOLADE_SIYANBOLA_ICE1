package cardGame;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @author Kolade Siyanbola
 */
public class CardGameICE1 {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            // calls method that generates random value for card value
            c.setValue(Card.randValue());
            // calls method that generates random value for card suit value
            c.setSuit(Card.SUITS[Card.randSvalue()]);
            //saves hand of cards to array
            magicHand[i] = c;
            //prints magic hand of cards
          System.out.println(c.getValue() + " " + "of" + " " + c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
        
        Scanner userin = new Scanner(System.in);
        Scanner userstr = new Scanner(System.in);
        
        int userValue;
        String userSuit;
        
        System.out.print("Please enter a card value here: ");
        userValue = userin.nextInt();
        
        System.out.print("Please enter a card suit here: ");
        userSuit = userstr.nextLine();
        
        boolean inHand;
        inHand = false;
        
        for (Card magicHand1 : magicHand) {
            if (userValue == magicHand1.getValue() && userSuit.equals(magicHand1.getSuit())) {
                System.out.println("test");
                inHand = true;
            } else if (inHand = false) {
            System.out.println("Sorry your card is not one of the selected cards in the magic hand");
        
            }
        
        
        // tests random value generators when called
        // System.out.println(Card.randValue());
        // System.out.println(Card.randSvalue());
        }
    }
    
}