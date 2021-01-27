package com.will;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {

    public static String answer(int n) {

        if(n % 2 == 1 || (n >= 6 && n <= 20)) {
            return "Weird";
        } else if(n > 20 || (n >= 2 && n <= 5)) {
            return "Not Weird";
        }
        return "help";

    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        System.out.println(Day3.answer(N));
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}