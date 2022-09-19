import java.util.Scanner;

public class DriverClass {
    public static void main (String[] args){
        // implicitly initializing using constructor
        Player playerNumber1 = new Player("Beckham", 200, 100, 186.35, 86);

        Scanner input = new Scanner(System.in);
        //User's Input method
        System.out.print("Please Enter Player's name: ");
        String playerName = input.nextLine();
        System.out.print("Please Enter Number of matches played: ");
        int playedMatch = input.nextInt();
        System.out.print("Please Enter Number of international Caps: ");
        int internationalCaps = input.nextInt();
        System.out.print("Please Enter Player's height: ");
        double playerHeight = input.nextDouble();
        System.out.print("Please Enter Number of scored goals and assists given: ");
        int numOfGoals = input.nextInt();
        Player playerNumber2 = new Player(playerName, playedMatch, internationalCaps, playerHeight, numOfGoals);

        Player playerNumber3 = new Player();
        //explicitly setting values using methods
        playerNumber3.setPlayerName("Son");
        playerNumber3.setPlayedMatch(180);
        playerNumber3.setInternationalCaps(87);
        playerNumber3.setPlayerHeight(184);
        playerNumber3.setNumOfGoals(100);
        System.out.println("\n--------------------------\n");

        //Display all 3 Objects
        System.out.println("The record of player number 1");
        playerNumber1.playerData(playerNumber1.getPlayerName(),playerNumber1.getPlayedMatch(), playerNumber1.getInternationalCaps(),playerNumber1.getPlayerHeight(),
                playerNumber1.getNumOfGoals());
        playerNumber1.getCalculation(playerNumber1.getPlayerName(), playerNumber1.getPlayedMatch(), playerNumber1.getNumOfGoals());
        System.out.println("\n--------------------------\n");

        System.out.println("The record of player number 2");
        playerNumber2.playerData(playerNumber2.getPlayerName(),playerNumber2.getPlayedMatch(), playerNumber2.getInternationalCaps(),playerNumber2.getPlayerHeight(),
                playerNumber1.getNumOfGoals());
        playerNumber2.getCalculation(playerNumber2.getPlayerName(), playerNumber2.getPlayedMatch(), playerNumber2.getNumOfGoals());
        System.out.println("\n--------------------------\n");

        System.out.println("The record of player number 3");
        playerNumber3.playerData(playerNumber3.getPlayerName(),playerNumber3.getPlayedMatch(), playerNumber3.getInternationalCaps(),playerNumber3.getPlayerHeight(),
                playerNumber3.getNumOfGoals());
        playerNumber3.getCalculation(playerNumber3.getPlayerName(), playerNumber3.getPlayedMatch(), playerNumber3.getNumOfGoals());
        System.out.println("\n--------------------------\n");

    }

}
