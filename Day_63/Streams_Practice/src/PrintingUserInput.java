import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    List<String> strings = new ArrayList<>();

    public List<String> getInput(Scanner in) {
        System.out.println("Please enter your strings below:");
        String input = "-1";
        while(!input.equals("")) {
            input = in.nextLine();
            strings.add(input);
        }
        return strings;
    }

    public void printInput(List<String> strings) {
        strings.forEach(System.out::println);
    }
}
