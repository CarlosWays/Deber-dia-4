import java.util.Scanner;
public class Calcularprimo{
	public static void main (String []args){
		int num;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		num=lee.nextInt();
		Numprimo obj= new Numprimo(num);
		obj.CalculoPrimo();
	}
}