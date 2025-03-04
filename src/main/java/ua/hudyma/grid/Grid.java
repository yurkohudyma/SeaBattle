package ua.hudyma.grid;

import java.util.Arrays;

import static java.lang.System.out;

public class Grid {

    public static int size = 10;

    {
        gridArray = new char[size][size];
        fillGridArray();
    }

    public static char [][] gridArray;

    protected static void fillGridArray() {
        for (char[] chars : gridArray) {
            Arrays.fill(chars, '.');
        }
    }

    public static void viewGridArray() {
        for (int i = 0; i < size; i++) {
            out.print(i < 10 ? i + "  " : i + " ");
            for (int j = 0; j < size; j++) {
                out.print(gridArray[i][j] + "  ");
            }
            out.println();
        }
        out.print("  ");
        for (int i = 0; i < size; i++) {
            out.print(i <= 10 ? " " + i + " " : i + " ");
        }
        out.println();
    }
}
