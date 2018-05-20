package Personal;
import java.util.Scanner;
public class Mangament {
	Scanner set=new Scanner(System.in);
	public void Interfacial() {
		System.out.println("**********PersonalManagamengt**********");
		System.out.println("           1.Input");
		System.out.println("           2.Find");
		System.out.println("           3.Delete");
		System.out.println("           4.Modification");
		System.out.println("           5.Output");
		System.out.println("***************************************");
	}
	public String name() {
		String n;
		System.out.print("Please input name:");
		n=set.next();
		return n;
	}
	public int number() {
		int n;
		System.out.print("Please input number:");
		n=set.nextInt();
		return n;
	}
	public int age() {
		int n;
		System.out.print("Please input age:");
		n=set.nextInt();
		return n;
	}
	public String phone() {
		String n;
		System.out.print("Please input phone:");
		n=set.next();
		return n;
	}
	public String sex() {
		String n;
		System.out.print("Please input sex:");
		n=set.next();
		return n;
	}

}
