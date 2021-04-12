package com.will;
import java.util.*;

public class Day12 {



    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person{
        private int[] testScores;
        private int[] numScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here

        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate() {
            int addedScore = 0;
            int average = 0;
            for(int i = 0; i < testScores.length; i++) {
                addedScore += testScores[i];
            }
            average = addedScore / testScores.length;
            return  average > 89 ? 'O' :
                    average > 79 ? 'E' :
                            average > 69 ? 'A' :
                                    average > 54 ? 'P' :
                                            average > 39 ? 'D' : 'T';
        }
        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
    }


}
