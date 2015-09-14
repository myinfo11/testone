package fifthWeekHomeWork;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i=i+2)
		{
			for(int j=5;j>i;j=j-2) //prints Space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) //Prints *
			{
			System.out.print("*");
			}
	      System.out.println();
		}  //First 3 rows completed
	for(int i=1;i<5;i=i+2)         //Following is for remaining two rows
	{
		for(int j=1;j<=i;j=j+2)
		{
			System.out.print(" ");
		}
		for(int k=3;k>=i;k--)
		{
			System.out.print("*");
		}
	System.out.println();
	}
	}

}
