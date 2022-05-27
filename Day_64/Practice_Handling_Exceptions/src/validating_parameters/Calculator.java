package validating_parameters;

public class Calculator {
    public int factorial(int num) {
        if(num < 0) {
            throw new IllegalArgumentException("Number must be greater than or equal to zero.");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0) {
            throw new IllegalArgumentException("Set size must be a positive number.");
        }
        if(subsetSize < 0) {
            throw new IllegalArgumentException("Subset size must be a positive number.");
        }
        if(subsetSize > setSize) {
            throw new IllegalArgumentException("Set size must be larger than subset size.");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
