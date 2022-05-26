import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        //Average of Numbers
//        System.out.println("*****Average of Numbers*****");
//        AverageOfNumbers a = new AverageOfNumbers(in);
//        a.getAverage();
//
//        //Average of Negative Numbers
//        System.out.println("\n*****Average of Negative Numbers*****");
//        a.getAverageOfNegative();
//
//        //Average of Positive Numbers
//        System.out.println("\n*****Average of Positive Numbers*****");
//        a.getAverageOfPositive();
//
//        //Positive Numbers
//        System.out.println("\n*****Positive Numbers*****");
//        List<Integer> nums = Arrays.asList(1, -5, -3, 4, 12, -8);
//        NumbersFilter p = new NumbersFilter();
//        p.printList(p.getPositive(nums));
//
//        //Divisible
//        System.out.println("\n*****Divisible*****");
//        ArrayList<Integer> nums2 = new ArrayList<>();
//        nums2.add(3);
//        nums2.add(2);
//        nums2.add(-17);
//        nums2.add(-5);
//        nums2.add(7);
//        p.printList(p.getDivisible(nums2));
//
//        //Printing User Input
//        System.out.println("\n*****Printing User Input*****");
//        PrintingUserInput printer = new PrintingUserInput();
//        printer.printInput(printer.getInput(in));
//
//        //Limited Numbers
//        System.out.println("\n*****Limited Numbers*****");
//        LimitedNumbers l = new LimitedNumbers();
//        l.getNumbers(in);
//        l.printNumbers();
//
//        //Unique Last Names
//        System.out.println("\n*****Unique Last Names*****");
//        UniqueLastNames n = new UniqueLastNames();
//        n.getNames(in);
//        n.printLastNames();
//
//        in.close();

        //Reading Files Per Line
        System.out.println("\n*****Reading Files Per Line*****");
        ReadingFiles r = new ReadingFiles();
        r.read("C:\\CTAC\\Full-Stack-104\\Day_63\\Streams_Practice\\src\\sampleFile.txt").stream().forEach(System.out::println);

        //Books from file
        System.out.println("\n*****Books from file*****");

    }
}
