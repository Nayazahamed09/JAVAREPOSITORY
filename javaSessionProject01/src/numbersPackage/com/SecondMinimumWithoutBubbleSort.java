package numbersPackage.com;

public class SecondMinimumWithoutBubbleSort 
{
	public static void main(String[] args) {
        int[] numbers = {7, 4, 3, 8, 2, 59, 6};
        int secondMin = findSecondMinimum(numbers);
        System.out.println("Second minimum number: " + secondMin);
    }

    public static int findSecondMinimum(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array length should be at least 2.");
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        return secondMin;
    }
}


