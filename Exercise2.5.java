package chapter2;


	import java.util.Scanner;

	public class CalculateTips {



	private static Scanner input;

	public static void main(String[] args) {

	   input = new Scanner(System.in);

	   System.out.print(" Enter the subtotal : ");

	   double subtotal  = input.nextDouble();

	   System.out.print(" Enter the gratuity rate : ");

	   double gratuity = input.nextDouble();

	   double caculateGratuity = (gratuity) / subtotal;

	   double total = subtotal + caculateGratuity ;

	   System.out.println(" The Gratuity is : $" +  caculateGratuity  + " and total is : $" + total);
	  }  
	}

