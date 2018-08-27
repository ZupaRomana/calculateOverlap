package nowy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;

    public static void main( String[] args )
    {
        int result = 0;

        /*
        a = first rectangle bottom left corner
        b = first rectangle top right corner

        c = second rectangle bottom left corner
        d = second rectangle top right corner
         */

        int[] a = {-12, -4};
        int[] b = {-1, -2};
        int[] c = {0, 0};
        int[] d = {100, 3000};

        if (rightPositions(a, b, c, d)) {
            result = ((Math.min(b[X_INDEX], d[X_INDEX]) - Math.max(a[X_INDEX], c[X_INDEX])) * (Math.min(b[Y_INDEX], d[Y_INDEX]) - Math.max(a[Y_INDEX], c[Y_INDEX])));
        } else {
            result = 0;
        }

        System.out.println(result);
    }

    private static boolean rightPositions(int[] a, int[] b, int[] c, int[] d) {
        if (c[X_INDEX] < b[X_INDEX] && c[Y_INDEX] < b[Y_INDEX] && d[X_INDEX] > a[X_INDEX] && d[Y_INDEX] > a[Y_INDEX]) {
            return true;
        }
        return false;
    }
}
