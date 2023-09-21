package day_3;

public class Calculator {
private int no,no1;
String sname;

@Override
public String toString() {
	return "Calculator [no=" + no + ", no1=" + no1 + ", sname=" + sname + "]";
}

public int getNo1() {
	return no1;
}

public void setNo1(int no1) {
	this.no1 = no1;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}
public int getAdd() {
	return(no+no1);
}
public int getAbs() {
	return (no-no1);
}
public int getMul() {
	return(no*no1);
}
public int getDiv() {
	return(no/no1);
}
}
