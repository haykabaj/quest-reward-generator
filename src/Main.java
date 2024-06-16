import quest.QuestRewardGenerator;

public class Main {

    public static void main(String[] args) {

        int n = 100;
        String rewards = QuestRewardGenerator.generateQuestRewards(n);
        System.out.println("Generated rewards: " + rewards);
    }

}