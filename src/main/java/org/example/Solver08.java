package org.example;
// Homework 08
// Task 3
public class Solver08 {

    public int squareRoot(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        int root;
        {
            if (D < 0) {
                root = 0;
                return root;
            } else if (D == 0) {
                root = 1;
                return root;
            } else if (D > 0) {
                root = 2;
                return root;
            }
            return squareRoot(2, 3, 4);
        }
    }
}