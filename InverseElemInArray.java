import java.util.Arrays;
public class InverseElemInArray {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] * -1;
        }
        return result;
    }

    public static int[] invertAnotherRealization(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}
