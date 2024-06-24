package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    /*
    * Controller
    * 뷰와 모델 사이의 전달자 역할
    * 모델에게 명령을 전달해주는 역할로, 모델의 상태를 변경 할 수 있다.
    * 뷰에 명령을 보냄으로써 모델의 표시 방법을 바꿀 수 있다.
    *
    * Service 를 알고 있어야 한다.
    * */

    private final MenuService menuService;
    private final PrintResult printResult;

    // 생성자 주입
    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        // view로 전달
        if(menuList != null){
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMenuByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        // service로 보내기
        MenuDTO menu = menuService.selectMenuByCode(code);

        // view로 전달
        if(menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMenu(Map<String, String> parameter) {

        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);

        boolean result = menuService.registMenu(menu);

        // view로 전달
        if(result){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }


    public void modifyMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setCode(code);
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);

        boolean result = menuService.modifyMenu(menu);

        // view로 전달
        if(result) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        boolean result = menuService.deleteMenu(code);

        if(result) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }











}
