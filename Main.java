package com.company;
import java.util.Scanner;
public class Main {


//    private static String winOrNot(int sumresult, int rulecoins) {
//        String gagne;
//        return gagne = (sumresult >= rulecoins) ? "gagne" : "pasgagne";
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // define board game
        char[][] board = new char[6][7];
        for (int l = 0; l <= 5; l++) {
            for (int c = 0; c <= 6; c++) {
                board[l][c] = '-';
            }

        }


        // définir les utilisateurs et les régles du Jeu
        int ruleCoins = 4;
        char player1 = 'X';
        char player2 = 'O';
        String gagne = "";
        // joueur actuel

        char currentPlayer = 'X';

        // début de la boucle jeu


        // demande colonne

        while (gagne != "gagne") {
            System.out.println("Joueur suivant: " + currentPlayer + ", dans quelle colonne tu veux mettre le jeton entre 1 et 7:");
            int col = sc.nextInt();
            sc.nextLine();

            // boucle determinant la première ligne (i) vide en fonction de la colonne (col)


            boolean rempli = false;
            for (int i = 0; i <= 5 && rempli == false; i++) {
                if (board[i][col - 1] == '-') {
                    board[i][col - 1] = currentPlayer;
                    rempli = true;
                }
            }


            // test 4 alignés

            // test ligne



            int sumResult = 0;

            for (int l = 0; l <= 5; l++) {
                for (int c = 0; c <= 6; c++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= 4) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }
                //  System.out.println(sumResult);
                //  System.out.println(gagne);
            }



            //  System.out.println(sumResult);


                // gagne = (sumResult >= ruleCoins) ? "gagne" : "pas gagne";

                // test colonne

                for (int c = 0; c <= 6; c++) {
                    for (int l = 0; l <= 5; l++) {
                        if (board[l][c] == currentPlayer) {
                            sumResult = sumResult + 1;
                        } else if (sumResult >= ruleCoins) {
                            gagne = "gagne";
                        } else {
                            sumResult = 0;
                        }
                    }
                    //  System.out.println("sumResult: " + sumResult);
                    //   System.out.println("test: " + gagne);
                }

                // test diag montante
                //1
                for (int c = 0, l = 0; c <= 5 && l <= 5; c++, l++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //2
                for (int c = 0, l = 1; c <= 4 && l <= 5; c++, l++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //3
                for (int c = 0, l = 2; c <= 3 && l <= 5; c++, l++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //4
                for (int c = 1, l = 0; c <= 6 && l <= 5; c++, l++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //5
                for (int c = 2, l = 0; c <= 6 && l <= 4; c++, l++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }
                //  System.out.println("sumResult: " + sumResult);
                //  System.out.println("test: " + gagne);

                //6
                for (int c = 3, l = 0; c <= 6 && l <= 3; c++, l++) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }


                // test diag descendante
                //1
                for (int c = 0, l = 5; c <= 5 && l >= 0; c++, l--) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //2
                for (int c = 0, l = 4; c <= 4 && l >= 0; c++, l--) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //3
                for (int c = 0, l = 3; c <= 3 && l >= 0; c++, l--) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //4
                for (int c = 1, l = 5; c <= 6 && l >= 1; c++, l--) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }

                //5
                for (int c = 2, l = 5; c <= 6 && l >= 1; c++, l--) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }
                // System.out.println("sumResult: " + sumResult);
                //  System.out.println("test: " + gagne);

                //6
                for (int c = 3, l = 5; c <= 6 && l >= 2; c++, l--) {
                    if (board[l][c] == currentPlayer) {
                        sumResult = sumResult + 1;
                    } else if (sumResult >= ruleCoins) {
                        gagne = "gagne";
                    } else {
                        sumResult = 0;
                    }
                }


                // affichage du tableau en sens inverse
                System.out.println("1 | 2 | 3 | 4 | 5 | 6 | 7 |");
                System.out.println("___________________________-");
                for (int l = 5; l >= 0; l--) {
                    for (int c = 0; c <= 6; c++) {
                        System.out.print(board[l][c] + " | ");
                    }
                    System.out.println();
                }
                System.out.println(" ");

                if (gagne == "gagne") {
                    System.out.println("And the winner is " + currentPlayer);
                }


                // gérer l'alternance entre les deux utilisateurs
                // choix de la colonne
                // gèrer victoire O/N (contrôles) / tester chaque pion pour vérifier si 3 devant / 3 derrière 3 au dessus /3 en dessous / 3 en daig dans chaque sens
                switch (currentPlayer) {
                    case 'X':
                        currentPlayer = 'O';
                        break;
                    case 'O':
                        currentPlayer = 'X';
                        break;
                }
            }
        }
    }




