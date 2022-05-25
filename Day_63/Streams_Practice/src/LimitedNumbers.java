import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    List<Double> nums = new ArrayList<>();

    public void getNumbers(Scanner in) {
        System.out.println("Please enter your numbers below:");
        double input = 0;
        while(input >= 0) {
            try {
                input = Double.parseDouble(in.nextLine());
                nums.add(input);
            } catch(Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public void printNumbers() {
        List<Double> numsFilter = nums.stream()
                .filter(n -> (n >= 1) && (n <= 5))
                .collect(Collectors.toList());
        numsFilter.forEach(System.out::println);
    }
}
