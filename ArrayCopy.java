import java.util.Arrays;

public class ArrayCopy {
    public static void main(String args[]) {
        System.out.println("Before " + Arrays.toString(args));
        String copy[] = Arrays.copyOf(args, 4);
        System.out.println("Before " + Arrays.toString(copy));
        copy[0] = "A";
        System.out.println("After " + Arrays.toString(args));
        System.out.println("After " + Arrays.toString(copy));
    }
}
