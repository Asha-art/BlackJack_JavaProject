/*Test:
1)Set an initial budget of $200
2) allow the player to bet in increments of $5 as the cards are drawn
3) increment or decrement the $200 balance by the amount wagered according to whether the hand is won or lost.
4)If the player’s balance reaches $0,they lose and the game ends.
*/

//package BlackJack_CodeThugsinHarmony_Java;

import java.util.Scanner;

public class Player1 {
    Scanner scanner = new Scanner(System.in);
    private int balanceMoney = 200;
    private int bet;
    String answer;

    boolean userWins;

    public Player1() {

    }

    public int getBalanceMoney() {
        return balanceMoney;
    }

    // 2) allow the player to bet in increments of $5 as the cards are drawn
    public int getBet() {
        // System.out.println("You have $" + balanceMoney);
        System.out.println("You can enter the bet amount in the increment of $5");
        bet = scanner.nextInt();

        while ((bet % 5 != 0) || (bet < 0 || bet > balanceMoney)) {
            System.out.println("Enter between $5 and $" + balanceMoney + " in the increment of $5");
            bet = scanner.nextInt();
        }
        // scanner.close();
        return balanceMoney;
    }

    // 3) increment or decrement the $200 balance by the amount wagered according to
    // whether the hand is won or lost.
    public int updateBalanceMoney() {
        if (userWins == true) {
            balanceMoney = getBalanceMoney() + bet;
        } else {
            balanceMoney = getBalanceMoney() - bet;// if he/she lose his bet money
            // is lost
        }
        System.out.println("You have $" + balanceMoney);

        // 4) If the player’s balance reaches $0, they lose and the game ends.

        if (getBalanceMoney() == 0) {

            System.out.println("Looks like you've run out of your money,would you like to try again? Y/N");

            answer = scanner.next();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("Excellent, We will start out at $200 to begin again");
                balanceMoney = 200;

            } else {
                scanner.close();
                System.exit(0);
            }
        }

        return balanceMoney;
    }

    // method to check whether use wins or lose

    // public boolean getHandSum() {
    // int handSum = 0;
    // if (handSum <= 21) {
    // userWins = true;
    // } else {
    // userWins = false;
    // }
    // return userWins;

    // }

    // public static void main(String[] args) {
    // Player1 player = new Player1();
    // player.getBet();
    // player.updateBalanceMoney();
    // }
}
