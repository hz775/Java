import java.util.Scanner;
public class NoOfChocolates{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int noofchocolates=sc.nextInt();
		int noOfChildrens=sc.nextInt();
		double NumberofChocolates=noOfChildrens/noofchocolates;
		double NumberofChocolatesremains=noOfChildrens%noofchocolates;
		System.out.println("The number of Chocolates each child gets is "+NumberofChocolates+"and the number of remaining chocolates are "+NumberofChocolatesremains);
	}
}