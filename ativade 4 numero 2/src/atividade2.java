import java.util.Scanner;

public class numero2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println("Digite os lados do triangulo");
		lado1 = input.nextDouble();
		lado2 = input.nextDouble();
		lado3 = input.nextDouble();
		
		
		if (lado1 == lado2 && lado2 == lado3)
			System.out.println("Isosceles");
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
		System.out.println("Equilatero");
		else
			System.out.println("Escaleno");
		
			
	}

}
