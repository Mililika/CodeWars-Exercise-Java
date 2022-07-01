public class InverseElemInArray {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] * -1;
        }
        return result;
    }
}
