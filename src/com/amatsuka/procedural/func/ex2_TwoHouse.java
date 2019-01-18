package com.amatsuka.procedural.func;

import com.amatsuka.contracts.RunnableExercise;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Проверить влезаютли два прямоугольника в третий
 */

public class ex2_TwoHouse implements RunnableExercise {

    private static int WIDTH = 0;
    private static int LENGTH = 1;

    public void run() {

        int[] place = new int[2];
        int[] firstHouse = new int[2];
        int[] secondHouse = new int[2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер участка ш д");

        place[WIDTH] = sc.nextInt();
        place[LENGTH] = sc.nextInt();

        System.out.println("Введите размер первого дома ш д");

        firstHouse[WIDTH] = sc.nextInt();
        firstHouse[LENGTH] = sc.nextInt();

        System.out.println("Введите размер второго дома ш д");

        secondHouse[WIDTH] = sc.nextInt();
        secondHouse[LENGTH] = sc.nextInt();

        Arrays.sort(place);

        System.out.println(checkPlaceForHouses(place, firstHouse, secondHouse));
    }

    @Override
    public String description() {
        return "Проверить влезаютли два прямоугольника в третий";
    }

    private boolean checkPlaceForHouses(int[] place,int[] firstHouse,int[] secondHouse) {
        int[][] pairs = new int[4][2];

        pairs[0] = new int[]{firstHouse[WIDTH] + secondHouse[WIDTH], Math.max(firstHouse[LENGTH], secondHouse[LENGTH])};
        pairs[1] = new int[]{firstHouse[LENGTH] + secondHouse[WIDTH] , Math.max(firstHouse[WIDTH], secondHouse[LENGTH])};
        pairs[2] = new int[]{firstHouse[WIDTH] + secondHouse[LENGTH], Math.max(secondHouse[LENGTH], firstHouse[WIDTH])};
        pairs[4] = new int[]{firstHouse[LENGTH] + secondHouse[LENGTH], Math.max(firstHouse[WIDTH], secondHouse[WIDTH])};

        for (int i = 0; i < pairs.length - 1; i++) {
            Arrays.sort(pairs[i]);

            if ((pairs[i][WIDTH] <= place[WIDTH]) && (pairs[i][LENGTH] <= place[LENGTH])) return true;
        }

        return false;
    }
}
