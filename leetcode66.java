import java.util.Arrays;

public class leetcode66 {
     public static int[] addOneToLast(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }
        int[] result = new int[a.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 9};
        int[] result = addOneToLast(a);
        System.out.println("Modified array: " + Arrays.toString(result));
    }
}

}
