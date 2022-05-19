package ru.skypro;

import jdk.internal.icu.text.UnicodeSet;

import java.util.*;

public class Main {

    private static final List<Integer> nums = (List.of(1, 2, 3, 4, 4, 5, 5, 6, 7));

    private static Integer ball;
    private static Integer tree;
    private static Integer car;
    private static Integer window;
    private static Integer door;

    private static final List<Integer> words = (List.of(ball, tree, tree, car, window, ball, door));


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(nums);

        Collections.sort(nums);

        int prevNum = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> words = new HashSet<>(words);
        System.out.println(words);
    }

    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
