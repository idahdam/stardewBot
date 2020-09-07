package com.idahdam.urmommakesthebestpizza;

import javazoom.jl.decoder.JavaLayerException;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Key;
import java.util.ArrayList;

public class OpenBrowser {

    public synchronized void OpenBrowserNowBitch(int urOption) throws AWTException, InterruptedException, IOException, JavaLayerException {
        //String url = "http://twitter.com/idahdam";
        VideoLink videoLink = new VideoLink();
        videoLink.setBadLink();
        videoLink.setGoodLink();
        String urlBad = videoLink.getBadLink();
        String urlGood = videoLink.getGoodLink();
        Robot robot = new Robot();
        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE) ){
            Desktop desktop = Desktop.getDesktop();
            if (urOption == 1){
                try{
                    desktop.browse(new URI(urlBad));

                }
                catch (IOException | URISyntaxException ex){
                    ex.printStackTrace();
                }
                finally {
                    Thread.sleep(500);
                    robot.keyPress(KeyEvent.VK_F11);
                    new Voice().testPlayingAudio(1);
                }
            }

            else if (urOption == 2){
                try{
                    desktop.browse(new URI(urlGood));

                }
                catch (IOException | URISyntaxException ex){
                    ex.printStackTrace();
                }
                finally {
                    Thread.sleep(500);
                    robot.keyPress(KeyEvent.VK_F11);
                    new Voice().testPlayingAudio(2);
                }
            }

        }
        else{
            Runtime runtime = Runtime.getRuntime();
            try{
                String url2 = "http://idahdam.github.io";
                runtime.exec("rundll32 url.dll, FileProtocolHandle " + url2);
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
