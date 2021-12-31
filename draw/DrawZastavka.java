package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawZastavka extends MyGdxGame {

    public static void Zastavka(){

        {

            TextureRegion Zastavka = new TextureRegion(zastavka, 0, 0, WIDTH, HEIGHT);
            batch.draw(Zastavka, 0, 0, 1, 1, WIDTH, HEIGHT, 1, 1, 0);

        }
    }
}
