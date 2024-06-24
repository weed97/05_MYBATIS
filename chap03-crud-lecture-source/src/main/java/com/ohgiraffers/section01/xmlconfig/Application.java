package com.ohgiraffers.section01.xmlconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    /*
     * 시스템 요구사항
     * 1. 메뉴 전체조회
     * 2. 메뉴 코드로 메뉴 조회
     * 3. 신규 메뉴 추가
     * 4. 메뉴 수정
     * 5. 메뉴 삭제
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("============= 오지라퍼 메뉴 관리 시스템 =============");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 메뉴 코드로 메뉴 조회하기");
            System.out.println("3. 신규 메뉴 등록하기");
            System.out.println("4. 메뉴 수정하기");
            System.out.println("5. 메뉴 삭제하기");
            System.out.print("메뉴 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: menuController.selectAllMenu(); break;
                case 2: menuController.selectMenuByCode(inputMenuCode()); break;
                case 3: menuController.registMenu(inputMenu()); break;
                case 4: menuController.modifyMenu(inputModifyMenu()); break;
                case 5: menuController.deleteMenu(inputMenuCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        } while (true);
    }

    // 메뉴코드를 입력받는 메서드
    private static Map<String, String> inputMenuCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    // 메뉴 정보를 입력받는 메서드
    private static Map<String, String> inputMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("메뉴 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    // 수정할 메뉴 정보를 입력하는 메서드
    private static Map<String, String> inputModifyMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 메뉴 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.print("수정할 메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 메뉴 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("수정할 카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }








}
