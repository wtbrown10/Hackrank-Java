package com.will;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Day14 {


    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        Difference(int[] elements) {
            this.elements = elements;
            this.maximumDifference = maximumDifference;
        }

        void computeDifference() {
            maximumDifference = 0;
            for(int i = 0; i < elements.length; i++) {
                for(int j = 1; j < elements.length; j++) {
                    // System.out.println("abs of " + elements[i] + " and " + elements[j] + "is: " + Math.abs(elements[i] - elements[j]));
                    if(Math.abs(elements[i] - elements[j]) > maximumDifference) {
                        maximumDifference = Math.abs(elements[i] - elements[j]);
                    }
                }
            }
        }

    } // End of Difference class
}
