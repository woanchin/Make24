import java.util.*;
import java.util.Scanner;

public class Make24 {
	double first, sec, third, fourth;
	String answer;
	
	public void main(String arg0) {
		Scanner sc = new Scanner(System.in);
		first = sc.nextDouble(); 
		sec = sc.nextDouble();
		third = sc.nextDouble();
		fourth = sc.nextDouble();
		
		System.out.print(answer);
	}
	
	public String calculate(double a, double b, double c, double d) {
		// addition
		if (a + b + c + d == 24) answer += a + " + " + b + " + " + c + " + " + d + "\n";
		if (a + b + c - d == 24) answer += a + " + " + b + " + " + c + " - " + d + "\n";
		if (a + b + c * d == 24) answer += a + " + " + b + " + " + c + " * " + d + "\n";
		if (a + b + c / d == 24) answer += a + " + " + b + " + " + c + " / " + d + "\n";	
		if (a + b - c + d == 24) answer += a + " + " + b + " - " + c + " + " + d + "\n";
		if (a + b - c - d == 24) answer += a + " + " + b + " - " + c + " - " + d + "\n";
		if (a + b - c * d == 24) answer += a + " + " + b + " - " + c + " * " + d + "\n";
		if (a + b - c / d == 24) answer += a + " + " + b + " - " + c + " / " + d + "\n";
		
		if (a + b * c + d == 24) answer += a + " + " + b + " * " + c + " + " + d + "\n";
		if (a + b * c - d == 24) answer += a + " + " + b + " * " + c + " - " + d + "\n";
		if (a + b * c * d == 24) answer += a + " + " + b + " * " + c + " * " + d + "\n";
		if (a + b * c / d == 24) answer += a + " + " + b + " * " + c + " / " + d + "\n";
		
		if (a + b / c + d == 24) answer += a + " + " + b + " / " + c + " + " + d + "\n";
		if (a + b / c - d == 24) answer += a + " + " + b + " / " + c + " - " + d + "\n";
		if (a + b / c * d == 24) answer += a + " + " + b + " / " + c + " * " + d + "\n";
		if (a + b / c / d == 24) answer += a + " + " + b + " / " + c + " / " + d + "\n";
		
		// subtraction
		if (a - b + c + d == 24) answer += a + " - " + b + " + " + c + " + " + d + "\n";
		if (a - b + c - d == 24) answer += a + " - " + b + " + " + c + " - " + d + "\n";
		if (a - b + c * d == 24) answer += a + " - " + b + " + " + c + " * " + d + "\n";
		if (a - b + c / d == 24) answer += a + " - " + b + " + " + c + " / " + d + "\n";
		
		if (a - b - c + d == 24) answer += a + " - " + b + " - " + c + " + " + d + "\n";
		if (a - b - c - d == 24) answer += a + " - " + b + " - " + c + " - " + d + "\n";
		if (a - b - c * d == 24) answer += a + " - " + b + " - " + c + " * " + d + "\n";
		if (a - b - c / d == 24) answer += a + " - " + b + " - " + c + " / " + d + "\n";
		
		if (a - b * c + d == 24) answer += a + " - " + b + " * " + c + " + " + d + "\n";
		if (a - b * c - d == 24) answer += a + " - " + b + " * " + c + " - " + d + "\n";
		if (a - b * c * d == 24) answer += a + " - " + b + " * " + c + " * " + d + "\n";
		if (a - b * c / d == 24) answer += a + " - " + b + " * " + c + " / " + d + "\n";
		
		if (a - b / c + d == 24) answer += a + " - " + b + " / " + c + " + " + d + "\n";
		if (a - b / c - d == 24) answer += a + " - " + b + " / " + c + " - " + d + "\n";
		if (a - b / c * d == 24) answer += a + " - " + b + " / " + c + " * " + d + "\n";
		if (a - b / c / d == 24) answer += a + " - " + b + " / " + c + " / " + d + "\n";
		
		// multiplication
		if (a * b + c + d == 24) answer += a + " * " + b + " + " + c + " + " + d + "\n";
		if (a * b + c - d == 24) answer += a + " * " + b + " + " + c + " - " + d + "\n";
		if (a * b + c * d == 24) answer += a + " * " + b + " + " + c + " * " + d + "\n";
		if (a * b + c / d == 24) answer += a + " * " + b + " + " + c + " / " + d + "\n";
		
		if (a * b - c + d == 24) answer += a + " * " + b + " - " + c + " + " + d + "\n";
		if (a * b - c - d == 24) answer += a + " * " + b + " - " + c + " - " + d + "\n";
		if (a * b - c * d == 24) answer += a + " * " + b + " - " + c + " * " + d + "\n";
		if (a * b - c / d == 24) answer += a + " * " + b + " - " + c + " / " + d + "\n";
		
		if (a * b * c + d == 24) answer += a + " * " + b + " * " + c + " + " + d + "\n";
		if (a * b * c - d == 24) answer += a + " * " + b + " * " + c + " - " + d + "\n";
		if (a * b * c * d == 24) answer += a + " * " + b + " * " + c + " * " + d + "\n";
		if (a * b * c / d == 24) answer += a + " * " + b + " * " + c + " / " + d + "\n";
		
		if (a * b / c + d == 24) answer += a + " * " + b + " / " + c + " + " + d + "\n";
		if (a * b / c - d == 24) answer += a + " * " + b + " / " + c + " - " + d + "\n";
		if (a * b / c * d == 24) answer += a + " * " + b + " / " + c + " * " + d + "\n";
		if (a * b / c / d == 24) answer += a + " * " + b + " / " + c + " / " + d + "\n";
		
		// division
		if (a / b + c + d == 24) answer += a + " / " + b + " + " + c + " + " + d + "\n";
		if (a / b + c - d == 24) answer += a + " / " + b + " + " + c + " - " + d + "\n";
		if (a / b + c * d == 24) answer += a + " / " + b + " + " + c + " * " + d + "\n";
		if (a / b + c / d == 24) answer += a + " / " + b + " + " + c + " / " + d + "\n";
		
		if (a / b - c + d == 24) answer += a + " / " + b + " - " + c + " + " + d + "\n";
		if (a / b - c - d == 24) answer += a + " / " + b + " - " + c + " - " + d + "\n";
		if (a / b - c * d == 24) answer += a + " / " + b + " - " + c + " * " + d + "\n";
		if (a / b - c / d == 24) answer += a + " / " + b + " - " + c + " / " + d + "\n";
		
		if (a / b * c + d == 24) answer += a + " / " + b + " * " + c + " + " + d + "\n";
		if (a / b * c - d == 24) answer += a + " / " + b + " * " + c + " - " + d + "\n";
		if (a / b * c * d == 24) answer += a + " / " + b + " * " + c + " * " + d + "\n";
		if (a / b * c / d == 24) answer += a + " / " + b + " * " + c + " / " + d + "\n";
		
		if (a / b / c + d == 24) answer += a + " / " + b + " / " + c + " + " + d + "\n";
		if (a / b / c - d == 24) answer += a + " / " + b + " / " + c + " - " + d + "\n";
		if (a / b / c * d == 24) answer += a + " / " + b + " / " + c + " * " + d + "\n";
		if (a / b / c / d == 24) answer += a + " / " + b + " / " + c + " / " + d + "\n";
		
		return answer;
	}
}
