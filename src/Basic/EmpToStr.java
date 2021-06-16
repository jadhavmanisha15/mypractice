package Basic;

public class EmpToStr {
	//instance variable
int eid;
String ename;
EmpToStr(int eid,String ename)
{
  this.eid=eid;
  this.ename=ename;
}
public String toString()
{
	return "emp id="+eid+"ename="+ename;
	
}
public static void main(String[] args)
{
	EmpToStr e=new EmpToStr(11,"gfg");
	System.out.println(e);
	System.out.println(e.toString());
	
	}
}