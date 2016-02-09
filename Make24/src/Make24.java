import java.util.*;
import java.util.Scanner;

public class Make24 {
	static double first, sec, third, fourth;
	static String answer = "";
	
	public static void main(String[] arg0) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			first = (double) sc.nextDouble(); 
			sec = (double) sc.nextDouble();
			third = (double) sc.nextDouble();
			fourth = (double) sc.nextDouble();
			
			
			calculate(first, sec, third, fourth);
			calculate(first, sec, fourth, third);
			calculate(first, third, sec, fourth);
			calculate(first, third, fourth, sec);
			calculate(first, fourth, sec, third);
			calculate(first, fourth, third, sec);
			calculate(sec, first, third, fourth);
			calculate(sec, first, fourth, third);
			calculate(sec, third, first, fourth);
			calculate(sec, third, fourth, first);
			calculate(sec, fourth, first, third);
			calculate(sec, fourth, third, first);
			calculate(third, first, sec, fourth);
			calculate(third, first, fourth, sec);
			calculate(third, sec, first, fourth);
			calculate(third, sec, fourth, first);
			calculate(third, fourth, first, sec);
			calculate(third, fourth, sec, first);
			calculate(fourth, first, sec, third);
			calculate(fourth, first, third, sec);
			calculate(fourth, sec, first, third);
			calculate(fourth, sec, third, first);
			calculate(fourth, third, first, sec);
			calculate(fourth, third, sec, first);
			
