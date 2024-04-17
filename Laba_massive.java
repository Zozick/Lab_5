import java.util.Arrays;
import java.util.Scanner;

class Laba_massive {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] binaryArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива (0 или 1): ");
            int input = in.nextInt();
            if (input == 0 || input == 1) {
                binaryArray[i] = input;
            } else {
                System.out.println("Ошибка! Введите только 0 или 1.");
                i--;
            }
        }

        int decimal = 0;
        for (int i = 0; i < n; i++) {
            decimal += binaryArray[i] * Math.pow(2, n - 1 - i);
        }


        System.out.println("\nДесятичное число: " + decimal);
    }
}

class case_2{
    public static void main(String[] args) {
        int[] array = {9,8,7,9,5,4,3,9,1,6,7};
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Нет участков массива, на которых элементы монотонно убывают.");
        } else {
            System.out.println("Количество участков массива, на которых элементы монотонно убывают: " + count);

            int start = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] >= array[i - 1]) {
                    if (start != i - 1) {
                        System.out.println("Участок " + (start + 1) + "-" + i);
                    }
                    start = i;
                }
            }
        }
    }
}

class case_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N;
        System.out.print("Введите количество точек N: ");
        N = in.nextInt();

        double[] points = new double[2*N];

        for (int i = 0; i < 2*N; i++) {
            System.out.print("Введите координату точки " + (i/2 + 1) + ": ");
            points[i] = in.nextDouble();
        }

        double x1, y1, r1, x2, y2, r2;

        System.out.print("Введите координаты центра и радиус окружности 1: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        r1 = in.nextDouble();

        System.out.print("Введите координаты центра и радиус окружности 2: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        r2 = in.nextDouble();

        for (int i = 0; i < N; i++) {
            double x = points[2*i];
            double y = points[2*i + 1];
            double distanceFromCenter1 = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
            double distanceFromCenter2 = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));

            if (distanceFromCenter1 < r1 || distanceFromCenter2 > r2) {
                System.out.println("Точка " + (i+1) + " лежит вне кольца.");
            }
        }
    }
}

class case_4{
    public static void main(String[] args) {
        int[] arr = {5,12,0,4};

        System.out.println("Массив до сортировки:");
        printArray(arr);

        selectionSort(arr.clone());
        bubble(arr.clone());
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("Промежуточный результат (Шаг " + (i+1) + ") при сортировке методом прямого выбора:");
            printArray(arr);
        }

        System.out.println("Отсортированный массив методом прямого выбора:");
        printArray(arr);
    }

    public static void bubble(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Промежуточный результат (Шаг " + (i+1) + ") при сортировке методом пузырька:");
            printArray(arr);
        }

        System.out.println("Отсортированный массив методом пузырька:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class case_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите эелеметны массива:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        long product = Below(matrix);
        System.out.println("Произведение элементов ниже побочной диагонали: " + product);
    }

    private static long Below(int[][] matrix) {
        long product = 1;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (i + j > matrix[i].length - 1) {
                    product *= matrix[i][j];
                }
            }
        }
        return product;
    }
}

class case_6{
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4};


        double[][] matrix = new double[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = Math.pow(array[j], i);
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class case_7{
    public static void main(String[] args) {
        int n = 6; // размер матрицы
        int[][] matrix = new int[n][n];
        int num = 1;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[j][i] = num++;
            }
            for (int j = i + 1; j < n - i; j++) {
                matrix[n - i - 1][j] = num++;
            }
            for (int j = n - i - 2; j >= i; j--) {
                matrix[j][n - i - 1] = num++;
            }
            for (int j = n - i - 2; j > i; j--) {
                matrix[i][j] = num++;
            }
        }

        // Вывод матрицы
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}


class case_10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 2, 3, 4, 5},
                {25, 3, 4, 5, 6}
        };

        int[] result = checkPoints(matrix);

        printResults(result);
    }

    public static int[] checkPoints(int[][] matrix) {
        int n = matrix[0].length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int x = matrix[0][i];
            int y = matrix[1][i];
            result[i] = checkPoint(x, y);
        }

        return result;
    }

    public static int checkPoint(int x, int y) {
        if ((x >= 1 && x <= 5 && y >= 2 && y <= 6) || (x >= 3 && x <= 4 && y >= 3 && y <= 5)) {
            return 1;
        } else if ((x == 1 || x == 5) && y >= 2 && y <= 6) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void printResults(int[] result) {
        System.out.println("Результаты:");
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                System.out.println("Точка " + (i + 1) + " в области.");
            } else if (result[i] == 0) {
                System.out.println("Point " + (i + 1) + " на границе области.");
            } else {
                System.out.println("Point " + (i + 1) + " снаружи области.");
            }
        }
    }
}

class case_12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввеедите размерность матрицы: ");
        int n = scanner.nextInt();

        double[][] A = new double[n][n];
        double[] F = new double[n];
        double[] X = new double[n];

        System.out.println("Введите коэффицент А:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Введите значение вектора F:");
        for (int i = 0; i < n; i++) {
            F[i] = scanner.nextDouble();
        }

        System.out.println("Введите значения Х:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextDouble();
        }

        double[] AX = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                AX[i] += A[i][j] * X[j];
            }
        }

        boolean solutionsMatch = true;
        for (int i = 0; i < n; i++) {
            if (AX[i] != F[i]) {
                solutionsMatch = false;
                break;
            }
        }

        if (solutionsMatch) {
            System.out.println("Результат X подходит под условие A*X = F.");
        } else {
            System.out.println("Результат X не подходит под условие A*X = F.");
        }

    }

}


