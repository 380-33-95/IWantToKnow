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

    private static int StatusMenu; //0-start; 1-menu;






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


        if (Gdx.input.justTouched()) {

            IfJustTouched();

        }

       //TODO draw


        switch (getStatusMenu()){
            case(0):{
                //TODO draw zastavka
                DrawZastavka.Zastavka();

                if(getNC()>0){

                    setStatusMenu(1);

                }
                break;
            }

            case(1):{
                //TODO draw menu
                DrawMenu.Menu();
                //  setNC(0);

               if(Pause1sec.Pause1(Gdx.graphics.getDeltaTime())){
                   System.out.print("+");
                   SelectMenu.SelMenu(getNC());
               }

                break;
            }

            case (100):{
                DrawSubMenuMashine.SubMenuMashine();
                break;
            }

            case (200):{
                DrawSubMenuMashine.SubMenuMashine();
                break;
            }

            case (300):{
                DrawSubMenuMashine.SubMenuMashine();
                break;
            }

            case (400):{
                DrawSubMenuMashine.SubMenuMashine();
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
        atlastexture.dispose();

    }


}
