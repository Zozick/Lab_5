import java.util.Scanner;
import static java.lang.Math.*;
import java.util.List;
import java.util.Arrays;


public class Lab_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите номер задания.");
        int nomer = in.nextInt();

        switch (nomer) {
            default: System.out.println("Такого задания нет"); break;
            case 1:
                System.out.println("Введите переменную a");
                double a = in.nextDouble();
                System.out.println("Введите переменную b");
                double b = in.nextDouble();
                System.out.println("Введите переменную c");
                double c = in.nextDouble();

                if ((a + b > c) & (a + c > b) & (c + b > a)) {

                    if ((pow(a, 2) == pow(b, 2) + pow(c, 2)) || (pow(b, 2) == pow(a, 2) + pow(c, 2)) || (pow(c, 2) == pow(a, 2) + pow(b, 2))) {

                        System.out.println("Треугольник - прямоугольный");
                    } else System.out.println("Треугольник не является прямоугольным \r\n" +
                            " Угол a = " + Math.toDegrees(acos((pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c))) + " градусов \r\n"+
                            " Угол b = " + Math.toDegrees(acos((pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c))) + " градусов \r\n" +
                            " Угол c = " + (180 - (Math.toDegrees(acos((pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c))) + Math.toDegrees(acos((pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c))))) + " градусов");

                } else System.out.println("Треугольник не возможен");
                break;
            case 2:
                System.out.println("Введите значение a"); a = in.nextDouble();
                System.out.println("Введите значение b"); b = in.nextDouble();
                System.out.println("Введите значение c"); c = in.nextDouble();
                System.out.println("Введите значение d"); double d = in.nextDouble();

                double ch = 1;
                if (a<0) { ch = ch*a;};
                if (b<0){ ch = ch*b;}
                if (c<0) {ch=ch*c;}
                if (d<0){ch=ch*d;}
                if (ch<0){
                    System.out.println("Число отрицательное");
                } else System.out.println("Число положительное");
                break;
            case 3:
                for (double i = -3; i<3.5; i = i+0.5){
                    if (i <=1){
                        System.out.println(i-2);
                    }else System.out.println(sin(i));}
                break;
            case 4:
                System.out.println("Введите переменную x"); double x = in.nextDouble();
                if (x<-3){
                    System.out.println(sin(pow(x,2)-2*x));
                } else if (-3<x & x<0) {
                    System.out.println(exp(x)-1);
                } else if (x>0) {
                    System.out.println( (4+x) / (pow(x,2)-1));
                } else if (x == 0 || x==3) {
                    System.out.println(10);
                }
                break;
            case 5:
                System.out.println("Введите координаты точек x,y"); double xx = in.nextDouble(), y = in.nextDouble();
                int j = 0;
                if ( xx>=-3 & xx<=-1 & y<= xx+2 & y>= ( (-2/3-2%3)*xx-3 ) ) {
                    System.out.println("Точка попала в левую фигуру(1)");
                }
                else if (xx>=-3 & xx<=-1 & y>= (sqrt(4-pow(xx+1,2))*(-1)+3) & y<= (abs(sqrt(4-pow(xx+1,2)))+3) ) {
                    System.out.println("Точка в левой-верхней фигуре(2)");
                } else if (xx>=-3 & xx<=-1 & y<= xx-1 & y>= (-2/3-2%3)*xx-3) {
                    System.out.println("Точка в левой-нижней фигуре(3)");
                }
                else System.out.println("Проблемка!");
                break;
            case 6:
                break;
            case 7:
                System.out.println("Введите переменную х ∈ [-4,4]");
                int x1 = in.nextInt();

                double g1,z1,gg,zz,pi;
                pi = 3.1415926535;
                if (-4 <=x1 && x1<=4){
                    if (-4<=x1 && x1<=0){
                        gg = (3*x1*x1+tan(2*x1+3))/(1+4*x1*x1+exp(1));
                        System.out.println("g = " + gg);
                    } else System.out.println("g = " + (x1*x1+pow(cos(x1),3)-sin(x1)*sin(x1))/ (1+x1*x1));
                    if (x1<0){
                        zz = (3*x1+ pow((exp(1)+pow(x1,2)),(1/4)))/(2*abs(x1-2));
                        System.out.println("z = " + zz);
                    }
                    if (0<=x1 && x1<=1){
                        System.out.println("z = " + 2*cos(x1)*pow(exp(1),-2*x1)+2*pi*x1 );
                    }
                    if (x1>1){
                        double result;
                        result = 2*sin(3*x1)- tan(pow(x1,3)-pow(x1,2));
                        System.out.println("z = " + result);
                    }
                }else System.out.println("Неправильное число");
                break;
            case 8:
                System.out.println("Введите день недели");
                String day = in.next();
                switch (day) {
                    default: System.out.println("Такого дня не существует");
                        break;
                    case "Понедельник": System.out.println("1. Русский язык\n2. Математика\n3. Информатика");
                        break;
                    case "Вторник": System.out.println("1. Русский язык\n2. Математика\n3. Информатика"); break;
                    case "Среда": System.out.println("1. Физкультура\n2. Философия\n3. Физика"); break;
                    case "Четверг": System.out.println("1. Философия\n2. Русский язык\n3. Математика"); break;
                    case "Пятница": System.out.println("1. Английский язык\n2. Математика\n3. Информатика"); break;
                    case "Суббота": System.out.println("1. Физика\n2. Математика\n3. Математика"); break;
                    case "Воскресенье": System.out.println("Выходной");break;
                }
                break;
            case 9:
                System.out.println("Тема опроса: 'Здоровый образ жизни' ");
                int k = 0;
                System.out.println("Сколько вам лет?");
                int age = in.nextInt();
                if (18<=age && age<=59){

                    k = k+1;
                }
                if (age <18){

                    k = k+2;
                }
                if (age >59){

                    k = k-1;
                }


                System.out.println("Употребляете в пищу овощи и фрукты? (Да/Нет)");
                String fruits = in.next();

                if (fruits.equals ("Да")){

                    k = k+1;
                }else if(fruits.equals( "Нет")) {
                    k = k-1;

                }

                System.out.println( "У вас есть велосипед? (Да/Нет)");
                String vel = in.next();
                if (vel.equals ("Да")){
                    k = k+1;

                }else if(vel.equals( "Нет")) {
                    k = k-1;

                }

                System.out.println( "Вы занимаетесь спрортом (Да/Нет)");
                String spor = in.next();
                if (spor.equals ("Да")){
                    k = k+1;

                }else if(spor.equals( "Нет")) {
                    k = k-1;

                }


                switch (k){
                    default: break;
                    case -4:
                        System.out.println("Вам срочно нужно начать следить за своим здоровьем"); break;
                    case -3:
                        System.out.println("Вам нужно начать следить за своим здоровьем"); break;
                    case -2:
                        System.out.println("Мы советуем вам начать следить за своим здоровьем"); break;
                    case -1:
                        System.out.println("Лучше начать сделить за собой уже сейчас "); break;
                    case 0:
                        System.out.println("Если займетесь спротом, то это пойдет на пользу"); break;
                    case 1:
                        System.out.println("Вы только начали придерживаться здорового образа жизни"); break;
                    case 2:
                        System.out.println("Мы советуем вам почаще бывать на свежем воздухе"); break;
                    case 3:
                        System.out.println("Вы стараетесь придерживаться здорового образа жизни"); break;
                    case 4:
                        System.out.println("Вы делаете все правильно, продолжайте в том же духе!"); break;
                    case 5:
                        System.out.println("Вы идельны!"); break;
                }



        }

    }
}