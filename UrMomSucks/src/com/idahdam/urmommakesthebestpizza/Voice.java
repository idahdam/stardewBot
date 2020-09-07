package com.idahdam.urmommakesthebestpizza;


import com.gtranslate.Audio;
import com.gtranslate.Language;
import javazoom.jl.decoder.JavaLayerError;
import javazoom.jl.decoder.JavaLayerException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Voice {

    private static TextToSpeechBois textToSpeechBois;
    private static String[] accessBad;

    //public String[] accessBad;

//    public static void main(String[] args) throws IOException, JavaLayerException, NullPointerException {
//
//   }

   public void testPlayingAudio(int urOption) throws IOException, JavaLayerException, NullPointerException{
        Audio audio = Audio.getInstance();
       ArrayList<String> fuckMeDadRetrieve = new TextToSpeechBois().addBadArrayList();
       ArrayList<String> dontFuckMeDadRetrieve = new TextToSpeechBois().addGoodArrayList();
       int numberBad = (int) (Math.random() * fuckMeDadRetrieve.size());
       int numberGood = (int) (Math.random() * dontFuckMeDadRetrieve.size());
       if (urOption == 1){
           InputStream sound = audio.getAudio(fuckMeDadRetrieve.get(numberBad), Language.ENGLISH);
           audio.play(sound);
           assert (sound!=null);
       }
       else if(urOption == 2){
           InputStream sound = audio.getAudio(dontFuckMeDadRetrieve.get(numberGood), Language.ENGLISH);
           audio.play(sound);
           assert (sound!=null);
       }


   }
}
