package ejemplo;
import java.util.Scanner;
public class array1 {
public static void main(String[] args) {
	Scanner en =  new Scanner(System.in);
	
	int num;
	do {
		System.out.println(" ingresa numero: ");
		num = en.nextInt();
		if (num > -5 && num <5) {
			break;
		}
	}while (true);
	System.out.println("no");
}
}
