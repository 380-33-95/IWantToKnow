package com.mycompany.mygame;

public class Pause1sec {

    public static boolean isFlagTime() {
        return flagTime;
    }

    public static void setFlagTime(boolean flagTime) {
        flagTime = flagTime;
    }

    private static boolean flagTime=false;

    static long current;



    public static boolean Pause1(float currentTime){

       boolean end=false;

      if(!isFlagTime() && current==0){
         current= (long) (currentTime+1000);
         setFlagTime(true);
      }
      else {
          if(current<=currentTime){
              setFlagTime(false);
              current=0;
              end=true;
          }
      }

        return end;
    }
}
