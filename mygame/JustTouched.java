
package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;




public class JustTouched extends MyGdxGame{

    static int RjadX, RjadY;
    static  int nc=0;

    public static int getTouchX2() {
        return TouchX2;
    }

    public static void setTouchX2(int touchX2) {
        TouchX2 = touchX2;
    }

    private static int TouchX2;

    public static int getTouchY2() {
        return TouchY2;
    }

    public static void setTouchY2(int touchY2) {
        TouchY2 = touchY2;
    }

    private   static int TouchY2;

    public  static int IfJustTouched() {


        if (Gdx.input.justTouched()) {

            Touch.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(Touch);

            if ((Touch.x != TouchX2) & (Touch.y != TouchY2)) {
                TouchX2 = (int) Touch.x;
                TouchY2 = (int) Touch.y;

                TouchY2 = HEIGHT - TouchY2;

                RjadY = (TouchY2 / (HEIGHT / 4));

                RjadX = (TouchX2 / (WIDTH / 8));

            }
        else
            {
                Touch.set(0, 0, 0);
                TouchX2 = 0;
                TouchY2 = 0;
            }

            System.out.println(("rjad y= "+RjadY +" rjad x= " + RjadX));

    nc = ((RjadY * 8) + RjadX)+1;
    MyGdxGame.setNC(nc);

            System.out.println(" Touch=> " + nc);

        }

        return nc;

    }

}/////////////////////////
