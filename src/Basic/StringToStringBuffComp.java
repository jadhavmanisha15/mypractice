package Basic;

public class StringToStringBuffComp {

	public static void main(String[] args) {
		String s1="manisha";
		StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.reverse());
        
        
        StringBuffer sb1=new StringBuffer("manisha");
          String ss=sb1.toString();
          System.out.println(ss);
        
	}

}
