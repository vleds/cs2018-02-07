package by.it.ihnatovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a=sc.nextInt();
        System.out.print(i);
        System.out.print(" ");
        System.out.println(a);
        System.out.println("Sum = " + (i+a));}




}
