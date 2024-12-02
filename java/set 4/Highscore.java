import java.io.*;
import java.util.*;

class Highscore {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String filename = input.nextLine();
            Scanner fileScanner = new Scanner(new File(filename));
            int max = Integer.MIN_VALUE;
            while (fileScanner.hasNextInt()) {
                int score = fileScanner.nextInt();
                max = Math.max(max, score); 
            }
            if (max != Integer.MIN_VALUE) {
                System.out.println("The Highest score is: " + max);
            } else {
                System.out.println("No scores found.");
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
