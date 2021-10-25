// Java Program to Rotate Matrix Elements

// Importing classes from java.lang package
import java.lang.*;
// Importing classes from java.util package
import java.util.*;

class RotateMatrix {
	static int r = 4;
	static int c = 4;

	// Method
	
	static void rotate_matrix(int p, int q, int matrix[][])
	{
		int rw = 0, cl = 0;
		int previous, current;

		while (rw < p && cl < q) {

			if (rw + 1 == p || cl + 1 == q)
				break;

			previous = matrix[rw + 1][cl];

			for (int x = cl; x < q; x++) {
				current = matrix[rw][x];
				matrix[rw][x] = previous;
				previous = current;
			}
			rw++;

			for (int x = rw; x < p; x++) {
				current = matrix[x][q - 1];
				matrix[x][q - 1] = previous;
				previous = current;
			}
			q--;

			if (rw < p) {
				for (int x = q - 1; x >= cl; x--) {
					current = matrix[p - 1][x];
					matrix[p - 1][x] = previous;
					previous = current;
				}
			}
			p--;
			
			if (cl < q) {
				for (int x = p - 1; x >= rw; x--) {
					current = matrix[x][cl];
					matrix[x][cl] = previous;
					previous = current;
				}
			}
			cl++;
		}
		for (int x = 0; x < r; x++) {
			for (int y = 0; y < c; y++)
				System.out.print(matrix[x][y] + " ");
			System.out.print("\n");
		}
	}
	//Method 2
	// Main driver method
	public static void main(String[] args)
	{
		int b[][] = { { 5, 6, 7, 8 },
					{ 1, 2, 3, 4 },
					{ 0, 15, 6, 5 },
					{ 3, 1, 2, 12 } };

		rotate_matrix(r, c, b);
	}
}
