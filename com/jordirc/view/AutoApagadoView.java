package com.jordirc.view;

/**
 * Created by LynxBcn on 22/03/2015.
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Locale;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.jordirc.controller.Validar;
import com.jordirc.util.Translatrix;



public class AutoApagadoView extends JFrame implements ActionListener {

    private JButton boton1 = new JButton();
    private JButton boton2 = new JButton();
    private JButton boton3 = new JButton();
    private JButton boton4 = new JButton();
    private JButton boton5 = new JButton();
    private JButton boton6 = new JButton();
    private JButton boton7 = new JButton();

    private JLabel etiqueta1 = new JLabel();
    private JLabel etiqueta2 = new JLabel();

    private JSeparator separador1 = new JSeparator();
    private JSeparator separador2 = new JSeparator();

    private JTextField campoTexto1 = new JTextField();

    private Container container;
    private GroupLayout layout;

    public AutoApagadoView(){

		/* Localize for language */
        Translatrix.setBundleName("com.jordirc.resources.LanguageResources");
        Locale baseLocale = (Locale) null;
        Translatrix.setLocale(baseLocale);

        this.setTitle("-- AutoApagado by LynxBcn v.0.2.4--");
        this.setLocation(400, 200);

        this.container = this.getContentPane();
        this.layout = new GroupLayout(this.container);

        this.container.setLayout(showView(this.layout));

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private GroupLayout showView(GroupLayout capa1){

        this.etiqueta1.setText(Translatrix.getTranslationString("_CHOOSE_TIME"));
        this.etiqueta2.setText(Translatrix.getTranslationString("_SET_TIME"));

        this.boton1.setText(Translatrix.getTranslationString("_MIN30"));
        this.boton1.setActionCommand("min30");
        this.boton1.addActionListener(this);

        this.boton2.setText(Translatrix.getTranslationString("_MIN45"));
        this.boton2.setActionCommand("min45");
        this.boton2.addActionListener(this);

        this.boton3.setText(Translatrix.getTranslationString("_MIN60"));
        this.boton3.setActionCommand("min60");
        this.boton3.addActionListener(this);

        this.boton4.setText(Translatrix.getTranslationString("_MIN90"));
        this.boton4.setActionCommand("min90");
        this.boton4.addActionListener(this);

        this.boton5.setText(Translatrix.getTranslationString("_MIN120"));
        this.boton5.setActionCommand("min120");
        this.boton5.addActionListener(this);

        this.boton6.setText(Translatrix.getTranslationString("_SET_MIN"));
        this.boton6.setActionCommand("setTime");
        this.boton6.addActionListener(this);

        this.boton7.setText(Translatrix.getTranslationString("_ABORT"));
        this.boton7.setActionCommand("abort");
        this.boton7.addActionListener(this);

        capa1.setHorizontalGroup(
                capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(capa1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(etiqueta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etiqueta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(capa1.createSequentialGroup()
                                                .addGroup(capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(capa1.createSequentialGroup()
                                                                .addComponent(boton1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(boton2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(boton3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(boton4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(boton5))
                                                        .addGroup(capa1.createSequentialGroup()
                                                                .addComponent(campoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(boton6)))
                                                .addGap(0, 10, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capa1.createSequentialGroup()
                                                .addGroup(capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(boton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addContainerGap())))
        );
        capa1.setVerticalGroup(
                capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(capa1.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(boton1)
                                        .addComponent(boton2)
                                        .addComponent(boton3)
                                        .addComponent(boton4)
                                        .addComponent(boton5))
                                .addGap(18, 18, 18)
                                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(etiqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(capa1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton6))
                                .addGap(18, 18, 18)
                                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        return capa1;
    }

    private void min30ActionPerformed(ActionEvent e){
        System.out.println("Se apagará en 30 min");
        String [] cmd = {"shutdown","-s","-t", "1800"}; //Comando de apagado en windows
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void min45ActionPerformed(ActionEvent e){
        System.out.println("Se apagará en 45 min");
        String [] cmd = {"shutdown","-s","-t", "2700"}; //Comando de apagado en windows
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void min60ActionPerformed(ActionEvent e){
        System.out.println("Se apagará en 60 min");
        String [] cmd = {"shutdown","-s","-t", "3600"}; //Comando de apagado en windows
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void min90ActionPerformed(ActionEvent e){
        System.out.println("Se apagará en 90 min");
        String [] cmd = {"shutdown","-s","-t", "5400"}; //Comando de apagado en windows
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void min120ActionPerformed(ActionEvent e){
        System.out.println("Se apagará en 120 min");
        String [] cmd = {"shutdown","-s","-t", "7200"}; //Comando de apagado en windows
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private void setTimeActionPerformed(ActionEvent e){


        if(Validar.isNumeric(this.campoTexto1.getText())){

            int iTemp = Integer.parseInt(this.campoTexto1.getText());

            if(iTemp>10){
                String s = Integer.toString( iTemp*60);
                String [] cmd = {"shutdown","-s","-t", s }; //Comando de apagado en windows
                try {
                    Runtime.getRuntime().exec(cmd);

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }else{
                this.campoTexto1.setText("");
                JOptionPane.showMessageDialog(null, "No se recomienda introducir menos de 10 min para el AutoApagado", "Validando Datos", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            this.campoTexto1.setText("");
            JOptionPane.showMessageDialog(null, "Solo puedes introducir en este campo numeros", "Validando Datos", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void abortarActionPerformed(ActionEvent e){
        System.out.println("Se cancela el apagado");
        String [] cmd = {"shutdown","-a"}; //Comando de apagado en windows
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }


    public void actionPerformed(ActionEvent e){
        if("exit".equals(e.getActionCommand())){
            exitMenuItemActionPerformed(e);
        }
        if("min30".equals(e.getActionCommand())){
            min30ActionPerformed(e);
        }
        if("min45".equals(e.getActionCommand())){
            min45ActionPerformed(e);
        }
        if("min60".equals(e.getActionCommand())){
            min60ActionPerformed(e);
        }
        if("min90".equals(e.getActionCommand())){
            min90ActionPerformed(e);
        }
        if("min120".equals(e.getActionCommand())){
            min120ActionPerformed(e);
        }
        if("setTime".equals(e.getActionCommand())){
            setTimeActionPerformed(e);
        }
        if("abort".equals(e.getActionCommand())){
            abortarActionPerformed(e);
        }
    }

    private void exitMenuItemActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        System.out.println("Cerrando aplicación");
        System.exit(0);
    }

}