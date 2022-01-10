package com.mycompany.draw;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawSubMenu extends MyGdxGame {

    public static void SubMenu(Texture textur){

            TextureRegion SubMenu = new TextureRegion(textur, 0, 0, WIDTH, HEIGHT);
            batch.draw(SubMenu, 0, 0, 1, 1, WIDTH, HEIGHT, 1, 1, 0);

            if (getNC()==31 || getNC()==32){
                setStatusMenu(1);
            }

    }
}
