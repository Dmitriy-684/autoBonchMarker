package org.example.enums;

public enum ClassTimeHours {

    LESSON_1ST(9),
    LESSON_2ND(10),
    LESSON_3D(13),
    LESSON_4TH(14),
    LESSON_5TH(16),
    LESSON_5END(18);

    private final int hours;
    ClassTimeHours(int hours){
        this.hours = hours;
    }

    int getHours(){
        return hours;
    }
}
