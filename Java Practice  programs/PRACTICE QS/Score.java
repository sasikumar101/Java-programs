import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        int[][] scores = new int[3][4];
        scores[0] = new int[]{85, 92, 88, 90}; 
        scores[1] = new int[]{78, 85, 82, 89}; 
        scores[2] = new int[]{90, 88, 91, 86}; 
        System.out.println("Average scores for each student:");
        StudentAverages(scores);
        System.out.println("\nAverage scores for each subject:");
        Averages(scores);
    }
    public static void StudentAverages(int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = (double) total / scores[i].length;
            System.out.printf("Student %d: %.2f%n", i + 1, average);
        }
    }
    public static void Averages(int[][] scores) {
        String[] subjects = {"Math", "Science", "English", "History"};
        
        for (int j = 0; j < scores[0].length; j++) {
            int total = 0;
            for (int i = 0;i<scores.length; i++) {
                total += scores[i][j];
            }
            double average = (double) total / scores.length;
            System.out.printf("%s: %.2f%n", subjects[j], average);
        }
    }
}
