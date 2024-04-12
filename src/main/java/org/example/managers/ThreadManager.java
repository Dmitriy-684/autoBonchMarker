package org.example.managers;

import org.example.enums.ClassTimeMinutes;
import org.example.enums.UserData;
import static org.example.managers.BonchManager.loginBonch;;

public class ThreadManager {

    private static boolean isAuth;
    public static void markPresence() throws InterruptedException{

        Thread dmitriyAuth;
        Thread maksimAuth;
        Thread davidAuth;
        int minutes;

        while (true){
            minutes = TimeManager.checkTime();
            isAuth = minutes != -1 && isAuth;
            dmitriyAuth = getNewThread(UserData.USERNAME_DMITRIY.getData(), UserData.PASSWORD_DMITRIY.getData());
            maksimAuth = getNewThread(UserData.USERNAME_MAKSIM.getData(), UserData.PASSWORD_MAKSIM.getData());
            davidAuth = getNewThread(UserData.USERNAME_DAVID.getData(), UserData.PASSWORD_DAVID.getData());
            if (minutes >= ClassTimeMinutes.LESSON_1ST.getMinutes() &
                    minutes <= ClassTimeMinutes.LESSON_5END.getMinutes() & !isAuth){
                dmitriyAuth.start();
                maksimAuth.start();
                davidAuth.start();
            }
            else {
                isAuth = false;
            }
            Thread.sleep(900000);
        }
    }

    private static Thread getNewThread(String USERNAME, String PASSWORD){
        return new Thread(){
            public void run(){
                try {
                    isAuth = loginBonch(USERNAME, PASSWORD);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}
