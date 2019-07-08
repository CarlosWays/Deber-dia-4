import java.util.Scanner;
public class Calcularpoi{
	public static void main (String []args){
		int num;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		num=lee.nextInt();
		Parimpar obj= new Parimpar(num);
		obj.Calculo();
	}
}