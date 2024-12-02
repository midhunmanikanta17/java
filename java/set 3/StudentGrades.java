import java.util.Scanner;

class Statistics {
    // Method to calculate mean
    double mean(double[] arr) {
        double total = 0;
        for (double num : arr) {
            total += num;
        }
        return total / arr.length;
    }

    // Method to calculate standard deviation
    double sd(double[] arr) {
        double mean = mean(arr);
        double variance = 0;
        for (double num : arr) {
            variance += (num - mean) * (num - mean);
        }
        variance /= arr.length;
        return Math.sqrt(variance);
    }

    // Array to store frequency counts for each range
    int[] stat = new int[10];

    // Method to calculate frequency distribution
    void freq(double[] arr) {
        // Reset frequency array
        for (int i = 0; i < stat.length; i++) {
            stat[i] = 0;
        }

        for (double num : arr) {
            if (num >= 0 && num < 10) {
                stat[0]++;
            } else if (num >= 10 && num < 20) {
                stat[1]++;
            } else if (num >= 20 && num < 30) {
                stat[2]++;
            } else if (num >= 30 && num < 40) {
                stat[3]++;
            } else if (num >= 40 && num < 50) {
                stat[4]++;
            } else if (num >= 50 && num < 60) {
                stat[5]++;
            } else if (num >= 60 && num < 70) {
                stat[6]++;
            } else if (num >= 70 && num < 80) {
                stat[7]++;
            } else if (num >= 80 && num < 90) {
                stat[8]++;
            } else if (num >= 90) {
                stat[9]++;
            }
        }
    }
}

class StudentGrades {
    public static void main(String[] args) {
        Statistics obj = new Statistics();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int len = sc.nextInt();
        double[] arr = new double[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }

        double mean = obj.mean(arr);
        System.out.println("Mean marks of students: " + mean);

        double standardDeviation = obj.sd(arr);
        System.out.println("Standard deviation: " + standardDeviation);

        obj.freq(arr);

        System.out.println("Distribution table:");
        for (int k = 0; k < 10; k++) {
            System.out.println("Percentage of scores in range " + (k * 10) + " to " + (k * 10 + 9) + ": " +
                    (100.0 * obj.stat[k] / len) + "%");
        }

        sc.close();
    }
}
