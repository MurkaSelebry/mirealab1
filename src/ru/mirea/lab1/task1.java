package ru.mirea.lab1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Input ur name: ");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        System.out.printf("Hello, %s!",data);
    }

}

