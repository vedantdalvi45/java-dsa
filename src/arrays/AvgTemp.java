package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Days : ");
        int numDays = scanner.nextInt();
        int sum = 0;

        int[] temps = new int[numDays];

        for (int i = 0; i < numDays; i++) {
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }
        double average = (double) sum /numDays;
        int above =0;
        for (int temp : temps) {
            if (temp > average)
                above++;
        }


        System.out.println(Arrays.toString(temps));
        System.out.println("Average Temp : "+average);
        System.out.println("Days Above Average : "+above);
    }
}
