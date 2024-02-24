import java.util.Scanner;

public class findMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = sc.nextInt();
        double[] array = new double[size];

//        enter elements value in the list
        System.out.println("Enter elements value in the list");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("arr[%d] = ",i+1);
            array[i] = sc.nextDouble();
        }
//        print out the list
        System.out.println("Element in array");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + ", ");
        }

//        find max
        System.out.println("\nMax value in the array");
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max){
                max = array[i];
            }
        }
        System.out.println(max);

//        find min
        System.out.println("\nMin value in the array");
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
