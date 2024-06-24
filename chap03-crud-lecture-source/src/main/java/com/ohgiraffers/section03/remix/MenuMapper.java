package com.ohgiraffers.section03.remix;

import java.util.List;

// 데이터 베이스 접근을 하기때문에, DAO 인터페이스라고 한다.
public interface MenuMapper {

    List<MenuDTO> selectAllMenu();

    MenuDTO selectMenuByCode(int code);

    int insertMenu(MenuDTO menu);

    int modifyMenu(MenuDTO menu);

    int deleteMenu(int code);
}
