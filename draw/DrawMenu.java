package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawMenu extends MyGdxGame{

    public static void Menu(){

            TextureRegion Menu = new TextureRegion(menuTexture, 0, 0, WIDTH, HEIGHT);
            batch.draw(Menu, 0, 0, 1, 1, WIDTH, HEIGHT, 1, 1, 0);


    }


}
