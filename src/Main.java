import javax.swing.*;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("..");
//        int a = scanner.nextInt();
//
//        System.out.print("..");
//        int b = scanner.nextInt();
//
//        while (a < b) {
////            System.out.printf("number = %d    pow = %d \n", a, (int)Math.pow(a, 2));
//            System.out.println(STR."number = \{a} , pow = \{(int)Math.pow(a, 2)}");
//            a++;
//        }


        // TODO задаа от презентации, вычисляем сумму и найти среднее ар.число
//        int number = new Scanner(System.in).nextInt();
//        int number1;
//        int i = 0;
//        while (true) {
//            number1 = new Scanner(System.in).nextInt();
//            if (number1 == 0) {
//                break;
//            }
//            number += number1;
//            i++;
//        }System.out.println(number);
//        if (i != 0) {
//            number /= i;
//            System.out.println(number);
//        }


        // TODO Таблица
        /*   Scanner scanner = new Scanner(System.in);

        System.out.print("..");
        int a = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int b = a * i;
            System.out.println(STR."\{a} * \{i} = \{b}");
        }*/


//        // TODO тоже таблица , только сделано через while
//       Scanner scanner = new Scanner(System.in);
//
//        System.out.print("..");
//        int a = scanner.nextInt();
//
//        int i = 1;
//        while (i <= 10) {
//            int b = a * i;
//            System.out.println(STR."\{a} * \{i} = \{b}");
//            i++;
//        }


        // TODO задачка от презентации. жуп сандардын суммасы.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("..");
//        int a = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = 2; i < a; i+=2) {
//            sum += i;
//            System.out.print(STR."\{i } ");
//        }System.out.print(STR."= \{ sum } ");


//        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//        int a = 1;
//        while (number >= 1) {
//            int n = scanner.nextInt();
//            if (n == 0) {
//                break;
//            } if (n == 0) System.out.println(n);
//        }


        // TODO четверг 12.10. практика


        // TODO 1 task
        /*  Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);

            do {

                int a = scanner.nextInt();
                int b = scanner.nextInt();
                String yes = "yes";
                String not = "not";

                int c = a + b;
                System.out.println(c);

                System.out.print("Продолжить ");
                String q = scanner1.nextLine();

                if (q.equalsIgnoreCase("not")) {
                    break;
                } else if (q.equalsIgnoreCase("yes")) {
                    System.out.println("next");
                }else {
                    System.out.println("ERROR");
                    break;
                }
            } while (true);
            System.out.println("Happy end");
        */


        // TODO 2 task

    /*    while (true) {
            System.out.print(STR."сан бериниз 1 до 5: ");
            int number = new Scanner(System.in).nextInt();

            double random =1 + Math.random() * 5;
            int random1 = (int) random;
            System.out.print(STR."\{(int)random1} \n");

            if (number > random1) {
                System.out.println(STR."\"ото жогору, кайра аракет кылыныз\"");
            } else if (number < random1) {
                System.out.println(STR."\"ото томон, кайра аракет кылыныз\"");
            } else if (number == random1) {
                break;
            }
        }
*/


        // TODO 3 task

        /*  int number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            int b = number * i;
            System.out.println(STR."\{number} * \{i} = \{b}");
        }*/



        // TODO 5 task

     /*   int i = 0;
        do {
            i++;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        } while (i < 100);*/


        // TODO 6 task

     /*   Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        while (numberOne < numberTwo) {
            numberOne++;
            System.out.println(numberOne);
        }*/



        //TODO 7 task

     /*   int number = new Scanner(System.in).nextInt();

        int i = 0;
        while (i < 10) {
            i++;
            int sum = i * number;
            System.out.println(STR."\{number} * \{i} = \{sum}");
        }

      */

             // TODO task 7 do.while
     /*   int scanner = new Scanner(System.in).nextByte();

        int i = 0;
        do {
            i++;
            int sum = i * scanner;
            System.out.println(STR."\{scanner} * \{i} = \{sum}");
        }while (i < 10);
*/



            // TODO task 8.
    /*    for (int i = 2; i <= 100; i+=2) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

     */



           // TODO 11 task
//        String str = "*";
//        for (int i = 0; i < 4; i++) {
//            for (int a = 0; a < 10; a++) {
//                System.out.print(STR."\{str}");
//            }
//            System.out.println(STR."\{str}");
//        }




//        String str = "*";





        int number = new Scanner(System.in).nextInt();
        String str = String.valueOf(number);
        String a = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            a += str.charAt(i);
        }
        if (str.equals(a)) {
            System.out.println(STR."Бул сан: \{str} полиндром");
        } else {
            System.out.println(STR."Бул сан: \{str} полиндром эмес");
        }














    }

}