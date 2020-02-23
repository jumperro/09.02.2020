package arrays;

public class seventh {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        System.out.println("Sum of even numbers -"+countEven(arr));
        System.out.println("Sum of odd numbers -"+countOdd(arr));
        if(IsSumEvenGreater(countEven(arr), countOdd(arr)))
        System.out.println("Sum of Even numbers is greater than sum of Odds");
        else
            System.out.println("Sum  of Odds is greater");
    }

    public static int countEven(int [] arr){
        int sumeven = 0;
        for(int i=1;i<arr.length;i++) {
            sumeven += arr[i];
            i++;
        }
        return sumeven;
    }

    public static int countOdd(int [] arr){
        int sumOdd = 0;
        for(int i=0;i<arr.length;i++){
            sumOdd+=arr[i];
            i++;
        }
        return sumOdd;
    }

    public static boolean IsSumEvenGreater(int sumEven, int sumOdd){
        return sumEven > sumOdd;

    }
}
