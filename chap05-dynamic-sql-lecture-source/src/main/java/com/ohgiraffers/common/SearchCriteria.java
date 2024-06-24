package com.ohgiraffers.common;


// 검색조건과 키워드를 전달하는 객체
public class SearchCriteria {
    private String condition; // 검색 조건(메뉴 or 카테고리명)
    private String value; // 검색어

    public SearchCriteria() {
    }

    public SearchCriteria(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "condition='" + condition + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
