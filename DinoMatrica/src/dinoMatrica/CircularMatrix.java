/**
 * 
 */
package dinoMatrica;

import java.util.Scanner;

/**
 * @author Croneex
 *
 */
public class CircularMatrix {
	
	public CircularMatrix() {

		circularMatrix();
		//primjer();

	}

	private void circularMatrix() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number columns: ");
		int columns = Integer.parseInt(sc.nextLine());

		System.out.print("Enter the number rows: ");
		int rows = Integer.parseInt(sc.nextLine());

		int[][] matrix = new int[rows][columns];

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		int counter = 1;

		while (top < bottom && left < right) {
			
				for (int i = left; i <= right; i++) {
					matrix[top][i] = counter++;
				}
				top++;
				
				for (int i = top; i <= bottom; i++) {
					matrix[i][right] = counter++;
				}
				right--;
				
				for (int i = right; i >= left; i--) {
					matrix[bottom][i] = counter++;
				}
				bottom--;
				
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = counter++;
				}
				left++;
			}
		
		if(matrix[0].length%2 != 0 && columns>rows) {
			for (int i = left; i <= right; i++) {
				matrix[bottom][i] = counter++;
				}
		}else if(matrix.length%2 != 0 && rows>columns) {
			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = counter++;
			}
		}else if(matrix.length == matrix[0].length && matrix.length%2!=0){
			matrix[bottom][right] = counter++;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%4d ",matrix[i][j]);
			}
			System.out.println("");
		}

	}

	private void primjer() {

		int[][] matrix = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 },{ 0, 0, 0 } };

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		int dir = 1;
		int counter = 1;

		while (top <= bottom && left <= right) {
			
			for (int i = left; i <= right; i++) {
				matrix[top][i] = counter++;
			}
			top++;
			
			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = counter++;
			}
			right--;
			
			for (int i = right; i >= left; i--) {
				matrix[bottom][i] = counter++;
			}
			bottom--;
			
			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = counter++;
			}
			left++;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		new CircularMatrix();
	}

}
