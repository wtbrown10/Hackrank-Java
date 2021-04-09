package com.will;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int count = 0;
            int highestCount = 0;

            while(n > 0){
                int remainder = n % 2;
                n = n/2;
                if(remainder == 0){
                    count = 0;
                } else if(remainder == 1){
                    count++;
                    if(count > highestCount) {
                        highestCount = count;
                    }
                }
            }
            System.out.println(highestCount);
            scanner.close();
        }
    }