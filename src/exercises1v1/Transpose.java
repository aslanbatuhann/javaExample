package exercises1v1;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matris satır boyutu: ");
        int n = input.nextInt();
        System.out.print("Matris sütun boyutu: ");
        int m = input.nextInt();

        int[][] matrices = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((i + 1) + ". satır - " + (j + 1) + ". sütun : ");
                matrices[i][j] = input.nextInt();
            }
        }
        System.out.println("Matris :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrices[i][j]);
            }
        }
        System.out.println("Transpose :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrices[j][i]);
            }
        }
    }
}
