package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // define board game
        char [][] board = new char [6][7];
        for (int l=0; l<=5 ; l++) {
            for (int c=0; c<=6; c++) {
                board [l][c] = '-';}

        }


        // définir les utilisateurs

        char player1 = 'X';
        char player2 = 'O';

        // joueur actuel

        char currentPlayer = 'X';

        // début de la boucle jeu
        // demande colonne

        for (int i=1 ; 1<10000 ;i++)

        {
            System.out.println("Dans quelle colonne tu veux mettre le jeton entre 1 et 7:");
            int col = sc.nextInt();
            sc.nextLine();

            // boucle determinant la première ligne (i) vide en fonction de la colonne (col)


            if (board[0][col - 1] == '-') {
                board[0][col - 1] = 'X';
            } else if (board[1][col - 1] == '-') {
                board[1][col - 1] = 'X';
            } else if (board[2][col - 1] == '-') {
                board[2][col - 1] = 'X';
            } else if (board[3][col - 1] == '-') {
                board[3][col - 1] = 'X';
            } else if (board[4][col - 1] == '-') {
                board[4][col - 1] = 'X';
            } else if (board[5][col - 1] == '-') {
                board[5][col - 1] = 'X';
            } else {
                board[6][col - 1] = 'X';
            }

            //     (board [i] [col] == '-')
            //board[i][col-1] = currentPlayer;
            //  i++;


            // affichage du tableau en sens inverse
            for (int l = 5; l >= 0; l--) {
                for (int c = 0; c <= 6; c++) {
                    System.out.print(board[l][c]);
                }
                System.out.println();
            }
        }
        //for (int l = 0; l <)=5 ; i++) {
         //   for (int c = 0;c < 6;c++) {
           //     tableau[i][j] = i + j;
             //   System.out.print(tableau[i][j] + " ");




    // gérer l'alternance entre les deux utilisateurs
    // choix de la colonne
    // gèrer victoire O/N (contrôles) / tester chaque pion pour vérifier si 3 devant / 3 derrière 3 au dessus /3 en dessous / 3 en daig dans chaque sens
    }
}
