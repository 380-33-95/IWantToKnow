package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawGame extends MyGdxGame {


    public static void DrGame() {
        {

            TextureRegion ZastavkaGame = new TextureRegion(atlasTexture, 0, 0, WIDTH, HEIGHT);
            batch.draw(ZastavkaGame, 0, 0, 1, 1, WIDTH, HEIGHT, 1, 1, 0);


        }
    }

}
