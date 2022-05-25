import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    Scanner in;
    List<Double> nums = new ArrayList<>();

    public AverageOfNumbers(Scanner in) {
        this.in = in;
    }

    public void getAverage() {
        System.out.println("Please enter your number values, enter 'end' to stop: ");
        String num = "";
        while(!num.equals("end")) {
            num = in.nextLine();
            try {
                nums.add(Double.parseDouble(num));
            } catch (Exception e) {
                if(!num.equals("end")) {
                    System.out.println("Please enter a number value.");
                }
            }
        }
        double average;
        try {
            average = nums.stream()
                .mapToDouble((n) -> n)
                .average()
                .getAsDouble();
        } catch (Exception e) {
            average = 0;
        }

        System.out.println("Average of the numbers: " + average);
    }

    public void getAverageOfNegative() {
        double average;
        try {
            average = nums.stream()
                .filter(n -> n < 0)
                .mapToDouble((n) -> n)
                .average()
                .getAsDouble();
        } catch (Exception e){
            average = 0;
        }
        System.out.println("Average of the numbers: " + average);
    }

    public void getAverageOfPositive() {
        double average;
        try {
            average = nums.stream()
                    .filter(n -> n > 0)
                    .mapToDouble((n) -> n)
                    .average()
                    .getAsDouble();
        } catch (Exception e) {
            average = 0;
        }
        System.out.println("Average of the numbers: " + average);
    }
}
