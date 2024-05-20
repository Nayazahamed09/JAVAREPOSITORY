package numbersPackage.com;

public class PrintCombinationOfTwoNumbersGivesSum11 {

	public static void main(String[] args) {
		
		int[] numbers = {7, 4, 3, 8, 2, 5,9, 6};
        int targetSum = 11;

        // Loop through the array to find pairs
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + targetSum);

	}

}
        }
	}
}
