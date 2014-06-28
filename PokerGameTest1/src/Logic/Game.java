package Logic;

import Objects.Player;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author malinda
 */
public class Game 
{
    //Variables
    private Player player;
    private static ArrayList<Player> playerList;
    boolean addNext=true;
    
    //Starting of the game
    public void GameIntro() 
    {
        System.out.println("\tWelcome\n\t   To\n   2-7 Draw Poker Game\n**************************\n");
        System.out.println("Please select an option to proceed..\n");
        System.out.println("1.View your card pack.");
        System.out.println("2.Add Players");
        System.out.println("\n(Enter the option number & hit ENTER..)\n\n**************************\n");
        GameOptions(new Scanner(System.in).next());
    }
    
    //Game options
    private void GameOptions(String option)
    {
        switch (option) 
        {
            case "1"://<------- View card pack
                new CardPack().DisplayCardPack();
            break;
            
            case "2"://<------- Add players
                SetPlayers();
            break;
                
            default:
                System.out.println("Please select a valid option");
            break;
        }
    }
    
    //Set players to the game
    private void SetPlayers()
    {
        playerList=new ArrayList<>();
        System.out.println("\n*******************************\n\tPlayer Manager\n********************************\n");
        System.out.println("\nPlease enter player details..\n");
        while (addNext) 
        {            
         AddPlayer();
        }
        
    }
    
    //Inialize a player
    private void AddPlayer()
    {
        player=new Player();
        System.out.println("Name:\t");
        player.setName(new Scanner(System.in).next());
        System.out.println("Coins:\t");
        player.setCoins(Integer.parseInt(new Scanner(System.in).next()));
        playerList.add(player);
        System.out.println("Do you want to add another player(Y/N)");
        addNext=new Scanner(System.in).next().equals("y")?true:false;
    }
    
}
