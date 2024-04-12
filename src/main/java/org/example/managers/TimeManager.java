package org.example.managers;

import org.example.enums.ClassTimeMinutes;

import java.util.Date;

public class TimeManager {

    protected static int checkTime(){
        Date time;
        time = new Date();
        int minutes = time.getHours()*60 + time.getMinutes();
        ClassTimeMinutes lesson = ClassTimeMinutes.LESSON_1ST;
        if (getLesson(minutes) != lesson){
            minutes = -1;
        }
        return minutes;
    }

    private static ClassTimeMinutes getLesson(int m){
        if (m <= ClassTimeMinutes.LESSON_2ND.getMinutes()-ClassTimeMinutes.RECCES.getMinutes())
            return ClassTimeMinutes.LESSON_1ST;
        if (m <= ClassTimeMinutes.LESSON_3D.getMinutes()-ClassTimeMinutes.RECCES.getMinutes())
            return ClassTimeMinutes.LESSON_2ND;
        if (m <= ClassTimeMinutes.LESSON_4TH.getMinutes()-ClassTimeMinutes.RECCES.getMinutes())
            return ClassTimeMinutes.LESSON_3D;
        if (m <= ClassTimeMinutes.LESSON_5TH.getMinutes()-ClassTimeMinutes.RECCES.getMinutes())
            return ClassTimeMinutes.LESSON_4TH;
        return ClassTimeMinutes.LESSON_5TH;
    }
}
