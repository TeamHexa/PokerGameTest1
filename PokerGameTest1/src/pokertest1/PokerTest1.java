package pokertest1;
import Logic.Game;


/**
 *
 * @author malinda
 */

public class PokerTest1 
{
     
    public static void main(String[] args) 
    {
        try 
        {
            new Game().GameIntro();
        } 
        catch (Exception e) 
        {
            System.err.println(e.toString());
        }
       
    }
    
    
}
