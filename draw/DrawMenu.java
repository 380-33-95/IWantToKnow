package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawMenu extends MyGdxGame {


    public static void Menu(){


        {

            TextureRegion ZastavkaGame = new TextureRegion(menu, 0, 0, WIDTH, HEIGHT);
            batch.draw(ZastavkaGame, 0, 0, 1, 1, WIDTH, HEIGHT, 1, 1, 0);

        }
    }

}
