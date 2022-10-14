package com.benyissa;
import java.util.Scanner;
public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j;
        int k;
        j = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            k = scanner.nextInt();
            if (j > k) {
                System.out.println("false");
                return;
            }
            j = k;
        }
        System.out.println("true");
    }
}