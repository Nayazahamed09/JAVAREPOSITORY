package numbersPackage.com;

public class SecondMinimumWithBubbleSort 
{
	public static void main(String[] args) {
        int[] numbers = {7, 4, 3, 8, 2, 5,9, 6};
        int secondMin = findSecondMinimum(numbers);
        System.out.println("Third Min Number: " + secondMin);
    }

    public static int findSecondMinimum(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array length should be at least 3 .");
            return -1;
        }

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >  arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr[2]; // Second minimum number
    }

}
