package Personal;
import java.util.*;
import java.util.Scanner;
public class Important {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		Iterator<Person> iter=list.iterator();
		Mangament m=new Mangament();
		m.Interfacial();
		Scanner set=new Scanner(System.in);
		int nu,n;
		while(set.hasNext()) {
			n=set.nextInt();
			if(n==5) {
				System.out.println("Output success!");
				break;
			}
			if(n==1) {
			  Person hum=new Person();
			  hum.set(m.number(),m.name(),m.age(),m.phone(),m.sex());//int nu,String na,int a,String ph,String s
			  list.add(hum);
			  System.out.println("Set Success!");
			}
			if(n==2) {
				System.out.print("Please input number that you want to know:");
				while(set.hasNext()) {
					nu=set.nextInt();
					if(iter.hasNext()&&list.size()>=nu-1) {
						System.out.println("**********Find Result**********");
						System.out.println(list.get(nu-1).toString());
						break;
					}
					else
						System.out.println("No Find,Please input again:");
				}
			}
			if(n==3) {
				System.out.print("Please input number that you want to delete:");
				nu=set.nextInt();list.remove(nu-1);
			}
			if(n==4) {
				System.out.print("Please input number that you want to modification:");
				nu=set.nextInt();
				list.get(nu-1).rewrite(m.number(),m.name(),m.age(),m.phone(),m.sex());
			}
			System.out.println();
			m.Interfacial();
		}
		set.close();
	}
}
