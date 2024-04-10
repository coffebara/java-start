package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
            for(int j=0; j<students[i].length; j++) {
                System.out.println(subjects[j] + " 점수:");
                students[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i < students.length; i++) {
            int sum = 0;
            for(int j=0; j<students[i].length; j++) {
                sum += students[i][j];
            }
            double avg = (double) sum / students[i].length;
            System.out.println(i+1 + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] students = new int[4][3];
//        int sum = 0;
//        double avg = 0;
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
//            System.out.print("국어 점수:");
//            students[i][0] = sc.nextInt();
//            System.out.print("영어 점수:");
//            students[i][1] = sc.nextInt();
//            System.out.print("수학 점수:");
//            students[i][2] = sc.nextInt();
//        }
//
//        for (int i=0; i < students.length; i++) {
//            for(int j=0; j<students[i].length; j++) {
//                sum += students[i][j];
//                avg = (double) sum / students[i].length;
//            }
//            System.out.println(i+1 + "번 학생의 총점: " + sum + ", 평균: " + avg);
//            sum =0;
//        }
//    }
}
