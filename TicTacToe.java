import java.util.Scanner;

public class TicTacToe
{
	char[] gameBoard = new char[10];
	int index;
	
	Scanner input = new Scanner(System.in);
		/* User Case 1*/
		public void initializBoard()
		{
			for(index = 1; index<10 ; index++)
			{
				gameBoard[index] = '-';
			}
		}
		/* UserCase 2 */
		public void readPlayer()
		{
			String computerChar;
			System.out.println("Enter a character X or O ");
			String playerChoice = input.nextLine();
			if (playerChoice.equals("X"))
			{
				System.out.println("user has written X");
				computerChar = "O";
				System.out.println(" computer has " +computerChar);
				
			}
			else
			{
				System.out.println("user has written O");
				computerChar = "X";
				System.out.println("computer has " + computerChar);
			}
			input.close();
			
		}
		/* User case 3*/
		public void showBoard()
		{
			System.out.println(" The board is \n");
			System.out.println(gameBoard[1]+ " | " + gameBoard[2] + " | "+ gameBoard[3]);
			System.out.println(gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6]);
			System.out.println(gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9]);
			
		}
		public static void main(String args[])
		{
			TicTacToe game = new  TicTacToe();
			game.initializBoard();
				
			game.showBoard();
		}
}
