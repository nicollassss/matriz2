package matrizz;

import java.util.Scanner; 

public class Matriz1 {

	public static void main(String[] args) {
		 int[][] nums = new int[5][5];
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[i].length; j++) {
	                nums[i][j]=scanner.nextInt();
	            }
	        }

	        int totalImpar = 0;
	        int[] totalColunas = new int[nums[0].length];
	        int totalLinha = 0;

	        for (int i = 0; i <= nums.length; i++) {
	            totalLinha=0;
	            if (i < nums.length) {
	                for (int j = 0; j < nums[i].length; j++) {
	                    totalImpar+=(nums[i][j] % 2 !=0)? nums[i][j] : 0;
	                    System.out.print(nums[i][j] + ((nums[i][j] < 10)? "  ":" "));
	                    totalColunas[i] += nums[j][i];
	                    totalLinha += nums[i][j];
	                }
	                System.out.println("= "+ totalLinha);
	            }else{
	                for(int j = 0; j < nums[0].length; j++){
	                    System.out.print("|| ");
	                }
	                System.out.println();
	                for (int num : totalColunas) {
	                    System.out.print(num + " ");
	                }
	                System.out.println();

	            }
	        }


	        System.out.println("Soma de todos os ímpares: " + totalImpar);
	        
	        scanner.close();
	}

}
