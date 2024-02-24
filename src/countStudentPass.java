import java.util.Scanner;

public class countStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cho phép nhập vào điểm của tối đa 30 sinh viên, sau đó hiển thị số lượng " +
                "sinh viên đã thi đỗ");
       int size;
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size>30){
                System.out.println("Size does not exceed 30");
            }
        } while (size>30);

        double[] testScore = new double[size];
        System.out.println("Enter student's test score");
        for (int i = 0; i < testScore.length; i++) {
            System.out.printf("testScore[%d] = ", (i+1));
            testScore[i] = sc.nextDouble();
        }
//        duyet vong for kiem tra gia tri tren trung binh roi tra ve so luong sinh vien da thi do
        int passExamNumber = 0;
        for (int i = 0; i < testScore.length; i++) {
            if (testScore[i] >= 5) {
                passExamNumber +=1;
            }
        }
        System.out.println("The number of students passing the exam is " + passExamNumber);

    }
}
