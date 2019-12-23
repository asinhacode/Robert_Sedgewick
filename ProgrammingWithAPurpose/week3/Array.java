// all about arrays
package week3;

public class Arrays 
{

	public static void main(String[] args)
	{
		String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",};
		String[] suit = {"♠", "♣", "♦", "♥"};
		
		String[] deck = new String[52];
		String[] without = new String[52];
		
			for(int i = 0; i < (rank.length); i++)
			{
				for(int j = 0; j < suit.length; j++)
				{
					deck[i + 13*j] = " " + rank[i]+ " "+suit[j];
					without[i + 13*j] = " " + rank[i]+ " "+suit[j];

				}
			}
			
			for(int k = 0; k < deck.length; k++)
			{
				if(k % 13 == 0)
					System.out.println();
				
				System.out.print(deck[k]);
			}
			System.out.println();
			System.out.println();

		/*
		 * for(int l = 0; l < 15; l++) { System.out.print(deck[(int) (Math.random() *
		 * 52)] + " "); // with replacement // can get the same card twice BORING }
		 */
			
			for(int l = 0; l < 15; l++)
			{
				int z =(int) (Math.random() * (52 - l));
				
				String temp = without[z];
				without[z] = without[l];
				without[l] = temp;
			}
			
			for(int l = 0; l < 15; l++)
			{
				System.out.print(without[(int) (Math.random() * 52)] + " "); // with replacement
				// can get the same card twice BORING
			}
	}

}