			System.out.println("" + first + " " + sec + " " + third + " " + fourth);
			if (answer.equals("")) {
				System.out.print("NA\n");
			} else {
				System.out.print(answer);
			}
		}
	}
	
	public static String calculate(double a, double b, double c, double d) {
		//corner cases
		
		//(2 brackets)
		if ((a + b) * (c + d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " + " + d + " )\n";
		if ((a + b) * (c - d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " - " + d + " )\n";
		if ((a + b) * (c * d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " * " + d + " )\n";
		if ((a + b) * (c / d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " / " + d + " )\n";
		
		if ((a - b) * (c + d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " + " + d + " )\n";
		if ((a - b) * (c - d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " - " + d + " )\n";
		if ((a - b) * (c * d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " * " + d + " )\n";
		if ((a - b) * (c / d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " / " + d + " )\n";
		
		if ((a * b) * (c + d) == 24) answer += "( " + a + " * " + b + " ) * ( " + c + " + " + d + " )\n";
		if ((a * b) * (c - d) == 24) answer += "( " + a + " * " + b + " ) * ( " + c + " - " + d + " )\n";
		
		if ((a / b) * (c + d) == 24) answer += "( " + a + " / " + b + " ) * ( " + c + " + " + d + " )\n";
		if ((a / b) * (c - d) == 24) answer += "( " + a + " / " + b + " ) * ( " + c + " - " + d + " )\n";
		
		if ((a + b) / (c + d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " + " + d + " )\n";
		if ((a + b) / (c - d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " - " + d + " )\n";
		if ((a + b) / (c * d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " * " + d + " )\n";
		if ((a + b) / (c / d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " / " + d + " )\n";
		
		if ((a - b) / (c + d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " + " + d + " )\n";
		if ((a - b) / (c - d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " - " + d + " )\n";
		if ((a - b) / (c * d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " * " + d + " )\n";
		if ((a - b) / (c / d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " / " + d + " )\n";
		
		if ((a * b) / (c + d) == 24) answer += "( " + a + " * " + b + " ) / ( " + c + " + " + d + " )\n";
		if ((a * b) / (c - d) == 24) answer += "( " + a + " * " + b + " ) / ( " + c + " - " + d + " )\n";
		
		if ((a / b) / (c + d) == 24) answer += "( " + a + " / " + b + " ) / ( " + c + " + " + d + " )\n";
		if ((a / b) / (c - d) == 24) answer += "( " + a + " / " + b + " ) / ( " + c + " - " + d + " )\n";
		
		//(1 bracket = '+')
		if ((a + (b + c) + d) == 24) answer += a + " + (" + b + " + " + c + ") + " + d + "\n";
		if ((a + (b + c) - d) == 24) answer += a + " + (" + b + " + " + c + ") - " + d + "\n";
		if ((a + (b + c) * d) == 24) answer += a + " + (" + b + " + " + c + ") * " + d + "\n";
		if ((a + (b + c) / d) == 24) answer += a + " + (" + b + " + " + c + ") / " + d + "\n";
		
		if ((a - (b + c) + d) == 24) answer += a + " - (" + b + " + " + c + ") + " + d + "\n";
		if ((a - (b + c) - d) == 24) answer += a + " - (" + b + " + " + c + ") - " + d + "\n";
		if ((a - (b + c) * d) == 24) answer += a + " - (" + b + " + " + c + ") * " + d + "\n";
		if ((a - (b + c) / d) == 24) answer += a + " - (" + b + " + " + c + ") / " + d + "\n";
		
		if ((a * (b + c) + d) == 24) answer += a + " * (" + b + " + " + c + ") + " + d + "\n";
		if ((a * (b + c) - d) == 24) answer += a + " * (" + b + " + " + c + ") - " + d + "\n";
		if ((a * (b + c) * d) == 24) answer += a + " * (" + b + " + " + c + ") * " + d + "\n";
		if ((a * (b + c) / d) == 24) answer += a + " * (" + b + " + " + c + ") / " + d + "\n";
		
		if ((a / (b + c) + d) == 24) answer += a + " / (" + b + " + " + c + ") + " + d + "\n";
		if ((a / (b + c) - d) == 24) answer += a + " / (" + b + " + " + c + ") - " + d + "\n";
		if ((a / (b + c) * d) == 24) answer += a + " / (" + b + " + " + c + ") * " + d + "\n";
		if ((a / (b + c) / d) == 24) answer += a + " / (" + b + " + " + c + ") / " + d + "\n";
		
		//(1 bracket = '-')
		if ((a + (b - c) + d) == 24) answer += a + " + (" + b + " - " + c + ") + " + d + "\n";
		if ((a + (b - c) - d) == 24) answer += a + " + (" + b + " - " + c + ") - " + d + "\n";
		if ((a + (b - c) * d) == 24) answer += a + " + (" + b + " - " + c + ") * " + d + "\n";
		if ((a + (b - c) / d) == 24) answer += a + " + (" + b + " - " + c + ") / " + d + "\n";
		
		if ((a - (b - c) + d) == 24) answer += a + " - (" + b + " - " + c + ") + " + d + "\n";
		if ((a - (b - c) - d) == 24) answer += a + " - (" + b + " - " + c + ") - " + d + "\n";
		if ((a - (b - c) * d) == 24) answer += a + " - (" + b + " - " + c + ") * " + d + "\n";
		if ((a - (b - c) / d) == 24) answer += a + " - (" + b + " - " + c + ") / " + d + "\n";
		
		if ((a * (b - c) + d) == 24) answer += a + " * (" + b + " - " + c + ") + " + d + "\n";
		if ((a * (b - c) - d) == 24) answer += a + " * (" + b + " - " + c + ") - " + d + "\n";
		if ((a * (b - c) * d) == 24) answer += a + " * (" + b + " - " + c + ") * " + d + "\n";
		if ((a * (b - c) / d) == 24) answer += a + " * (" + b + " - " + c + ") / " + d + "\n";
		
		if ((a / (b - c) + d) == 24) answer += a + " / (" + b + " - " + c + ") + " + d + "\n";
		if ((a / (b - c) - d) == 24) answer += a + " / (" + b + " - " + c + ") - " + d + "\n";
		if ((a / (b - c) * d) == 24) answer += a + " / (" + b + " - " + c + ") * " + d + "\n";
		if ((a / (b - c) / d) == 24) answer += a + " / (" + b + " - " + c + ") / " + d + "\n";
		
		//one bracket = '3 numbers in the bracket'
		if ((a + b * c) * d == 24) answer += "(" + a + " + " + b + " * " + c + ") * " + d + "\n";
		if ((a + b / c) * d == 24) answer += "(" + a + " + " + b + " / " + c + ") * " + d + "\n";
		if ((a + b * c) / d == 24) answer += "(" + a + " + " + b + " * " + c + ") / " + d + "\n";
		if ((a + b / c) / d == 24) answer += "(" + a + " + " + b + " / " + c + ") / " + d + "\n";
		
		if ((a - b * c) * d == 24) answer += "(" + a + " - " + b + " * " + c + ") * " + d + "\n";
		if ((a - b / c) * d == 24) answer += "(" + a + " - " + b + " / " + c + ") * " + d + "\n";
		if ((a - b * c) / d == 24) answer += "(" + a + " - " + b + " * " + c + ") / " + d + "\n";
		if ((a - b / c) / d == 24) answer += "(" + a + " - " + b + " / " + c + ") / " + d + "\n";
		
		if ((a * b + c) * d == 24) answer += "(" + a + " * " + b + " + " + c + ") * " + d + "\n";
		if ((a * b - c) * d == 24) answer += "(" + a + " * " + b + " - " + c + ") * " + d + "\n";
		if ((a * b + c) / d == 24) answer += "(" + a + " * " + b + " + " + c + ") / " + d + "\n";
		if ((a * b - c) / d == 24) answer += "(" + a + " * " + b + " - " + c + ") / " + d + "\n";
		
		if ((a / b + c) * d == 24) answer += "(" + a + " / " + b + " + " + c + ") * " + d + "\n";
		if ((a / b - c) * d == 24) answer += "(" + a + " / " + b + " - " + c + ") * " + d + "\n";
		if ((a / b + c) / d == 24) answer += "(" + a + " / " + b + " + " + c + ") / " + d + "\n";
		if ((a / b - c) / d == 24) answer += "(" + a + " / " + b + " - " + c + ") / " + d + "\n";
		
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
