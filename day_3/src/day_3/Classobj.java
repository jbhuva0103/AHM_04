package day_3;
import java.util.*;
public class Classobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c1=new Calculator();
Scanner sc=new Scanner(System.in);
System.out.println("enter n1");
int n1=sc.nextInt();
c1.setNo(n1);

System.out.println("enter n2");
int n2=sc.nextInt();
c1.setNo1(n2);

System.out.println("addition: "+c1.getAdd());
System.out.println("addition: "+c1.getAbs());
System.out.println("addition: "+c1.getMul());
System.out.println("addition: "+c1.getDiv());


//c1.setNo(34);
//System.out.println(c1.toString());
	}

}
