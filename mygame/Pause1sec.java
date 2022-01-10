package com.mycompany.mygame;

public class Pause1sec {

    public static boolean isStartTimer() {
        return StartTimer;
    }

    public static void setStartTimer(boolean startTimer) {
        startTimer = startTimer;
    }

    private static boolean StartTimer =false;

    static long current;
    static long currentTime;



    public static boolean Pause1(float currentTime){

       boolean end=false;

      if(!isStartTimer() && current==0){
         current= (long) (currentTime+1000);
         setStartTimer(true);
      }
      else {
          if(current<=currentTime){
              setStartTimer(false);
              current=0;
              end=true;
          }
      }

        return end;
    }


    public static boolean Pausa(int pause){

        currentTime=com.badlogic.gdx.utils.TimeUtils.millis();

        if(!StartTimer && (current==0)){
            current=currentTime+pause;
            StartTimer=true;
        }
        else {
            if (currentTime>=current){
                StartTimer=false;
                current=0;
            }
        }
        System.out.println("+");
        return StartTimer;
    }


    //////////////////////////
}
