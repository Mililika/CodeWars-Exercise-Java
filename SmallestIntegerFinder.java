public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int minimalValue = args[0];
        for (int i = 1; i < args.length; i++) {
            if (minimalValue > args[i]) {
                minimalValue = args[i];
            }
        }
        return minimalValue;
    }

}
