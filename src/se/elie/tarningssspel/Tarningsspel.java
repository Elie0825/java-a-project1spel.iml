package se.elie.tarningssspel;

import java.util.Random;
import java.util.Scanner;

class Tarningsspel {
    public static void main(String[] args) {

        Random random = new Random();

        Players players = new Players();
        String player1name = players.getPlayer1name();
        String player2name = players.getPlayer2name();

        int player1point = 0;
        int player2point = 0;

       
            Scanner scanner = new Scanner(System.in);
            System.out.println("vill ni köra om ?");


            for (int i = 1; i <= 3; i++) {
                int kast = random.nextInt(6) + 1;
                System.out.println("player1 kast" + i + ";" + kast);
                int kast2 = random.nextInt(6) + 1;
                System.out.println("player2  kast" + i + ";" + kast2);
                player2point += kast;


                player1point += kast2;
            }
            System.out.println("player1 point: " + player1point);


            System.out.println("player2 point: " + player2point);

            if (player1point > player2point) {

                System.out.println(" player 1 " + player1name + " winner");

            } else if (player2point > player1point) {
                System.out.println(" player2 " + player2name + " winner");
            } else if (player1point == player2point) {
                System.out.println("oavgjort");

            }
        }
    }