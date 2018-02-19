package by.it.osipik.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String[] list = new String[20];
        for (int i = 0; i <20; i++) {
            String s = reader.readLine();
            list[i] = s;
        }}}
//        int j;
//        int size;
//        size=20;
//        for (int i = 0; i <size ; i++)
//            for (int j = size-1; j >=i ; j--) {
//if (String[j-1])>String

//public static void sort(int[] array) {



