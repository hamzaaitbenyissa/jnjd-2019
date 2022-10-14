package com.benyissa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

//        here we iterate the list of players and each round we remove losers until the winner is alone in the list
        int i = 0;
        while (numbers.size() > 1) {
            i = i == numbers.size() ? 0 : 1;
            while (i < numbers.size()) {
                numbers.remove(i);
                i += 1;
            }
        }
    }
}