package matrizz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class matriz7 {

	public static void main(String[] args) {
		char[][] tabuleiro = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean acabou = false;
        char vez = Arrays.asList('X', 'O').get(new Random(System.nanoTime()).nextInt(2));
        System.out.println("Digite o lugar como: 2,3 (X,Y)");
        int jogadas = 0;
        while (true) {
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    if (tabuleiro[i][j] != 'X' && tabuleiro[i][j] != 'O' && tabuleiro[i][j] != '-') {
                        tabuleiro[i][j] = '-';
                    }
                    scanner.close();

                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
            if (acabou) break;
            System.out.println("Vez do " + vez);
            String[] lugar = scanner.nextLine().replace(" ", "").split(",");
            if (lugar.length == 2 && canParseInt(lugar[0]) && canParseInt(lugar[1]) && Integer.parseInt(lugar[0]) <= 3 && Integer.parseInt(lugar[1]) <= 3 && Integer.parseInt(lugar[0]) >= 1 && Integer.parseInt(lugar[1]) >= 1) {
                if (tabuleiro[Integer.parseInt(lugar[1]) - 1][Integer.parseInt(lugar[0]) - 1] != '-') {
                    System.out.println("Lugar já ocupado");
                } else {
                    tabuleiro[Integer.parseInt(lugar[1]) - 1][Integer.parseInt(lugar[0]) - 1] = vez;
                    jogadas++;
                    if (    (tabuleiro[0][0] == 'X' &&
                           tabuleiro[1][1] == 'X' &&
                            tabuleiro[2][2] == 'X') ||
                            (tabuleiro[0][0] == 'X' &&
                               tabuleiro[1][0] == 'X' &&
                                tabuleiro[2][0] == 'X') ||
                            (tabuleiro[0][1] == 'X' &&
                                   tabuleiro[1][1] == 'X' &&
                                    tabuleiro[2][1] == 'X') ||
                            (tabuleiro[0][2] == 'X' &&
                                       tabuleiro[1][2] == 'X' &&
                                        tabuleiro[2][2] == 'X') ||
                            (tabuleiro[0][0] == 'X' &&
                                           tabuleiro[0][1] == 'X' &&
                                            tabuleiro[0][2] == 'X') ||
                            (tabuleiro[1][0] == 'X' &&
                                               tabuleiro[1][1] == 'X' &&
                                                tabuleiro[1][2] == 'X') ||
                            (tabuleiro[2][0] == 'X' &&
                                                   tabuleiro[2][1] == 'X' &&
                                                    tabuleiro[2][2] == 'X')) {
                        System.out.println("X ganhou");
                        acabou=true;
                    } else if ((tabuleiro[0][0] == 'O' &&
                            tabuleiro[1][1] == 'O' &&
                            tabuleiro[2][2] == 'O') ||
                            (tabuleiro[0][0] == 'O' &&
                               tabuleiro[1][0] == 'O' &&
                                tabuleiro[2][0] == 'O') ||
                            (tabuleiro[0][1] == 'O' &&
                                   tabuleiro[1][1] == 'O' &&
                                    tabuleiro[2][1] == 'O') ||
                            (tabuleiro[0][2] == 'O' &&
                                       tabuleiro[1][2] == 'O' &&
                                        tabuleiro[2][2] == 'O') ||
                            (tabuleiro[0][0] == 'O' &&
                                           tabuleiro[0][1] == 'O' &&
                                            tabuleiro[0][2] == 'O') ||
                            (tabuleiro[1][0] == 'O' &&
                                               tabuleiro[1][1] == 'O' &&
                                                tabuleiro[1][2] == 'O') ||
                            (tabuleiro[2][0] == 'O' &&
                                                   tabuleiro[2][1] == 'O' &&
                                                    tabuleiro[2][2] == 'O')) {
                        System.out.println("O ganhou");
                        acabou=true;
                    }
                 else if (jogadas >= 9) {
                    System.out.println("Ah não, deu velha!");
                    acabou = true;
                }

                if (vez == 'X') {
                    vez = 'O';
                } else {
                    vez = 'X';
                }

            }
        }else{
            System.out.println("Posição inválida");
        }
    }
}


public static boolean canParseInt(String string) {
    try {
        Integer.parseInt(string);
        return true;
    } catch (Exception e) {
        return false;
    }
	}

}
