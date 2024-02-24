import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        System.out.println("Tim gia tri trong mang");
        String[] students = {"thanh","thao","tu","khanh","ngoan","truong","canh","hoa","ngoc"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to find");
        String input_name = sc.nextLine();
//        tim gia tri nguoi dung nhap vao
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                check = true;
                System.out.println("Position of the student in the list " + input_name + " is " + i);
                break;
            }

        }
        if (!check){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
