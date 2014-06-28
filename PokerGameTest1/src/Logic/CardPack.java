/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;
import Objects.Card;
import java.util.ArrayList;

/**
 *
 * @author malinda
 */
public class CardPack 
{
    //Variables
    
    private String value;
    private Card card;
    private ArrayList<Card> cardPack;
    int count=0;

    //Generate a suit
    
    private void GenerateSuit(String suitName)
    {         
           for (int i = 1; i <=13; i++) 
            {
                card=new Card (); // Initialize a new card
               
                value=String.valueOf(i);

                if (i==1) 
                {
                    value="A";
                }
                if (i==11) 
                {
                    value="J";
                }
                if (i==12) 
                {
                    value="Q";
                }
                if(i==13)
                {
                    value="K";
		}
                
                 card.setValue(value);
                card.setSuite(suitName);
                
                cardPack.add(card);
             }
                
               
            
    }
    
    //Creating the card pack(Deck)
    
    public ArrayList<Card> CardPack()
    {
        cardPack =new ArrayList<>(); // initialize card pack
        
        //Creating 4 suits with values
        
        for (int i = 0; i < 4; i++) 
        {
            if (i==0) 
            {
                GenerateSuit("Hearts  ");
            }
            if (i==1) 
            {
                GenerateSuit("Diamonds");
            }
            if (i==2) 
            {
                GenerateSuit("Clubs   ");
            }
            if (i==3) 
            {
                GenerateSuit("Spades  ");
            }
        }
        
        return cardPack;
    }
    
    //Display card pack
    
    public void DisplayCardPack()
    {
        System.out.println("Suite\t\t\tValue\n------------------------------");
         
        for (Card cardSelect : new CardPack().CardPack()) 
        {
            count++;
            System.out.println(cardSelect.getSuite()+"\t\t"+cardSelect.getValue());
        }
        
        System.out.println("\n-------------------------------\nTotal Cards\t\t"+count);
        
    }
        
}
