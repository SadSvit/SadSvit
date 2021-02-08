package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4, 5, 6, 7},
                                     {12, 2, 3, 4, 5, 6, 7},
                                     {1, 2, 3, 4, 5, 6, 7},
                                     {1, 12, 3, 12, 5, 6, 7},
                                     {1, 2, 3, 4, 5, 6, 7},
                                     {1, 2, 3, 4, 5, 6, 7},
                                     {1, 2, 3, 4, 5, 6, 7}};
        int[][] TimeMatrix = new int[matrix.length][matrix[0].length];
        int maxValueInMatrice = searchMaxValueInMatrice(matrix);
        int count = CountingTheNumberOfMaximumElementsInAMatrix(matrix, maxValueInMatrice);
        int TheNumberThatIsSubtractedFromTheMemoryOfTheMatrix2 = CountingTheNumberOfMaximumElementsInAMatrixByColumns(matrix, maxValueInMatrice);
        int TheNumberThatIsSubtractedFromTheMemoryOfTheMatrix = count;
        OffsetOfTheColumnsOfTheMatrixWithTheMaximumElement(matrix, maxValueInMatrice);
        FillingTemporaryMatrix(matrix, TimeMatrix);
        matrix = ShiftRightOfMatrixElementsContainingMaximum(matrix, count, maxValueInMatrice);
        TimeMatrix = new int[matrix.length - TheNumberThatIsSubtractedFromTheMemoryOfTheMatrix][matrix[0].length - TheNumberThatIsSubtractedFromTheMemoryOfTheMatrix2];
        TimeMatrix = FillingTemporaryMatrix(matrix, TimeMatrix);
        matrix = new int[TimeMatrix.length][TimeMatrix[0].length];
        matrix = TimeMatrix;
        printMatrice2(matrix);
    }

    public static int searchMaxValueInMatrice(int matrice[][]) {
        int maxValueInmatrice = matrice[0][0];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] > maxValueInmatrice) {
                    maxValueInmatrice = matrice[i][j];
                }
            }
        }
        return maxValueInmatrice;
    }


    public static void printMatrice(int[] matrice) {
        for (int i = 0; i < matrice.length - 1; i++) {
            System.out.println(matrice);
        }

    }

    public static void printMatrice2(int[][] matrice) {
        for (int j = 0; j < matrice.length; j++) {
            for (int k = 0; k < matrice[j].length; k++) {
                System.out.print(matrice[j][k] + " ");
            }
            System.out.println();
        }
    }

    public static int CountingTheNumberOfMaximumElementsInArray(int[] array, int maxValueInArray) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == maxValueInArray) {
                count++;
            }
        }
        return count;
    }


    public static int CountingTheNumberOfMaximumElementsInAMatrix(int[][] matrice, int maxValueIntMatrice) {
        int count = 0;
        for (int i = 0; i < matrice.length - 1; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == maxValueIntMatrice) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int CountingTheNumberOfMaximumElementsInAMatrixByColumns(int[][] matrice, int maxValueIntMatrice) {
        int count = 0;
        for (int i = 0; i < matrice.length - 1; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[j][i] == maxValueIntMatrice) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static int[][] ShiftRightOfMatrixElementsContainingMaximum(int[][] matrice, int count, int maxValueIntMatrice) {
        for (int t = 0; t <= count; t++) {
            for (int i = 0; i < matrice.length - 1; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    int[] copyMatrice = matrice[i + 1];
                    if (matrice[i][j] == maxValueIntMatrice) {
                        matrice[i + 1] = matrice[i];
                        matrice[i] = copyMatrice;
                    }


                }
            }
        }
        return matrice;
    }


    public static int[][] FillingTemporaryMatrix(int matrice[][], int matrice2[][]) {
        for (int i = 0; i < matrice2.length; i++) {
            for (int j = 0; j < matrice2[i].length; j++) {
                matrice2[i][j] = matrice[i][j];
            }
        }
        return matrice2;
    }

    public static int[][] OffsetOfTheColumnsOfTheMatrixWithTheMaximumElement(int matrice[][], int maxValueInMatrice) {
        for (int i = 0; i < matrice.length; i++) {
            int count2 = CountingTheNumberOfMaximumElementsInArray(matrice[i], maxValueInMatrice);
            for (int t = 0; t < count2; t++) {
                for (int j = 0; j < matrice[i].length - 1; j++) {
                    if (matrice[i][j] == maxValueInMatrice) {
                        for (int q = 0; q < matrice.length; q++) {
                            int TimeNumber = matrice[q][j + 1];
                            matrice[q][j + 1] = matrice[q][j];
                            matrice[q][j] = TimeNumber;
                        }

                    }
                }
            }
        }
        return matrice;
    }

}
