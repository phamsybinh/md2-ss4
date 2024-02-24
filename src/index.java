import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so hang");
        int row = sc.nextInt();
        System.out.println("Nhap vao so cot");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Nhap vao cac gia tri cua mang");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        while (true) {
            System.out.println("===========MENU==========\n" +
                    "1. Nhập vào giá trị các phần tử mảng \n" +
                    "2. In ra các phần tử mảng \n" +
                    "3. Hiển thị dưới dạng ma trận \n" +
                    "4. In ra đường chéo chính\n" +
                    "5. In ra Đường chéo phụ \n" +
                    "6. In ra đường biên \n" +
                    "7. Thoát chường trình ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    break;
                case 2:
                    // in ra cac phan tu mang
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.println(array[i][j] + " ");
                        }
                    }
                    break;
                case 3:
//                    hien thi duoi dang ma tran
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("%d\t", array[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
//                    in duong cheo chinh
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (i == j) {
                                System.out.printf("%d \t", array[i][j]);
                            } else {
                                System.out.printf("%s \t", "");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
//                    in duong cheo phu
                    if (row == col) {
                        for (int i = 0; i < array.length; i++) {
                            for (int j = 0; j < array[i].length; j++) {
                                if (j + i == array.length - 1) {
                                    System.out.printf("%d \t", array[i][j]);
                                } else {
                                    System.out.printf("%s\t", "");
                                }
                            }
                            System.out.println();
                        }

                    }
                    break;
                case 6:
//                    in ra duong bien
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (i==0 || j==0 || i==array.length-1 || j==array.length-1) {
                                System.out.printf("%d \t", array[i][j]);
                            } else {
                                System.out.printf("%s\t", "");
                            }
                        }
                        System.out.println();
                    }
            }
        }

    }
}
