package se.elie.tarningssspel;

import java.util.Scanner;
public class Players {
    Scanner scanner = new Scanner(System.in);

    private String player1name;
    private String player2name;

    public Players() {

        System.out.println("Enter Player 1 name: ");
        player1name = scanner.nextLine();
        System.out.println("Enter Player 2 name: ");
        player2name = scanner.nextLine();

    }

    public String getPlayer1name() {
        return player1name;

    }

    public String getPlayer2name() {
        return player2name;
    }
}
