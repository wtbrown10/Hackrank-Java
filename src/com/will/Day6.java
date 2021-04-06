package com.will;

import java.io.*;
import java.util.*;


public class Day6 {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            // Scanner scan = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            scan.nextLine();

            for(int count = 0; count < T; count++){

                String S = scan.nextLine();
                char[] myCharArray = S.toCharArray();
                String first = "";
                String second = "";

                for(int i = 0; i < S.length(); i++){
                    if(i % 2 == 0){
                        first += myCharArray[i];
                        // System.out.println(first);
                    }else {
                        second += myCharArray[i];
                        // System.out.println(second);
                    }
                }
                System.out.println(first + " " + second);
            }

        }
    }
