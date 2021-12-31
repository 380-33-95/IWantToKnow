
package com.mycompany.mygame;


import com.badlogic.gdx.audio.Music;

import java.util.ArrayList;

import static com.mycompany.mygame.MyMusik.MapSound;

public class Blok {


  public static ArrayList<Blok> BlokList = new ArrayList<>(83);


  public Blok() {
    BlokList.add(this);
  }

  public static Blok BlokListGet(int kj) {
    Blok df = null;
    df = BlokList.get(kj);
    return df;
  }


  private int Index;

  public void setIndex(int ind) {
    Index = ind;
  }

  public int getIndex() {
    return Index;
  }




  private  int x;
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }


  private  int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }



  private int Kadr;

  public int getKadr() {
    return this.Kadr;
  }

  public void setKadr(int kadr) {
    this.Kadr = kadr;
  }


    ////////Musik Blok////////

    public Music musicBlok;

    public void PlayMusik(int nomMusic, float valMusic) {

        musicBlok = MapSound.get(nomMusic);
        musicBlok.setVolume(valMusic);
        musicBlok.play();

    }

    ////////////////



  public static Blok b01 = new Blok();
  public static Blok b02 = new Blok();
  public static Blok b03 = new Blok();
  public static Blok b04 = new Blok();
  public static Blok b05 = new Blok();
  public static Blok b06 = new Blok();
  public static Blok b07 = new Blok();
  public static Blok b08 = new Blok();
  public static Blok b09 = new Blok();
  public static Blok b10 = new Blok();
  public static Blok b11 = new Blok();
  public static Blok b12 = new Blok();
  public static Blok b13 = new Blok();
  public static Blok b14 = new Blok();
  public static Blok b15 = new Blok();
  public static Blok b16 = new Blok();
  public static Blok b17 = new Blok();
  public static Blok b18 = new Blok();
  public static Blok b19 = new Blok();
  public static Blok b20 = new Blok();
  public static Blok b21 = new Blok();
  public static Blok b22 = new Blok();
  public static Blok b23 = new Blok();
  public static Blok b24 = new Blok();
  public static Blok b25 = new Blok();
  public static Blok b26 = new Blok();
  public static Blok b27 = new Blok();
  public static Blok b28 = new Blok();
  public static Blok b29 = new Blok();
  public static Blok b30 = new Blok();
  public static Blok b31 = new Blok();
  public static Blok b32 = new Blok();

}
