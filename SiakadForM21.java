import java.util.Scanner;

public class SiakadForM21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double grade, highest = 0, lowest = 100;
        int pass = 0, fail = 0; // Tambahan variabel untuk menghitung passing/failing

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

            // Pengecekan batas kelulusan (minimum 60)
            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
        System.out.println("Number of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);

        sc.close();
    }
}