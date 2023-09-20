package UngdungBaiHoc;

import java.util.Scanner;

public class Mang2chieu {
    public static void main(String[] args) {
        /*
        1.Nhập vào số dòng(row) và số cột (col) của mảng 2 chiều số nguyên
        2. khởi tạo mảng 2 chiều với row dòng và col cột
        3. Hiển thị menu và thực hiện các chức năng theo menu sau:
        *******************MENU************************
        1.Nhập giá trị các phần tử của mảng
        2. In các giá trị phần t của mảng
        3. Tính tổng các phần tử của mảng
        4. Tìm giá trị nhỏ nhất và lớn nhất trong mảng
        5. thoát
         */
        //1.Nhập vào số dòng(row) và số cột (col) của mảng 2 chiều số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng:");
        int col = Integer.parseInt(scanner.nextLine());
        //2. khởi tạo mảng 2 chiều với row dòng và col cột
        int[][] arrInt = new int[row][col];

        do {
            System.out.println("*******************MENU************************");
            System.out.println("1.Nhập giá trị các phần tử của mảng");
            System.out.println("2. In các giá trị phần tử của mảng");
            System.out.println(" 3. Tính tổng các phần tử của mảng");
            System.out.println("4. Tìm giá trị nhỏ nhất và lớn nhất trong mảng");
            System.out.println("5. thoát");
            System.out.println("Hãy chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arrInt[%d][%d]=", i, j);
                            arrInt[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    //2. In các giá trị phần tử của mảng");
                    System.out.println("Các phần tử của mãng 2 chiều là:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            //in dong
                            System.out.printf("%5d", arrInt[i][j]);
                        }
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    //3. Tính tổng các phần tử của mảng
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            sum += arrInt[i][j];
                        }
                        System.out.printf("Tồng mảng là: ", sum);
                    }
                    break;
                case 4:
                    //Tìm giá trị nhỏ nhất và lớn nhất
                    int min = arrInt[0][0];
                    int max = arrInt[0][0];
                    ;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (min > arrInt[i][j]) {
                                min = arrInt[i][j];
                            }
                            if (max < arrInt[i][j]) {
                                max = arrInt[i][j];
                            }
                        }
                    }
                    System.out.printf("Giá trị nhỏ nhất: %d - Giá trị lớn nhất: %d\n", min, max);

                    break;

                case 5:
                    System.exit(0);
                default:
                    System.out.println("hãy chon 1-5");
            }
        }while (true);
    }
}
