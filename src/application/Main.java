package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Data for piece #1:");
		System.out.print("Enter the code of the piece: ");
		int numberPiece1 = scanner.nextInt();
		System.out.print("Enter the number of pieces in stock: ");
		int stockPiece1 = scanner.nextInt();
		System.out.print("Enter the value of the piece: ");
		double valuePiece1 = scanner.nextDouble();
		System.out.println();
		System.out.println("Data for piece #2:");
		System.out.print("Enter the code of the piece: ");
		int numberPiece2 = scanner.nextInt();
		System.out.print("Enter the number of pieces in stock: ");
		int stockPiece2 = scanner.nextInt();
		System.out.print("Enter the value of the piece: ");
		double valuePiece2 = scanner.nextDouble();
		double valueStockPiece1 = (stockPiece1 * valuePiece1);
		double valueStockPiece2 = (stockPiece2 * valuePiece2);
		double totalValue = valueStockPiece1 + valueStockPiece2;
		System.out.println();
		System.out.printf("The total value of the piece number %d in stock is U$ %.2f%n", numberPiece1, valueStockPiece1);
		System.out.printf("The total value of the piece number %d in stock is U$ %.2f%n", numberPiece2, valueStockPiece2);
		System.out.printf("The total value in stock is U$ %.2f", totalValue);
		
		scanner.close();		
	}

}
