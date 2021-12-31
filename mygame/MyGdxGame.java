package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mycompany.draw.DrawMenu;
import com.mycompany.draw.DrawSubMenuMashine;
import com.mycompany.draw.DrawZastavka;

import static com.mycompany.mygame.JustTouched.IfJustTouched;
import static com.mycompany.mygame.JustTouched.setTouchX2;
import static com.mycompany.mygame.JustTouched.setTouchY2;


public class MyGdxGame extends Blok implements ApplicationListener {

    public MyGdxGame(){
    }


    public static OrthographicCamera camera;
    public static SpriteBatch batch;
    public static Texture atlastexture;
    public static Texture zastavkatexture;
    public static Texture menutexture;
    public static Texture subMenuMashinetexture;


    protected final static int HEIGHT = 600;
    protected final static int WIDTH = 1200;

    public static String menu;


    public static int getStatusMenu() {
        return StatusMenu;
    }

    public static void setStatusMenu(int statusMenu) {
        StatusMenu = statusMenu;
    }

    private static int StatusMenu; //0-start; 1-menu; 20-mashine; 30-builders; 40-animals; 50-world




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
        atlastexture = new Texture("atlas.png");
        menutexture = new Texture("menu.png");
        zastavkatexture = new Texture("zastavka.png");
        subMenuMashinetexture = new Texture("subMenuMashine.png");

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
            setNC(0);





if (getNC()==0){
    if (Gdx.input.justTouched()) {

        IfJustTouched();

    }
}
            if(getNC()==1||getNC()==2||
               getNC()==9|| getNC()==10||
               getNC()==17|| getNC()==18||
               getNC()==25|| getNC()==26){
               setStatusMenu(20);
            }

            if(getNC()==3||getNC()==4||
                    getNC()==11|| getNC()==12||
                    getNC()==19|| getNC()==20||
                    getNC()==27|| getNC()==28){
                setStatusMenu(30);
            }

            if(getNC()==5||getNC()==6||
                    getNC()==13|| getNC()==14||
                    getNC()==21|| getNC()==22||
                    getNC()==29|| getNC()==30){
                setStatusMenu(40);
            }

            if(getNC()==7||getNC()==8||
                    getNC()==15|| getNC()==16||
                    getNC()==23|| getNC()==24||
                    getNC()==31|| getNC()==32){
                setStatusMenu(50);
            }



        }

        if (getStatusMenu()==20){
            if (Gdx.input.justTouched()) {

                IfJustTouched();

            }

            //TODO draw game
          DrawSubMenuMashine.SubMenuMashine();
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
        atlastexture.dispose();

    }


}
