package org.example.enums;

public enum ClassTimeMinutes {

    LESSON_1ST(60 * ClassTimeHours.LESSON_1ST.getHours()),
    LESSON_2ND(45 + ClassTimeHours.LESSON_2ND.getHours() * 60),
    LESSON_3D(ClassTimeHours.LESSON_3D.getHours() * 60),
    LESSON_4TH(45 + ClassTimeHours.LESSON_4TH.getHours() * 60),
    LESSON_5TH(30 + ClassTimeHours.LESSON_5TH.getHours() * 60),
    LESSON_5END(5 + ClassTimeHours.LESSON_5END.getHours()* 60),
    RECCES(10);
    private final int minutes;

    ClassTimeMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getMinutes(){
        return minutes;
    }
}
