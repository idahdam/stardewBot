package com.idahdam.urmommakesthebestpizza;

import javazoom.jl.decoder.JavaLayerException;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Map;

public class DetectingKey {
    private static boolean run  = true;
    public void KeyDetector() {

        // Might throw a UnsatisfiedLinkError if the native library fails to load or a RuntimeException if hooking fails
        GlobalKeyboardHook keyboardHook = new   GlobalKeyboardHook(true); // Use false here to switch to hook instead of raw input

        System.out.println("Script started, play Stardew Valley now and don't try to cheat!");
            /*
            for (Map.Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet()) {
                    System.out.format("%d is: %s\n", keyboard.getKey(), keyboard.getValue());
            }
             */

        keyboardHook.addKeyListener(new GlobalKeyAdapter() {

            @Override
            public void keyPressed(GlobalKeyEvent event) {
//                System.out.println(event);
//                System.out.print(event.getKeyChar());
                if (event.getVirtualKeyCode() == GlobalKeyEvent.VK_DELETE) {
                    run = false;
                }

                // akan ngeprint jika detect P (key 80)
                else if (event.getVirtualKeyCode() == 80){
//                        System.out.println(event);
//                        System.out.println(event.getVirtualKeyCode() + "  " + event.getKeyChar());
                    try {
                        new OpenBrowser().OpenBrowserNowBitch(1);
                    } catch (AWTException | InterruptedException | JavaLayerException | IOException e) {
                        e.printStackTrace();
                    }
                }

                else if (event.getVirtualKeyCode() == 191){
//                        System.out.println(event);
//                        System.out.println(event.getVirtualKeyCode() + "  " + event.getKeyChar());
                    try {
                        new OpenBrowser().OpenBrowserNowBitch(2);
                    } catch (AWTException | InterruptedException | JavaLayerException | IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            @Override
            public void keyReleased(GlobalKeyEvent event) {
                // akan print jika angkat key
                //System.out.println(event);
            }
        });

        try {
            while(run) {
                Thread.sleep(128);
            }
        } catch(InterruptedException e) {
            //Do nothing
        } finally {
            keyboardHook.shutdownHook();
            System.out.println("Shutting down...");
        }
    }
}
