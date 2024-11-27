package matrizz;

import javax.swing.*;

public class matriz4 {

	public static void main(String[] args) {
		 final int N_Lin = 3, N_Col = 3; 
	        int[][] mat = new int[N_Lin][N_Col];
	        int l, c;

	        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\n Entre com o valor em cada posição da matriz");

	       
	        for (l = 0; l < N_Lin; l++) {
	            for (c = 0; c < N_Col; c++) {
	                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Valor linha " + (l + 1) + " coluna " + (c + 1) + " :"));
	            } 
	        } 

	        JOptionPane.showMessageDialog(null, "****** Exibindo os dados da matriz ******");
	        for (l = 0; l < N_Lin; l++) {
	            for (c = 0; c < N_Col; c++) {
	                System.out.print(mat[l][c] + " ");
	            } 
	            System.out.print("\n"); 
	        }
	}

}
