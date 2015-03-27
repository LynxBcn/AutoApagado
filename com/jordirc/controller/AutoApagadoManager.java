package com.jordirc.controller;

/**
 * Created by LynxBcn on 22/03/2015.
 */

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.jordirc.view.AutoApagadoView;

public class AutoApagadoManager {

    /**
     * @param args
     */

    public AutoApagadoManager(){

        // Use an appropriate Look and Feel
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                start();
            }
        });
    }

    public void start(){
        new AutoApagadoView();
    }
}