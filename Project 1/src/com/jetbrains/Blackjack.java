import java.util.*;
public class Blackjack {

    public static int dealCard(int i) {
        P1Random rng = new P1Random();

        //remnants of a really good method lol
        return i;
    }


    public static void main(String[] args) {
        P1Random rng = new P1Random();
        int win = 0;
        int lose = 0;
        int tie = 0;
        int dealerHand;
        int gameNum = 0;
        int yourCard;
        int yourHand = 0;
        int a;//variable for switch
        boolean menuLoop = true;
        boolean choiceLoop = true;
        Scanner scanner = new Scanner(System.in);
        while (menuLoop) {// loop prints out first game and first card/hand
            System.out.println("START GAME #" + (gameNum + 1) + "\n");
            yourCard = rng.nextInt(13) + 1;
            if (yourCard == 1) {
                System.out.println("Your card is a ACE!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 2) {
                System.out.println("Your card is a 2!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 3) {
                System.out.println("Your card is a 3!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 4) {
                System.out.println("Your card is a 4!");
                yourHand += yourCard;//adding yourCard to yourHand gives running sum of cards
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 5) {
                System.out.println("Your card is a 5!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 6) {
                System.out.println("Your card is a 6!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 7) {
                System.out.println("Your card is a 7!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 8) {
                System.out.println("Your card is a 8!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 9) {//cards 1-9
                System.out.println("Your card is a 9!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 10) {
                System.out.println("Your card is a 10!");
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 11) {
                System.out.println("Your card is a JACK!");
                yourCard = 10;
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 12) {
                System.out.println("Your card is a QUEEN!");
                yourCard = 10;
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            } else if (yourCard == 13) {
                System.out.println("Your card is a KING!");
                yourCard = 10; // this makes any card over 10 equal to 10
                yourHand += yourCard;
                System.out.println("Your hand is: " + yourHand);

            }

            while (choiceLoop) {// this loop allows the user to pick from the menu of choices
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit\n");
                System.out.println("Choose an option: ");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        yourCard = rng.nextInt(13) + 1;//creates the random card
                        if (yourCard == 1) {
                            System.out.println("Your card is a ACE!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 2) {
                            System.out.println("Your card is a 2!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 3) {
                            System.out.println("Your card is a 3!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 4) {
                            System.out.println("Your card is a 4!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 5) {
                            System.out.println("Your card is a 5!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 6) {
                            System.out.println("Your card is a 6!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 7) {
                            System.out.println("Your card is a 7!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 8) {
                            System.out.println("Your card is a 8!");
                            yourHand += yourCard;          // same code block as before
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 9) {
                            System.out.println("Your card is a 9!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 10) {
                            System.out.println("Your card is a 10!");
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 11) {
                            System.out.println("Your card is a JACK!");
                            yourCard = 10;
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 12) {
                            System.out.println("Your card is a QUEEN!");
                            yourCard = 10;
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        } else if (yourCard == 13) {
                            System.out.println("Your card is a KING!");
                            yourCard = 10;
                            yourHand += yourCard;
                            System.out.println("Your hand is: " + yourHand);

                        }
                        if (yourHand > 21) { // resets the game with a loss and starts a new game
                            System.out.println("You exceeded 21! You lose.");
                            lose += 1;
                            gameNum += 1;
                            yourHand = 0;
                            choiceLoop = false;
                            break;
                        }else if (yourHand == 21){
                            System.out.println("BLACKJACK! You win!");
                            win += 1;
                            yourHand = 0;
                            gameNum += 1;
                            choiceLoop = false;
                            break;
                        }
                            break;

                    case 2:
                        dealerHand = rng.nextInt(11) + 16;
                        System.out.println("Dealer's hand: " + dealerHand + "\nYour hand is: " + yourHand);
                        if (dealerHand > 21) { //resets the game with a win and starts the next game
                            System.out.println("You win!");
                            gameNum += 1;
                            win += 1;
                            yourHand = 0;
                            choiceLoop = false;
                            break;
                        }else if (dealerHand == yourHand){
                            System.out.println("It's a tie! No one wins!");
                            gameNum += 1;
                            tie += 1;
                            yourHand = 0;
                            choiceLoop = false;
                            break;
                        }else if (dealerHand > yourHand && dealerHand <= 21){
                            System.out.println("Dealer wins!");
                            gameNum += 1;
                            lose += 1;
                            yourHand = 0;
                            choiceLoop = false;
                            break;
                        }else if (dealerHand < yourHand){  // you win since your hand was bigger than the dealers but under 21
                            System.out.println("You win!");
                            gameNum += 1;
                            win += 1;
                            yourHand = 0;
                            choiceLoop = false;
                            break;
                        }break;
                    case 3:
                        System.out.println("Number of Player wins: " + win);
                        System.out.println("Number of Dealer wins: " + lose);
                        System.out.println("Number of tie games: " + tie);
                        System.out.println("Total # of games played is: " + gameNum);
                        System.out.print("Percentage of Player wins: ");
                        System.out.printf("%.1f" , ((float)win/(float)gameNum)*100);
                        System.out.print("%\n");
                        break;
                    case 4:
                        menuLoop = false;
                        choiceLoop = false;// these 2 breaks end the code by ending the while loops
                        break;
                    default:
                        System.out.println("Invalid input!\nPlease enter an integer value between 1 and 4.");
                }
            }
            choiceLoop = true;
        }
    }
}
