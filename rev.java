package rev;
import java.util.Scanner;
public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the sentences");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		StringBuffer s2=new StringBuffer(a).reverse();
		System.out.println(s2);
		String b=s.next();
		StringBuffer s3=new StringBuffer(b).reverse();
		System.out.println(s3);

	}

}
