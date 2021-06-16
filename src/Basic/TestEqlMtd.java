package Basic;

public class TestEqlMtd {
	TestEqlMtd(String str){}
	public static void main(String[] args) {
		
		//objectclass----->Referance compa
		TestEqlMtd t1=new TestEqlMtd("anu");
		TestEqlMtd t2=new TestEqlMtd("anu");
		System.out.println(t1.equals(t2));
		
		//string class------>content comp
		String s1="ratan";
		String s2="ratan";
		System.out.println(s1.equals(s2));
		
		//String Buffer is not overiding it uses object class equal mtd---->ref comp
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb1.equals(sb2));
		
	}

}
