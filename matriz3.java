package matrizz;

import java.util.Scanner;

public class matriz3 {

	public static void main(String[] args) {
		 float[][] nums = new float[4][4];
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[i].length; j++) {
	                nums[i][j]=scanner.nextFloat();
	            }
	        }
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[i].length; j++) {
	                System.out.print(nums[i][j] + " ");

	            }
	            System.out.println();
	        }

	        System.out.println("Primeira diagonal");
	        for (int i = 0; i < nums.length; i++) {
	            System.out.println(nums[i][i]);
	        }

	        System.out.println("segunda diagonal");
	        for (int i = nums.length-1; i >= 0; i--) {
	            System.out.println(nums[i][nums.length-1-i]);
	        }
	        
	        scanner.close();


	}

}
