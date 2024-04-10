package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPayPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (option) {
                case 1 -> {
                    System.out.print("상품명을 입력하세요: ");
                    String productName = sc.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int productPrice = sc.nextInt();

                    System.out.print("상품의 수량을 입력하세요: ");
                    int productQuantity = sc.nextInt();
                    sc.nextLine();

                    int totalProductPrice = productPrice * productQuantity;
                    System.out.println("상품명:" + productName + " 가격:" + productQuantity + " 합계:" + totalProductPrice);

                    totalPayPrice += totalProductPrice;
                }
                case 2 -> System.out.println("총 비용: " + totalPayPrice);
            }
        }
    }
}
