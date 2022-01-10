package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mycompany.draw.DrawMenu;
import com.mycompany.draw.DrawSubMenu;
import com.mycompany.draw.DrawZastavka;

import static com.mycompany.mygame.JustTouched.IfJustTouched;
import static com.mycompany.mygame.JustTouched.setTouchX2;
import static com.mycompany.mygame.JustTouched.setTouchY2;
import static com.mycompany.mygame.SelectMenu.animals;
import static com.mycompany.mygame.SelectMenu.builders;
import static com.mycompany.mygame.SelectMenu.massblok;
import static com.mycompany.mygame.SelectMenu.technics;
import static com.mycompany.mygame.SelectMenu.world;



public class MyGdxGame extends Blok implements ApplicationListener {

    public MyGdxGame(){
    }


    public static OrthographicCamera camera;
    public static SpriteBatch batch;
    public static Texture atlasTexture;
    public static Texture zastavkaTexture;
    public static Texture menuTexture;
    public static Texture subMenuAnimalsTexture;
    public static Texture subMenuTechnicsTexture;
    public static Texture subMenuBuildersTexture;
    public static Texture subMenuWordTexture;

    protected final static int HEIGHT = 600;
    protected final static int WIDTH = 1200;

    public static String menu;


    public static int getStatusMenu() {
        return StatusMenu;
    }

    public static void setStatusMenu(int statusMenu) {
        StatusMenu = statusMenu;
    }

    private static int StatusMenu; //0-start; 1-menu;






    public static int getNC() {
        wnc=NC;
        NC=0;
        return wnc;
    }

    public static void setNC(int nc) {
        NC = nc;
    }

    private static int NC;
    public static int wnc;

    static Vector3 Touch = new Vector3();



    ///////////////////////////////////////////////


    static {  //////////////initialisation

        setStatusMenu(0);
        setTouchX2(0);
        setTouchY2(0);

        massblok.add(technics);
        massblok.add(animals);
        massblok.add(world);
        massblok.add(builders);

    }


    @Override
    public void create() {

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTH, HEIGHT);


        batch = new SpriteBatch();
        atlasTexture = new Texture("atlas.png");
        menuTexture = new Texture("menu.png");
        zastavkaTexture = new Texture("zastavka.png");
        subMenuTechnicsTexture = new Texture("subMenuTechnics.png");
        subMenuAnimalsTexture = new Texture("subMenuAnimals.png");
        subMenuBuildersTexture = new Texture("subMenuBuilders.png");
        subMenuWordTexture = new Texture("subMenuWorld.png");
    }

    ////////////////////////////


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        batch.setProjectionMatrix(camera.combined);

        batch.begin();

        if (Gdx.input.justTouched()) {
            IfJustTouched();
        }

       //TODO draw


        switch (getStatusMenu())
        {
            case(0):
                {
                //TODO draw zastavka
                DrawZastavka.Zastavka();

                if (getNC() > 0) {
                    setStatusMenu(1);
                }
                break;
                }


            case(1):
                {
                DrawMenu.Menu();
                SelectMenu.SelMenu(getNC());
                    break;
                }

            case (100)://Technics
                {
                 DrawSubMenu.SubMenu(subMenuTechnicsTexture);
                 break;
                }

            case (200)://Building
                {
                DrawSubMenu.SubMenu(subMenuBuildersTexture);
                break;
                }

            case (300)://Animals
                {
                DrawSubMenu.SubMenu(subMenuAnimalsTexture);
                break;
                }

            case (400)://World
                {
                DrawSubMenu.SubMenu(subMenuWordTexture);
                break;
                }

        }


        batch.end();


    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

        //    ClearStart.NewStart();
        Gdx.app.exit();

    }


    @Override
    public void dispose() {

        batch.dispose();
        atlasTexture.dispose();

    }


}
