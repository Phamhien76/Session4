package UngdungBaiHoc;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        /*
        1.Khai báo mãng số nguyên gồm 5 phần tử
        2. Hiển th menu và thực hiên các chức năng theo menu sau'
        *******************MENU*************************
        1. Nhập giá trị các phần tử mãng
        2. In ra các giá trị phần tử trong mãng
        3. in ra các giá trị phần tử chẵn trong mãng
        4. In ra các phần tử có chỉ số lẻ trong mãng
        5. tính tổng các phần tử trong mãng
        6. sắp xếp mãng tăng dần (thuật toán selection sort)
        7. Thoát
         */
        Scanner scanner = new Scanner(System.in);
        //nhập số phần tử của mãng
        System.out.println("Nhập số phần tử của mãng:");
        int arrSize = Integer.parseInt(scanner.nextLine());
        //Khai báo mãng và khởi tạo
        int[] number = new int[arrSize];
        //in ra menu và thức hiện các chức năng
        do {
            System.out.println("*******************MENU*************************");
            System.out.println("1. Nhập giá trị các phần tử mãng");
            System.out.println("2. In ra các giá trị phần tử trong mãng");
            System.out.println("3. in ra các giá trị phần tử chẵn trong mãng");
            System.out.println("4. In ra các phần tử có chỉ số lẻ trong mãng");
            System.out.println("5. tính tổng các phần tử trong mãng");
            System.out.println("6. sắp xếp mãng tăng dần (thuật toán selection sort)");
            System.out.println("7. Thoát");
            System.out.println("Hãy chọn chức năng mà bạn muốn thực hiện:");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị các phần tử của mãng");
                    for (int i = 0; i < number.length; i++) {
                        System.out.printf("number[%d] ", i);
                        number[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Các giá trị phần tử trong mãng là: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(number[i] + "");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("In ra các giá trị phần tử chẵn trong mãng");
                    for (int i = 0; i < 5; i++) {
                        if (i % 2 == 0) {
                            System.out.println(number[i]);
                        }
                        System.out.println();
                    }
                    break;
                case 4:

                    System.out.println("In ra các giá trị phần tử lẻ trong mãng");
                    for (int i = 0; i < number.length; i++) {
                        if (i % 2 == 1) {
                            System.out.printf("%d\t", number[i]);
                        }

                    }
                    break;
                case 5:
                    int tong = 0;
                    for (int element : number) {
                        tong += element;
                    }
                    System.out.println("Tổng các phần tử trong mãng là: " + tong);
                    break;
                case 6:
                    for (int i = 0; i < number.length - 1; i++) {
                        for (int j = 0; j < number.length; j++) {
                            if (number[i] > number[j]) {
                                int temp = number[i];
                                number[i] = number[j];
                                number[j] = temp;
                            }

                        }
                    }
                    System.out.println("Đã sắp xếp mảng tăng dần");
                    break;

                case 7:
                    System.exit(0);
                default:
                    System.out.println("Hãy chon 1-7 ");
            }
        } while (true);
    }
}
