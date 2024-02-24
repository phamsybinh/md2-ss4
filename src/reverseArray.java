import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
//        nhap, kiem tra kich thuoc mang
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }

        } while (size > 20);

//        nhap vao gia tri cac phan tu cho mang
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("arr[%d] = ", i+1);
            array[i] = sc.nextInt();
        }

//        duyet mang roi in ra
        System.out.println("Element in array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }

//        dao nguoc phan tu mang
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
//        in mang sau khi da dao nguoc
        System.out.println("\nReverse array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
        }
    }
}
