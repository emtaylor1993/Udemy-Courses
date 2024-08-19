/**
 * TIC TAC TOE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates a game of tic tac toe.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class TicTacToe {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nLet's play tic tac toe");
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };
        int[] spot = new int[2];

        printBoard(board);
        
        for (int i = 0; i < 9; i++) { 
            if (i % 2 == 0) {
                System.out.println("Turn: X");
                spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
                printBoard(board);
                if (checkWin(board) == 3) {
                    System.out.print("X wins.");
                    break;
                }
            } else if (i % 2 != 0) {
                System.out.println("Turn: O");
                spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
                printBoard(board);
                if (checkWin(board) == -3) {
                  System.out.print("O wins.");
                  break;
                }
            }
        }

        if (checkWin(board) != 3 || checkWin(board) != 3) {
            System.out.println("It's a tie!");
        }

        scan.close();
    }

    /**
     * Function Name - printBoard()
     * @param board (char[][])
     * 
     * Inside the Function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */
    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    /**
     * Function Name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the Function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     */
    public static int[] askUser(char[][] board) {
        System.out.print("- Pick a row and column number: ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[] spot = {row, col};

        while (board[row][col] != '_') {
            System.out.print("- Spot taken, try again: ");
            row = scan.nextInt();
            col = scan.nextInt();
            spot[0] = row;
            spot[1] = col;
        }

        return spot;
    }

    /**
     * Function Name - checkWin 
     * @param board  (char[][])
     * @return count (int)
     * 
     * Inside the Function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char[][] board) {
        int rows = checkRows(board);
        if (Math.abs(rows) == 3) return rows;

        int columns = checkColumns(board);
        if (Math.abs(columns) == 3) return columns; 

        int leftDiagonal = checkLeft(board);
        if (Math.abs(leftDiagonal) == 3) return leftDiagonal;

        int rightDiagonal = checkRight(board);
        if (Math.abs(rightDiagonal) == 3) return rightDiagonal;    

        return 0;
    }

    /**
     * Function Name - checkRows
     * @param board  (char[][])
     * @return count (int)
     * 
     * Inside the Function:
     *  1. Check each row for a match of 3.
     */
    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                break;
            } 
            count = 0;
        }

        return count;
    }
    
    /**
     * Function Name - checkColumns
     * @param board  (char[][])
     * @return count (int)
     * 
     * Inside the Function:
     *  1. Check each column for a match of 3.
     */
    public static int checkColumns(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                break;
            }
            count = 0;
        }
        
        return count;
    }
    
    /**
     * Function Name - checkLeft
     * @param board  (char[][] board)
     * @return count (int)
     * 
     * Inside the Function:
     *  1. Check whether the left diagonal has a match of 3.
     */
    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }
        }
        return count;
    }
    
    /**
     * Function Name - checkRight
     * @param board
     * @return
     * 
     * Inside the Function:
     *  1. Check whether the right diagonal has a match of 3.
     */
    public static int checkRight(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[(board.length - 1) - i][i] == 'X') {
                count++;
            } else if (board[(board.length - 1) - i][i] == 'O') {
                count--;
            }
        }
        return count;
    }  
}
