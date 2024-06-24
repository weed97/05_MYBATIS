package com.ohgiraffers.common;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CategoryAndMenuDTO {

    private int code;
    private String name;
    private int refCategoryCode;

    private List<MenuDTO> menuList;
}
