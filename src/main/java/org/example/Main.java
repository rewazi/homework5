package org.example;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) * 2;
        }


        System.out.println("Массив: " + Arrays.toString(array));

        
        int min = Arrays.stream(array).min().orElseThrow();
        int max = Arrays.stream(array).max().orElseThrow();

        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);


        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num != min && num != max) {
                sum += num;
                count++;
            }
        }


        double average = (double) sum / count;

        System.out.println("Среднее арифметическое : " + average);
    }
}
