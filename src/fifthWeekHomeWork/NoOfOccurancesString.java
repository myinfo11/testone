package fifthWeekHomeWork;

public class NoOfOccurancesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,charmatchcount=0,totalcount=0;
		String string="welcome to testleaf";
		int stringlength=string.length();
		for(i=0;i<stringlength;i++)
		{
		char c=new Character(string.charAt(i));
		charmatchcount=0;
			for(j=0;j<stringlength;j++)
			{
				if(c==string.charAt(j))
				{
					charmatchcount++;
				}
			} 
		System.out.println(" No of occurancess of letter "+c + " is " +charmatchcount);
		totalcount=totalcount+charmatchcount;	
		}
	System.out.println("total match count = " + totalcount);
	}

}
