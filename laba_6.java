import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import static java.lang.Math.*;

class zad_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S,n,m,x,N = 0,M = 0;
        System.out.println("введите число x");
        x =in.nextDouble();
        System.out.println("введите число n");
        n =in.nextDouble();
        System.out.println("введите число m");
        m = in.nextDouble();
        for(int i = 0; i<n; i++){
            S=(n+1)*pow(x,0);
            N=+S;
            if (m>S){
                M+=S;
            }
        }
        System.out.println("N= " + N);
        System.out.println("M= " + M);
    }
}

class zad_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число N");
        int N = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

        while (a <= N) {
            count++;
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println("Количество кроликов через год: " + count);

        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}

class zad_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long result = 0;
        for (int i = 1; i <= 8; i++){
            for (int j =1; j <=i;j++){
                result += (i+j)*(i-j);
            }
        }
        System.out.println("Результат вычисления 1 выражения: " + result);

        result = 1;
        for (int i = 1; i<=5;i++){
            for (int j = 1; j<+i;j++){
                result *= (j);
            }
        }
        System.out.println("Результат вычисления 2 выражения: " + result);

        result = 0;
        for (int i = 1; i <= 8; i++){
            for (int j =1; j <=i;j++){
                for (int k = 1; k<= i+j;k++){
                    result += (j*j+i+k);
                }
            }
        }
        System.out.println("Результат вычисления 3 выражения: " + result);
    }
}

class zad_4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите десятичную положительную дробь < 1 ");
        double n = in.nextDouble();
        String s = "";
        String sn = String.valueOf(n).substring(2);
        if (n >=1){
            while (n>=1){
                System.out.println("Введено неправильное число");
                n = in.nextDouble();
            }
        }
        int num = Integer.valueOf(sn);
        System.out.println("Введите систему счисления без букв: ");
        int sc = in.nextInt();
        if (sc <=1 || sc >= 10){
            while (sc <=1 || sc >= 10){
                System.out.println("Введено неправильное число");
                sc = in.nextInt();
            }
        }
        while (num>0){
            s+= String.valueOf(num%sc);
            num /= sc;
        }
        String l = reverseS(s);
        System.out.println("число в " + sc + "-иричной системе сичсления = 0."+ l);
    }
    public static String reverseS(String str){
        return new StringBuilder(str).reverse().toString();
    }
}

class zad_7{
    public static void main(String[]  args){
        int[][] a;
        a=new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf(((i+1)+"+"+(j+1)+"=" +((i+1)+(j+1)))+"\t");
                System.out.print(" ");
            }
            System.out.println(" ");
        }}}

class zad_8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите p"); int p = in.nextInt();
        System.out.println("Введите y"); int y = in.nextInt();
        System.out.println("Введите a"); int a = in.nextInt();
        System.out.println("Введите x"); int x = in.nextInt();
        System.out.println("Введите c"); int c = in.nextInt();
        FunctionMy(p,y,a,x,c);


        }

    static void FunctionMy(double p, double y,double a,double x, double c){
        Scanner in = new Scanner(System.in);
        double sum1 = 0;
        double sum2 = 0;
        for (int i =1; i<=5;i++){
            sum1+= ( (sin(p+0.4)*sin(p+0.4))/ ( y * y + 7.325*p) );
            sum2+= ( pow(a,5) + acos(a+ pow(x,3)) - pow(sin(y-c),4) ) / ( pow(sin(x+y),3) + abs(x-y));
            System.out.println("Введите новую переменную y");
            y = in.nextInt();
        }

        System.out.println("Z = " + sum1);
        System.out.println("P = " + sum2);

    }
}

class zad_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = input.nextDouble();
        System.out.print("Введите степень p: ");
        int p = input.nextInt();

        for (double e = 0.01; e >= 0.000001; e /= 10) {
            double y0 = Math.exp(Math.log(x * (p + 1)) / p)-1;
            double y = y0;
            int iterations = 0;
            while (true) {
                double yn = (1.0 / p) * ((p - 1) * y + (x / Math.pow(y, p - 1)));
                if (Math.abs(yn - y) <= e) {
                    System.out.printf("Точность: %.6f\tКорень: %.6f\tЧисло итераций: %d\n", e, yn, iterations);
                    break;
                }
                y = yn;
                iterations++;
            }
        }
        input.close();
    }
}

class zad_10{
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double n = 10;
        double h = (b - a) / n;
        double S = 0;
        System.out.println("n\th\tS\tАналитическое решение\tПогрешность");
        for (int j = 0; j<4; j++){
            for (int i = 0; i < n; i++) {
                double x = a + i*h;
                double fx = f(x);
                S += fx*h;
            }
            double analyticalSolution = Math.exp(1) - 1;
            double error = Math.abs(analyticalSolution - S);

            System.out.println(n + "\t" + h + "\t" + S + "\t" + analyticalSolution + "\t" + error);
            n*=10;

        }
    }

    public static double f(double x) {
        return 8*pow(x,5)-sin(x);
    }
}
