package com.will;
import java.util.*;


public class Day13 {

    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    class MyBook extends Book {
        // Declare your class here. Do not use the 'public' access modifier.
        // Declare the price instance variable
        private int price;

        public MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);


        }
        /**
         *   Class Constructor
         *
         *   @param title The book's title.
         *   @param author The book's author.
         *   @param price The book's price.
         **/
        // Write your constructor here

        /**
         *   Method Name: display
         *
         *   Print the title, author, and price in the specified format.
         **/
        // Write your method here
    }
// End class



}
