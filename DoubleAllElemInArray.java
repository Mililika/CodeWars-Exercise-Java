public class DoubleAllElemInArray {
    public static int[] map(int[] arr) {
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = arr[i] * 2;
        }
        return resultArray;
    }
}
