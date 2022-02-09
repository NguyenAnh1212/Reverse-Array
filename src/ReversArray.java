import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        // khai báo biến size và mảng array
        int size;
        int[] array;
        // cho phép nhập số lượng phẩn tử trong mảng (size) điều kiện là không quá 20 ptu.
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        // khởi tạo mảng array và dùng vòng lặp for để thêm các giá trị vào mảng.
        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        // Vòng lặp for in ra các giá trị của mảng vừa tạo
        for (int i : array) {
            System.out.print(i + "\t");
        }
        // Đảo ngược vị trí của phần tử trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
