package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawPole extends MyGdxGame {

    static int color;
   

    public static void DrawStartPole() {


        for (int pp = 7; pp <= 76; pp++) {

            if (BlokList.get(pp).getIndex() > 0) {



                //idex
                TextureRegion PoleIndex = new TextureRegion(atlastexture, BlokList.get(pp).getIndex() * 100, color, 100, 100);
                batch.draw(PoleIndex, BlokList.get(pp).getX(), BlokList.get(pp).getY(), 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);


				

            }
        }

    }

    public static void InitialisationCoordinatPole() {

        for (int kp = 7; kp <= 76; kp++) {

            int x, y;
            y = ((kp - 7) / 7) % 10;
            x = (kp - 7) - (y * 7);

            BlokList.get(kp).setX(x * (WIDTH / 7));
            BlokList.get(kp).setY(HEIGHT - (y * (HEIGHT / 12) + (HEIGHT / 12) * 2));



        }
    }


}
