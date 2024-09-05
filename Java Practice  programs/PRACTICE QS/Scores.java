import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of scores: ");
        int numofScores = scanner.nextInt();
        int[] scores = new int[numofScores];
        System.out.println("Enter the scores:");
        for (int i = 0; i < numofScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int score : scores){
            sum += score;
        }
        double average = sum/numofScores;

        int highest = scores[0];
        int lowest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.printf("Average Score: %.1f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        scanner.close();
    }
}
