import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) throws InterruptedException {

        boolean contin;
        boolean exit;
        int cs;
        String vv;
        Scanner scanner = new Scanner(System.in);

        do {
            contin = true;
            exit = true;
            System.out.print("Выбирете задание от 1 до 7: ");
            cs = scanner.nextInt();
            switch (cs){
                case 1:
                    getCountofDigits();
                    break;

                case 2:
                    triangle();
                    break;

                case 3:
                    number();
                    break;

                case 4:
                    positiveNumber();
                    break;

                case 5:
                    positiveAndNegative();
                    break;

                case 6:
                    biggestone();
                    break;

                case 7:
                    programists();
                    break;
                default:
                    System.out.print("Неверное число.");
            }

            do {
                System.out.print("Желаете продолжить Yex/No? ");
                vv = scanner.next();

                if(vv.equalsIgnoreCase("yes")){
                    exit = false;
                } else if (vv.equalsIgnoreCase("no")){
                    contin = false;
                    exit  = false;
                } else System.out.print("Шьто я не поняль? Давай по новой ");
            }while (exit);

        } while (contin);
        scanner.close();
    }

    public static void getCountofDigits(){
        int count;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        long num = in.nextLong();

        if(num>0){
            count = (int)(Math.log10(num)+1);
            switch (count) {
                case 1 ->
                    System.out.println("Колличество цифр в числе: " + count + ", число положительное однозначное.");

                case 2 ->
                    System.out.println("Колличество цифр в числе: " + count + ", число положительное двухзначное.");

                default ->
                    System.out.println("Колличество цифр в числе: " + count + ", число положительное трехзначное и более");

            }
        } else if(num==0){
            count = 1;
            System.out.println("Колличество цифр в числе: " + count + ", число ноль");
        } else {
            count = (int)(Math.log10(Math.abs(-num))+1);
            switch (count) {
                case 1 ->
                        System.out.println("Колличество цифр в числе: " + Math.abs(-count) + ", число отрицательное однозначное");
                case 2 ->
                        System.out.println("Колличество цифр в числе: " + Math.abs(-count) + ", число отрицательное двухзначное");
                default ->
                        System.out.println("Колличество цифр в числе: " + Math.abs(-count) + ", число отрицательное трехзначное " +
                                "и более");
            }
        }
    }

    public static void triangle(){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        c = scanner.nextInt();

        if (a+b<c){
            System.out.println("Это не треугольник!");
        } else if(b+c<a){
            System.out.println("Это не треугольник!");
        } else if (a+c<b){
            System.out.println("Это не треугольник!");
        } else System.out.println("Да это он");

    }

    public static void number(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if(number>0){
            number++;
            System.out.println("Число после преоброзований:" + number);
        }else if(number == 0){
            number = 10;
            System.out.println("Число после преоброзований:" + number);
        } else {
            number-=2;
            System.out.println("Число после преоброзований:" + number);
        }
    }

    public static void positiveNumber(){
        int a,b,c;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите превое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        c = scanner.nextInt();
        int[] map = {a,b,c};
        for(int i = 0;i<3;i++){
            if(map[i]>0){
                sum++;
            }
        }
        System.out.println("Количество положительных чисел: " + sum);
    }

    public static void positiveAndNegative(){
        int a,b,c;
        int positive = 0;
        int negative = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите превое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        c = scanner.nextInt();
        int[] map = {a,b,c};
        for(int i = 0;i<3;i++){
            if(map[i]>0){
                positive++;
            }else if(map[i]<0){
                negative++;
            }
        }
        System.out.println("Количество положительных чисел: " + positive + "\n" +
                "Количество отрицательных: " + negative);

    }

    public static void biggestone(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " больше");
        }else System.out.println(b + " больше");

    }

    public static void programists(){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число программистов: ");
        a = scanner.nextInt();
        if(a>=5 && a<=20 || (a%10 >=5 && a%10 <=9) || a%10==0 ){
            System.out.println("В вашей комманде " + a + " программистов.");
        }
        else if(a%10>=2 && a%10<=4){
            System.out.println("В вашей комманде " + a + " программиста.");
        } else {
            System.out.println("В вашей комманде " + a + " программист.");
        }

    }

}
