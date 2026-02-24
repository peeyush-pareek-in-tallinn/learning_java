import java.util.Scanner;

public class studentGrades {

    public static void main(String[] args) {

        System.out.println("Welcome to the Student Grade Finder\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the score: ");
        float score = input.nextFloat();
        String grade = findGrade(score);
        System.out.println("Your Grade based on your score " + score + " is: " + grade);

    }

    public static String findGrade(float score) {
        String grade = score >= 80 ? "High" : score < 50 ? "Low" : "Moderate";
        return grade;
    }
}
