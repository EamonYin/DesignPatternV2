package com.eamon.designpatternv2.Creational.Builder;

public enum Color {
    GREEN("green", "绿色"),
    BLUE("blue","蓝色"),
    BLACK("black","黑色"),
    WHITE("white","白色");

    private final String code;

    private final String message;

    Color(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
