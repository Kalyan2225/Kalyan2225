package pr;

public class PatternCounter {
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			if(j+i>=8)
			{
				System.out.print("*");
				
			}
			else
			{
				System.out.print(" ");
				
			}
			
			
		}
		System.out.println();
		
		
	}
}

}
