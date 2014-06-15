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

    private ArrayList<Card> GenerateCardPack(String suite)
    {
        ArrayList<Card> cardList=new ArrayList<>();
         
            for (int i = 1; i <= 52; i++) 
            {
                Card ca=new Card ();
                ca.setValue(i);
                ca.setSuite(suite);
                cardList.add(ca);
            }
            
          return cardList;
    }
    
    private 
    
          
}
