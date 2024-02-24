import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remove elements from the array");
        int size;
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
//        enter array's value

        int[] array = new int[size];
        System.out.println("Enter array's value ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("arr[%d] = ", i+1);
            array[i] = sc.nextInt();
        }

        System.out.println("Enter your element want to remote");
        int x = sc.nextInt();
        int index_del = 0;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                check = true;
                index_del = i;
                break;
            }
        }
        int[] newArray = new int[array.length-1];
        if (!check){
            System.out.println("Not found " + x + " in the list");
        } else {
//            sao chep phan tu tu mang cu den mang moi (truoc phan tu muon xoa)
            System.arraycopy(array, 0, newArray, 0, index_del);
//            sao chep phan tu tu mang cu den mang moi (sau phan tu muon xoa)
            System.arraycopy(array, index_del+1, newArray, index_del,newArray.length-index_del);
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i]+"\t");
            }
        }
//        print array
    }
}
