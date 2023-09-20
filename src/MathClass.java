import java.util.Scanner;

public class MathClass {

    Scanner scanner = new Scanner(System.in);


		System.out.println("Eneter side x: ");
    double x = scanner.nextDouble();
		System.out.println("Eneter side y: ");
    double y = scanner.nextDouble();


    double z = Math.sqrt((x * x) + (y * y));

		System.out.println("The hypotenuse is :"+" "+z);

		scanner.close();
}
