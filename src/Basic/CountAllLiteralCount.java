package Basic;

public class CountAllLiteralCount 
{

	public static void main(String[] args)
	{
		String str="i am manisha i am tester";

		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)!=' ')
			{
				int count = 0;
				char c = 0;
				for (int j = 0; j < str.length(); j++) 
				{
					if(str.charAt(i)==(str.charAt(j)))
					{
						count++; 
					}
//					if(count>))
//					{
//						
//					}
				}
				//System.out.println(str.charAt(i)+" count is:"+count); 
			}
		}
	}
}
