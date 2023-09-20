package UngdungBaiHoc;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        /*
        a. Nhập số phần tử của mảng (n) và khai báo, khởi tạo mảng số nguyên gồm n phần tử
        b. Hiển thị menu và thực hiện các chức năng theo menu sau:
        **********************MENU************************
        1. Nhập giá trị các phần tử mảng
        2. Hiển thị giá trị các phần tử mảng
        3. In các phần tử giá trị chẵn trong mảng và tính tổng
        4. In các phần tử có giá trị là số nguyên tố và tính tổng
        5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng
        6. Sắp xếp mảng giảm dần
        7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m
        8. Thoát
         */

        //a. Nhập số phần tử của mảng (n) và khai báo, khởi tạo mảng số nguyên gồm n phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mãng:");
        int arrSize = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[arrSize];
        //b. Hiển thị menu và thực hiện các chức năng theo menu sau:
        do {
            System.out.println("**********************MENU************************");
            System.out.println(" 1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần");
            System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m");
            System.out.println("8. Thoát");
            System.out.println("Hãy nhập chức năng mà muốn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("arrInt%d ", i);
                        arrInt[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Các giá trị các phần tử trong mảng là: ");
                    for (int element : arrInt) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Giá trị phần tử chẳn trong mảng là: ");
                    int sum = 0;
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i] % 2 == 0) {
                            System.out.print("\t" + arrInt[i]);

                            sum += arrInt[i];
                        }

                    }
                    System.out.println("\nTổng là: " + sum);
                    break;
                case 4://"4. In các phần tử có giá trị là số nguyên tố và tính tổng");
                    System.out.println("Giá trị là số nguyên tố trong mảng la: ");
                    int primeSum = 0;
                    //kiểm tra số nguyên tố;
                    boolean isPrime = true;
                    for (int k : arrInt) {
                        isPrime = true;
                        for (int j = 2; j < k; j++) {
                            if (k % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime && k >= 2) {
                            System.out.print(k + " ");
                            primeSum += k;
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    //5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng"
                    int max=arrInt[0];
                    int min=arrInt[0];
                    for (int j : arrInt) {
                        if (max < j) {
                            max = j;
                        }
                        if (min > j) {
                            min = j;
                        }
                    }
                    System.out.printf("Giá trị max %d - Giá trị min %d ", min,max);
                    System.out.println();
                    break;
                case 6:
                    //"6. Sắp xếp mảng giảm dần");
                    for (int i=0; i<arrInt.length-1;i++){
                        for (int j=1; j<arrInt.length;j++){
                            if(arrInt[i]<arrInt[j]){
                                int temp= arrInt[i];
                                arrInt[i]=arrInt[j];
                                arrInt[j]=temp;

                            }
                        }

                    }

                    System.out.println("Đã sắp xếp giảm dần");
                    System.out.println();
                    break;
                case 7:
                    //7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m"
                    int sumM=0;
                    System.out.println("Nhập số nguyên m: ");
                    int m= Integer.parseInt(scanner.nextLine());
                    for (int i=0; i<arrInt.length;i++){
                        if(arrInt[i]==m){
                            sumM++;

                        }
                    }
                    System.out.print("Có %d có giá trị là m ");
                    System.out.println();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chon từ 1-8");

            }
        } while (true);
    }
}
