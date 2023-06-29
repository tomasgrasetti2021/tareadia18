package ejemplo;
import java.util.Scanner;
public class arrays3 {
public static void main(String[] args) {
	Scanner en = new Scanner(System.in);
	
	System.out.println("ingrese un numero: ");
	int numero = en.nextInt();
	//int numero= 5 ;
	int suma = 1;
	int i = 1;
	
	
	do {
		suma = suma * i; i++;
	}while( i <= numero);
	System.out.println("el factorial es: " + suma);
	}
	
	

}
