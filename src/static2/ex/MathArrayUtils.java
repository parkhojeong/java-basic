package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }


    public static Double average(int[] values) {
        int sum = sum(values);
        Double avg = (double) sum / values.length;
        return avg;
    }

    public static int min(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}
