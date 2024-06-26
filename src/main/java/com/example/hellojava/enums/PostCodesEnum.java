package com.example.hellojava.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PostCodesEnum {
    /**
     * 济南
     */
    Jinan(250000, "济南"),

    /**
     * 青岛
     */
    Qingdao(266000, "青岛");

    private final int code;
    private final String area;

    /**
     * Find area by code
     *
     * @param code area code
     * @return area
     */
    public static String getArea(int code) {
        for (PostCodesEnum value : PostCodesEnum.values()) {
            if (value.getCode() == code) {
                return value.getArea();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(PostCodesEnum.getArea(250000));
    }
}
