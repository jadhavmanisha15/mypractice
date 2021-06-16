package Basic;

public class Firstprog {

	public static void main(String[] args) {
	/*	//immutable nature
	 String s1="ratan";
	 s1.concat("soft");
	 System.out.println(s1.toString());         //ratan
	 */
	 
	 String s1=new String();
	 System.out.println(s1);
		
	 
	 //mutable nature
	 
	 StringBuffer sb=new StringBuffer("durga");
     sb.append("soft");
	 System.out.println(sb);          //durgasoft

	}

}
