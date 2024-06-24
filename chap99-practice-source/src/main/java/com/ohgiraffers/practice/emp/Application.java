package com.ohgiraffers.practice.emp;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();

        do {
            System.out.println("================ employee 테스트 메뉴 ================");

            // 1명이 사원과 부서명을 볼 수 있도록 출력
            // EmployeeAndDDeptDTO
            System.out.println("1. association 테스트");

            // 각부서에 있는 직원 정보를 출력
            // DeptAndEmployeeDTO
            System.out.println("2. collection 테스트");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();


            switch (no) {
                case 1: break;
                case 2: break;
            }
        } while(true);
    }
}
