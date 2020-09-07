package com.idahdam.urmommakesthebestpizza;

import java.util.ArrayList;
import java.util.Iterator;

public class TextToSpeechBois {

    ArrayList<String> fuckMeDad = new ArrayList<>();
    ArrayList<String> dontFuckMeDad = new ArrayList<String>();

//    public static void main(String[] args) {
//
//


//    FindIterable<Document> iterDoc = collection.find();
//
//    int i = 1;
//
//        for (Document document : iterDoc) {
//        System.out.println(document.get("link") + "\n");
//        i++;
//    }
//    }

    public String[] addBad(){
        String[] youDidBad = new String[5];
        youDidBad[0] = "Your mom sucks?";
        return youDidBad;
    }

    public ArrayList<String> addBadArrayList(){
        fuckMeDad.add("I guess you tried to cheat huh?");
        fuckMeDad.add("WOW, WHAT THE HELL?");
        fuckMeDad.add("HAHAHAHA, you pressed that button?!?! TRYNA CHEAT, huh?");
        fuckMeDad.add("Just uninstall the cheat bro.");
        return fuckMeDad;
    }

    public ArrayList<String> addGoodArrayList(){
        dontFuckMeDad.add("Good job, for not cheating.");
        dontFuckMeDad.add("Congrats, check out this video");
        dontFuckMeDad.add("Ayy, that's my boy");
        return  dontFuckMeDad;
    }


}
