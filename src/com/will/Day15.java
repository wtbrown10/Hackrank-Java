package com.will;
import java.io.*;
import java.util.*;

public class Day15 {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {


        public static Node insert(Node head, int data) {

            if (head == null) {
                return new Node(data);
            }

            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data);

            return head;
        }

        public static void display(Node head) {
        }
    }
}