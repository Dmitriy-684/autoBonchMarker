package org.example.enums;

public enum ParserSettings {

    URL("https://lk.sut.ru/cabinet/"),
    LOGIN_ID("users"),
    PASSWORD_ID("parole"),
    AUTH_ID("logButton"),
    TITLE_CLASS_NAME("title_item"),
    SCHEDULE_CLASS_NAME("l_menu_a"),
    START_LESSON_TITLE("Начать занятие"),
    SCROLL_CLASS_NAME("simple-little-table"),
    SCRIPT("arguments[0].scrollIntoView()");
    private final String field;
    ParserSettings(String field){
        this.field = field;
    }

    public String getField(){
        return field;
    }
}
