package matrizz;

import javax.swing.*;

public class matriz6 {

	public static void main(String[] args) {
		 int[][] mat = {{41, 42, 23, 14, 51}, {22, 32, 55, 54, 12}};
	        int x, y;
	        JOptionPane.showMessageDialog(null, "****** Exibindo apenas os elementos pares da matriz ******");

	        // Exibição dos valores na matriz
	        for (x = 0; x < 2; x++) {
	            for (y = 0; y < 5; y++) {
	                if (mat[x][y] % 2 == 0) {
	                    System.out.print(mat[x][y] + " ");
	                } else {
	                    System.out.print("- ");
	                }
	            }
	            System.out.print("\n");
	        }

	}

}
