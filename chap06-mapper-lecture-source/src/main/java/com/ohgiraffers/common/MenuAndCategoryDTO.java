package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MenuAndCategoryDTO {
    private int code;
    private String name;
    private int price;
    private CategoryDTO category;
    private String orderableStatus;
}
