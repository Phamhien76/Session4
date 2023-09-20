package UngdungBaiHoc;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        /*
         a.Nhập số dòng(row) và số cột(col) của mảng 2 chiều và khai báo,
           khởi tạo mảng 2 chiều số nguyên gồm row dòng và col cột
         b. Hiển thị menu và thực hiện các chức năng theo menu sau:
         ***********************MENU************************
         1. Nhập giá trị các phần tử mảng 2 chiều
         2. In giá trị các phần tử theo ma trận
         3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng
         4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng
         5. In ra giá trị lớn nhất và nhỏ nhất trong mảng
         6. Sắp xếp mảng tăng dần theo cột
         7. Thoát
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arrInt = new int[row][col];
        do {
            System.out.println("***********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.println("Hãy chọn chức năng: ");

            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arrInt[%d][%d]=", i, j);
                            arrInt[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%5d", arrInt[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    //3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng")
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                                System.out.print(arrInt[i][j] + " ");
                                sum += arrInt[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.printf("Tổng là: ", sum);
                    break;
                case 4:
                    //4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng")
                    int sumCheoChinh = 0;
                    if (row == col) {
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i == j || i + j == row - 1) {
                                    System.out.print(arrInt[i][j] + " ");
                                    sumCheoChinh += arrInt[i][j];
                                } else {
                                    System.out.print("  ");
                                }

                            }

                        }

                    } else {
                        System.out.println("Không phải mảng 2 chiều vuông");
                    }
                    System.out.printf("Tổng là chéo chính chéo phụ là: ", sumCheoChinh);
                    break;
                case 5:
                    //"5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
                    int min = arrInt[0][0];
                    int max = arrInt[0][0];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(max<arrInt[i][j]){
                                max=arrInt[i][j];
                            }
                            if(min>arrInt[i][j]){
                                min=arrInt[i][j];
                            }
                        }
                    }
                    System.out.printf("Giá trị max %d - Giá trị min %d ", min,max);
                    System.out.println();
                    break;
                case 6:
                    //"6. Sắp xếp mảng tăng dần theo cột");


                    System.out.println("Đã sắp xếp giảm dần");
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-7");

            }


        } while (true);

    }
}
