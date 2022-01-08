package com.mycompany.mygame;


import java.util.ArrayList;

public class SelectMenu {

  static int mashine[] = new int []{100, 1, 2, 9, 10, 17, 18, 25, 26};
  static int animals[] = new int[]{200, 3, 4, 11, 12, 19, 20, 27, 28};
  static int builders[] = new int[]{300, 5, 6, 13, 14, 21, 22, 29, 30};
  static int world[] = new int[]{400,7, 8, 15, 16, 23, 24, 31, 32};





     static ArrayList<int[]> massblok = new ArrayList<int[]>();


    public static void SelMenu(int nc){

        massblok.add(mashine);
        massblok.add(animals);
        massblok.add(world);
        massblok.add(builders);


        for (int [] bytes : massblok) {

            for (int cn:bytes
                 ) {

                if (nc==cn){
                    System.out.println("menu="+bytes[0]);
                    MyGdxGame.setStatusMenu(bytes[0]);
                    MyGdxGame.setNC(0);
                    break;
                }
            }
        }




    }

}
