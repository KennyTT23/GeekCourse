import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    private static char[][] gameMap;
    public static Scanner sc = new Scanner(System.in);

    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        makeGameMap(5, 5);
        printGameMap();
        int count = 0;
        while (true) {
            humanTurn();
            count++;
            printGameMap();
            if (chekWin(X_DOT)) {
                System.out.println("You WIN!!!");
                break;
            }

            if (count == gameMap.length * gameMap[0].length) {
                System.out.println("It is a DRAW");
            }

            computeTurn();
            count++;
            printGameMap();
            if (chekWin(O_DOT)) {
                System.out.println("Sorry but you looser, computer WIN -((( ");
            }

            if (count == gameMap.length * gameMap[0].length) {
                System.out.println("-))) FRIENDLY WIN -)))");
            }

        }
    }

    private static boolean chekWin(char c) {

        int maxCheck = gameMap[0].length - 4;

        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < maxCheck + 1; j++) {
                if (gameMap[i][j] == c && gameMap[i][j + 1] == c && gameMap[i][j + 2] == c && gameMap[i][j + 3] == c) {
                }
                if (gameMap[j][i] == c && gameMap[j + 1][i] == c && gameMap[j + 2][i] == c && gameMap[j + 3][i] == c) {
                }
                if (i < (maxCheck + 1) && gameMap[i][j] == c && gameMap[i + 1][j + 1] == c && gameMap[i + 2][j + 2] == c && gameMap[i + 3][j + 3] == c) {
                }


            }
        }
        return false;
    }
//            if (gameMap[0][0] == c && gameMap[0][1] == c && gameMap[0][2] == c) {
//                return true;
//            }
//            if (gameMap[1][0] == c && gameMap[1][1] == c && gameMap[1][2] == c) {
//                return true;
//            }
//            if (gameMap[2][0] == c && gameMap[2][1] == c && gameMap[2][2] == c) {
//                return true;
//            }
//
//            if (gameMap[0][0] == c && gameMap[1][0] == c && gameMap[2][0] == c) {
//                return true;
//            }
//            if (gameMap[0][1] == c && gameMap[1][1] == c && gameMap[2][1] == c) {
//                return true;
//            }
//            if (gameMap[0][2] == c && gameMap[1][2] == c && gameMap[2][2] == c) {
//                return true;
//            }
//
//            if (gameMap[0][0] == c && gameMap[1][1] == c && gameMap[2][2] == c) {
//                return true;
//            }
//            if (gameMap[0][2] == c && gameMap[1][1] == c && gameMap[2][0] == c) {
//                return true;
//            }
//
//            return false;

        private static void computeTurn () {
            System.out.println("Computer is not a human, computer is thinking");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            int x, y;
            boolean checkCell;
            Random random = new Random();
            do {
                x = random.nextInt(gameMap.length);
                y = random.nextInt(gameMap.length);
                checkCell = isValidCell(x, y);
            } while (!checkCell);
            gameMap[x][y] = O_DOT;
        }

        private static void humanTurn () {
            int x = -1;
            int y = -1;
            boolean checkCell;
            do {
                System.out.println("Enter the coordinates X Y");
                if (sc.hasNextInt()) {
                    x = sc.nextInt() - 1;
                }
                if (sc.hasNextInt()) {
                    y = sc.nextInt() - 1;
                }
                checkCell = isValidCell(x, y);
                sc.nextLine();
            } while (!checkCell);
            gameMap[x][y] = X_DOT;
        }

        private static boolean isValidCell ( int x, int y){
            if (x < 0 || y < 0 || x > gameMap.length || y > gameMap[0].length) {
                return false;
            }
            return gameMap[x][y] == EMPTY_DOT;
        }

        private static void printGameMap () {
            for (int i = 0; i < gameMap.length; i++) {
                for (int j = 0; j < gameMap[i].length; j++) {
                    System.out.print(gameMap[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        private static void makeGameMap ( int length, int width){
            if (length < 5 || width < 5) {
                System.out.println("not right one, sorry ");
                System.exit(0);
            }
            gameMap = new char[length][width];
            for (int i = 0; i < gameMap.length; i++) {
                for (int j = 0; j < gameMap[i].length; j++) {
                    gameMap[i][j] = EMPTY_DOT;
                }
            }
        }
    }