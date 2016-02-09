import java.util.*;
import java.util.Scanner;

public class Make24 {
	double first, sec, third, fourth;
	String answer;
	
	public void main(String[] arg0) {
		Scanner sc = new Scanner(System.in);
		first = (double) sc.nextDouble(); 
		sec = (double) sc.nextDouble();
		third = (double) sc.nextDouble();
		fourth = (double) sc.nextDouble();
		
		System.out.print(answer);
	}
	
	public String calculate(double a, double b, double c, double d) {
		//corner cases
		
		//(2 brackets)
		if ((a + b) * (c + d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " + " + d + " )";
		if ((a + b) * (c - d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " - " + d + " )";
		if ((a + b) * (c * d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " * " + d + " )";
		if ((a + b) * (c / d) == 24) answer += "( " + a + " + " + b + " ) * ( " + c + " / " + d + " )";
		
		if ((a - b) * (c + d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " + " + d + " )";
		if ((a - b) * (c - d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " - " + d + " )";
		if ((a - b) * (c * d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " * " + d + " )";
		if ((a - b) * (c / d) == 24) answer += "( " + a + " - " + b + " ) * ( " + c + " / " + d + " )";
		
		if ((a * b) * (c + d) == 24) answer += "( " + a + " * " + b + " ) * ( " + c + " + " + d + " )";
		if ((a * b) * (c - d) == 24) answer += "( " + a + " * " + b + " ) * ( " + c + " - " + d + " )";
		
		if ((a / b) * (c + d) == 24) answer += "( " + a + " / " + b + " ) * ( " + c + " + " + d + " )";
		if ((a / b) * (c - d) == 24) answer += "( " + a + " / " + b + " ) * ( " + c + " - " + d + " )";
		
		if ((a + b) / (c + d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " + " + d + " )";
		if ((a + b) / (c - d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " - " + d + " )";
		if ((a + b) / (c * d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " * " + d + " )";
		if ((a + b) / (c / d) == 24) answer += "( " + a + " + " + b + " ) / ( " + c + " / " + d + " )";
		
		if ((a - b) / (c + d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " + " + d + " )";
		if ((a - b) / (c - d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " - " + d + " )";
		if ((a - b) / (c * d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " * " + d + " )";
		if ((a - b) / (c / d) == 24) answer += "( " + a + " - " + b + " ) / ( " + c + " / " + d + " )";
		
		if ((a * b) / (c + d) == 24) answer += "( " + a + " * " + b + " ) / ( " + c + " + " + d + " )";
		if ((a * b) / (c - d) == 24) answer += "( " + a + " * " + b + " ) / ( " + c + " - " + d + " )";
		
		if ((a / b) / (c + d) == 24) answer += "( " + a + " / " + b + " ) / ( " + c + " + " + d + " )";
		if ((a / b) / (c - d) == 24) answer += "( " + a + " / " + b + " ) / ( " + c + " - " + d + " )";
		
		//(1 bracket = '+')
		if ((a + (b + c) + d) == 24) answer += a + " + (" + b + " + " + c + ") + " + d;
		if ((a + (b + c) - d) == 24) answer += a + " + (" + b + " + " + c + ") - " + d;
		if ((a + (b + c) * d) == 24) answer += a + " + (" + b + " + " + c + ") * " + d;
		if ((a + (b + c) / d) == 24) answer += a + " + (" + b + " + " + c + ") / " + d;
		
		if ((a - (b + c) + d) == 24) answer += a + " - (" + b + " + " + c + ") + " + d;
		if ((a - (b + c) - d) == 24) answer += a + " - (" + b + " + " + c + ") - " + d;
		if ((a - (b + c) * d) == 24) answer += a + " - (" + b + " + " + c + ") * " + d;
		if ((a - (b + c) / d) == 24) answer += a + " - (" + b + " + " + c + ") / " + d;
		
		if ((a * (b + c) + d) == 24) answer += a + " * (" + b + " + " + c + ") + " + d;
		if ((a * (b + c) - d) == 24) answer += a + " * (" + b + " + " + c + ") - " + d;
		if ((a * (b + c) * d) == 24) answer += a + " * (" + b + " + " + c + ") * " + d;
		if ((a * (b + c) / d) == 24) answer += a + " * (" + b + " + " + c + ") / " + d;
		
		if ((a / (b + c) + d) == 24) answer += a + " / (" + b + " + " + c + ") + " + d;
		if ((a / (b + c) - d) == 24) answer += a + " / (" + b + " + " + c + ") - " + d;
		if ((a / (b + c) * d) == 24) answer += a + " / (" + b + " + " + c + ") * " + d;
		if ((a / (b + c) / d) == 24) answer += a + " / (" + b + " + " + c + ") / " + d;
		
		//(1 bracket = '-')
		if ((a + (b - c) + d) == 24) answer += a + " + (" + b + " + " + c + ") + " + d;
		if ((a + (b - c) - d) == 24) answer += a + " + (" + b + " + " + c + ") - " + d;
		if ((a + (b - c) * d) == 24) answer += a + " + (" + b + " + " + c + ") * " + d;
		if ((a + (b - c) / d) == 24) answer += a + " + (" + b + " + " + c + ") / " + d;
		
		if ((a - (b - c) + d) == 24) answer += a + " - (" + b + " + " + c + ") + " + d;
		if ((a - (b - c) - d) == 24) answer += a + " - (" + b + " + " + c + ") - " + d;
		if ((a - (b - c) * d) == 24) answer += a + " - (" + b + " + " + c + ") * " + d;
		if ((a - (b - c) / d) == 24) answer += a + " - (" + b + " + " + c + ") / " + d;
		
		if ((a * (b - c) + d) == 24) answer += a + " * (" + b + " + " + c + ") + " + d;
		if ((a * (b - c) - d) == 24) answer += a + " * (" + b + " + " + c + ") - " + d;
		if ((a * (b - c) * d) == 24) answer += a + " * (" + b + " + " + c + ") * " + d;
		if ((a * (b - c) / d) == 24) answer += a + " * (" + b + " + " + c + ") / " + d;
		
		if ((a / (b - c) + d) == 24) answer += a + " / (" + b + " + " + c + ") + " + d;
		if ((a / (b - c) - d) == 24) answer += a + " / (" + b + " + " + c + ") - " + d;
		if ((a / (b - c) * d) == 24) answer += a + " / (" + b + " + " + c + ") * " + d;
		if ((a / (b - c) / d) == 24) answer += a + " / (" + b + " + " + c + ") / " + d;
		
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
