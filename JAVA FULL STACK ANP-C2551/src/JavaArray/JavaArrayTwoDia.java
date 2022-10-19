package JavaArray;

public class JavaArrayTwoDia {

	public static void main(String[] args) {
		// 1. creating two matrices array
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		// creating 1 matrices array for sum result

		int c[][] = new int[3][3]; // 3 rows and 3 columns

		System.out.println("Addition");

		// addition
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");

			}

			System.out.println(" ");

		}

		System.out.println("Substraction");

		// subtraction

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				c[i][j] = a[i][j] - b[i][j];

				System.out.print(c[i][j] + " ");

			}

			System.out.println();

		}
		
		System.out.println("Multiplication");

		// subtraction

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				c[i][j] = a[i][j] * b[i][j];

				System.out.print(c[i][j] + " ");

			}

			System.out.println();

		}
		
		System.out.println("Division");

		// subtraction

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				c[i][j] = a[i][j] / b[i][j];

				System.out.print(c[i][j] + " ");

			}

			System.out.println();

		}
	}
}
