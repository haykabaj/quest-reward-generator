package quest;

public class QuestRewardGenerator {

    public static String generateQuestRewards(int N) {

        StringBuilder sb = new StringBuilder();

        double midpoint = N / 2.0;
        double steepness = 0.05;

        for (int i = 0; i < N; i++) {
            double sigmoidInput = (double) i - midpoint;
            double probability = sigmoidProbability(sigmoidInput, steepness);
            if (Math.random() < probability) {
                sb.append('s');
            } else {
                sb.append('b');
            }
        }
        return sb.toString();
    }

    private static double sigmoidProbability(double x, double steepness) {
        return 1.0 / (1.0 + Math.exp(-steepness * x));
    }

}
