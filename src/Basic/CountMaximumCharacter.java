package Basic;

public class CountMaximumCharacter {

	public static void main(String[] args) {
     String str="today is monday";
     int count=0;
     for (char ch : str.toCharArray()) {
    	 if(ch=='a')
    	 {    	
			count++; 
    	 }
		
	}
     System.out.println("count:"+count);
	}

}
