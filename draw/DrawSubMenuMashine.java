package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawSubMenuMashine extends MyGdxGame {

    public static void SubMenuMashine(){

            TextureRegion SubMenu = new TextureRegion(subMenuMashinetexture, 0, 0, WIDTH, HEIGHT);
            batch.draw(SubMenu, 0, 0, 1, 1, WIDTH, HEIGHT, 1, 1, 0);


    }
}
