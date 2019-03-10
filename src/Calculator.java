import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		Double a = sc.nextDouble();
		System.out.print("Ingrese el segundo numero: ");
		Double b = sc.nextDouble();
		System.out.println("Seleccione que desea hacer con ambos numeros.\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Potencia");
		System.out.print("Escoja la opcion que desee: ");
		int op = sc.nextInt();
		
		if(op==1) {
			System.out.println("La suma de "+a+" + "+b+" es "+(a+b));
		}else if(op==2) {
			System.out.println("La resta de "+a+" - "+b+" es "+(a-b));
		}else if(op==3) {
			System.out.println("La multiplicacion de "+a+" * "+b+" es "+(a*b));
		}else if(op==4) {
			System.out.println("La division de "+a+" / "+b+" es "+(a/b));
		}else if(op==5) {
			System.out.println(a+" elevado a "+b+" es igual a: "+Math.pow(a, b));
		}else {
			System.out.println("Error");
		}
	}

}
