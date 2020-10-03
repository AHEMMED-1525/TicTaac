import java.util.Scanner;

public class TicTacToe
{
	char[] gameBoard = new char[10];
	int index;
	
	Scanner input = new Scanner(System.in);
		/* User Case 1*/
		public void initializBoard() // Initializing the board
		{
			for(index = 1; index<10 ; index++)
			{
				gameBoard[index] = '-';
			}
		}

		public static void main(String args[])
		{
			TicTacToe game = new  TicTacToe();
			game.initializBoard();

		}
}
