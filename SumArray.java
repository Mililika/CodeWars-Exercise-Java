public class SumArray {
    public static void main(String[] args) {
    }

    public static double sum(double[] numbers) {
        double resultSum = 0;
        if (numbers.length == 0) {
            return 0;
        }

        for (double elem : numbers) {
            resultSum += elem;
        }
        return resultSum;
    }
}
