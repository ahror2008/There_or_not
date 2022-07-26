package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Sonni kiriting");
        int toFind = scanner.nextInt();
        boolean found = false;
        int count = 0;
        for (int i1 = 0; i1 < num.length; i1++) {
            if (num[i1] == toFind) {
                count++;
            }
        }

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(toFind + " bor");
            System.out.println(count);
        } else {
            System.out.println(toFind + " yoq");
        }

    }
}
