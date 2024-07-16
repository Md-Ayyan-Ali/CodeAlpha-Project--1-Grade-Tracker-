import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();

        for(int i=0; i<numGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + " : ");
            grades.add(sc.nextDouble());
        }

        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for(double grade : grades) {
            sum += grade;
            if(grade > highest) {
                highest = grade;
            }
            if(grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum/numGrades;

        System.out.println("Average: "+ average);
        System.out.println("Highest: "+ highest);
        System.out.println("Lowest: "+ lowest);
    }
}