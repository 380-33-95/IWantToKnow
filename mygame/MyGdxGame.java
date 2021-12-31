package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mycompany.draw.DrawMenu;
import com.mycompany.draw.DrawZastavka;

import static com.mycompany.mygame.JustTouched.IfJustTouched;
import static com.mycompany.mygame.JustTouched.setTouchX2;
import static com.mycompany.mygame.JustTouched.setTouchY2;


public class MyGdxGame extends Blok implements ApplicationListener {

    public static OrthographicCamera camera;
    public static SpriteBatch batch;
    public static Texture atlas;
    public static Texture zastavka;
    public static Texture menu;



    protected final static int HEIGHT = 600;
    protected final static int WIDTH = 1200;


    public static int getStatusMenu() {
        return StatusMenu;
    }

    public static void setStatusMenu(int statusMenu) {
        StatusMenu = statusMenu;
    }

    private static int StatusMenu; //0-start; 1-menu; 2-game

    public static int getNC() {
        return NC;
    }

    public static void setNC(int nc) {
        NC = nc;
    }

    private static int NC;

    static Vector3 Touch = new Vector3();



    ///////////////////////////////////////////////


    static {  //////////////initialisation

        setStatusMenu(0);
        setTouchX2(0);
        setTouchY2(0);

    }


    @Override
    public void create() {

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTH, HEIGHT);

        batch = new SpriteBatch();
        atlas = new Texture("atlas.png");
        menu = new Texture("menu.png");
        zastavka = new Texture("zastavka.png");


    }

    ////////////////////////////
    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        batch.setProjectionMatrix(camera.combined);


        batch.begin();


       //TODO draw

        if(getStatusMenu()==0){

            if (Gdx.input.justTouched()) {

                IfJustTouched();

            }
            //TODO draw zastavka
            DrawZastavka.Zastavka();

            if(getNC()>0){
                setStatusMenu(1);
            }

        }
        if (getStatusMenu()==1){

            if (Gdx.input.justTouched()) {

                IfJustTouched();

            }

            //TODO draw menu
            DrawMenu.Menu();

        }

        if (getStatusMenu()==3){
            if (Gdx.input.justTouched()) {

                IfJustTouched();

            }

            //TODO draw game
            DrawMenu.Menu();
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
        atlas.dispose();

    }


}
