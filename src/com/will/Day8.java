package com.will;

import java.util.*;
import java.io.*;

public class Day8 {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            Map<String, Integer> phoneBook = new HashMap<String, Integer>();
            int n = in.nextInt();

            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                phoneBook.put(name, phone);
            }

            while(in.hasNext()){
                String s = in.next();
                // Write code here
                if (Objects.isNull(phoneBook.get(s))) {
                    System.out.println("Not found");
                } else {
                    System.out.println(s + "=" + phoneBook.get(s));
                }
            }
            in.close();
        }
    }