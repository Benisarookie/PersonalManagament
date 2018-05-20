package Personal;

abstract class P{
	public abstract void set(int a,String b,int c,String d,String s);
}

public class Person extends P{
	private int number,age;
	private String sex,name,phone;
	public Person(){}
	public void set(int nu,String na,int a,String ph,String s) {
		this.number=nu;this.age=a;
		this.name=na;this.phone=ph;sex=s;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("number:"+number+"  name:"+name+"  sex:"+sex+"  age:"+age+"  phone:"+phone);
		return sb.toString();
	}
	public void rewrite(int nu,String na,int a,String ph,String s) {
		this.number=nu;this.age=a;
		this.name=na;this.phone=ph;sex=s;
	}
	public int find(int n) {
		return number;
	}
	public String find(String na) {
		return  name;
	}
}
