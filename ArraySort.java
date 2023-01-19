import java.util.Arrays;

public class ArraySort {
    public static void main(String args[]) {
        int num[] = { 1, 2, 63, 33, 63, 5, 2 };
        int l = num.length;
        int i;
        System.out.println("Given numbers : ");
        for (i = 0; i < l; i++)
            System.out.print(num[i] + " ");
        Arrays.sort(num);
        System.out.println("\nSorted : ");
        for (i = 0; i < l; i++)
            System.out.print(num[i] + " ");
    }
}
