package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrice = new int[][]{{1, 3, 9},
                                      {5, 5, 5},
                                      {7, 1, 1},
                                      {111, -1, -3, -11, 4, -1, 4},
                                      {7, -85, -12, 1},
                                      {2, 85, 1},
                                      {7, 85, 1},
                                      {1, -1, -1},
                                      {-1, -1, -1},
                                      {7, 825, -4, -10, -10, 1,}};

        for (int i = 0; i < matrice.length; i++) {
            int NextNumberAfterI = 1;
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                int truwer = 1;
                int[] dubl = matrice[j];

                if ((matrice[i][j] != matrice[i][0]) && (matrice[i][j] < 0) && (matrice[i][j - truwer] >= 0)) {

                    count1 = count1 - (matrice[i][j]);
                    for (int r = 1; r < matrice[i].length - 1; r++) {

                        if ((matrice[i][j + r] < 0)) {

                            count1 = count1 - (matrice[i][j + r]);
                        }
                        if ((matrice[i][j + r] >= 0)) {
                            count2 = count2 + count1;
                            break;

                        }

                    }
                    break;
                }

            }
            System.out.println(count2);
        }
    }
}






