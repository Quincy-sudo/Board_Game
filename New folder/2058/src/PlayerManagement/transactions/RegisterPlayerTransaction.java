package PlayerManagement.transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PlayerManagement.Player;

public class RegisterPlayerTransaction {

    public int playerAmount = 0;
    public static List<Player> gamePlayers = new ArrayList<Player>();
    public Scanner nS = new Scanner(System.in);

    public static int numTurns;

    public List<Player> RegisterPlayers() {

        System.out.print("Enter the amount of players entering your game: ");
        String amount = nS.nextLine();

        switch (amount) {
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            default:
                System.out.println("That is not a valid input (enter 2 - 8)");
                RegisterPlayers();
                break;
        }
        String pname = null;

        int x = Integer.parseInt(amount);

        // check if name has already been entered by player
        for (int i = 0; i < x; i++) {

            System.out.println("Enter the name of player " + (i + 1) + ": ");
            pname = nS.nextLine();
            if (!isAlphaNumeric(pname) || pname.equalsIgnoreCase("")) {
                System.out.println("That is an invalid name, please restart.");
                RegisterPlayers();
            }

            while (!nameDuplicationCheck(pname)) {
                System.out.print("This player name has already been entered! \n\n");
                System.out.println("Enter the name of player " + (i + 1) + ": ");
                pname = nS.nextLine();
                nameDuplicationCheck(pname);
            }
            gamePlayers.add(new Player(pname, 1500));
        }

        if (!securityCheck()) {
            System.out.println("Some of the players entered are either null or not acceptable.");
        }

        else {
            printDetails();
            boolean holder = false;

            // getting the amount of turns the game should last for
            System.out.println("Enter how many turns do you want the game to continue for: " + "\n");
            holder = true;
            String num = nS.nextLine();
            while (!numberCheck(num)) {
                System.out.println("Not valid");
                System.out.println("Enter how many turns do you want the game to continue for: " + "\n");
                num = nS.nextLine();
                numberCheck(num);
            }

            numTurns = Integer.parseInt(num);
            System.out.println("Enter any button to start the game");
            String in = nS.nextLine();
            System.out
                    .println("\n" + "#########################################################################" + "\n"); // adding

            return gamePlayers;

        }
        return null;
    }

    public boolean numberCheck(String in) {
        boolean numeric = true;

        try {
            Double num1 = Double.parseDouble(in);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        return numeric;

    }

    public boolean nameDuplicationCheck(String name) // check if player name has already been used
    {
        for (Player gamePlayer : gamePlayers) {
            if (gamePlayer.getName().equalsIgnoreCase(name)) {
                return false;
            } else {
            }
        }

        return true;
    }

    public boolean securityCheck() {
        for (Player gamePlayer : gamePlayers) {
            return gamePlayer != null;
        }
        return true;
    }

    public boolean isAlphaNumeric(String s) {
        String pattern = "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
    }



    public static void printDetails() {
        System.out.println("Here are the following players for the current game: ");
        for (Player gamePlayer : gamePlayers) {
            if (gamePlayer != null) {
                gamePlayer.printDetails();
            }
        }
    }

    public List<Player> getPlayerList() {

        return gamePlayers;
    }

}
