package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");

            System.out.print("선택: ");
            int option = input.nextInt();

            switch (option) {
                case 1 -> { // 입금
                    System.out.print("입금액을 입력하세요: ");
                    balance = depositAmount(balance, input.nextInt());
                }
                case 2 -> { // 출금
                    System.out.print("출금앱을 입력하세요: ");
                    balance = withdrawAmount(balance, input.nextInt());
                }
                case 3 -> System.out.println("현재 잔액: " + balance + "원"); // 잔액확인
                case 4 -> {
                    System.out.println("시스템을 종료합니다.");
                    return;
                }
                default -> System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }


    }


    public static int depositAmount(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdrawAmount(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int balance = 0;
//
//        while (true) {
//            System.out.println("-----------------------------------");
//            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
//            System.out.println("-----------------------------------");
//
//            System.out.print("선택: ");
//            int option = input.nextInt();
//
//            if (option == 4) { // 종료
//                System.out.println("시스템을 종료합니다.");
//                break;
//            }
//            switch (option) {
//                case 1 -> { // 입금
//                    System.out.print("입금액을 입력하세요: ");
//                    balance = depositAmount(balance, input.nextInt());
//                }
//                case 2 -> { // 출금
//                    System.out.print("출금앱을 입력하세요: ");
//                    balance = withdrawAmount(balance, input.nextInt());
//                }
//                case 3 -> System.out.println("현재 잔액: " + balance + "원"); // 잔액확인
//            }
//        }
//
//
//    }
//
//
//    public static int depositAmount(int balance, int depositAmount) {
//        balance += depositAmount;
//        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
//
//        return balance;
//    }
//
//    public static int withdrawAmount(int balance, int withdrawAmount) {
//        if (balance >= withdrawAmount) {
//            balance -= withdrawAmount;
//            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
//        } else {
//            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
//        }
//
//        return balance;
//    }
}
