package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri USD can doi");
        number = scanner.nextInt();
        int rate = number*23000;
        System.out.println("doi " + number + " USD thanh " + rate+" VND");
    }
}
