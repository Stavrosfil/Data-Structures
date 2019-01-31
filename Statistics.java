public class Statistics {
    static int[] stats;
    static int iterations, expectedIterations;

    public statistics(){
        stats = new int[2];
        iterations = 0;
        expectedIterations = 0;
    }

    public static void increaseIterations() {
        iterations++;
    }

    public static void setExpectedIterations(int a){
        expectedIterations = a;
    }

    public static int[] getStatistics() {
        stats[0] = iterations;
        stats[1] = expectedIterations;
        return stats;
    }
}