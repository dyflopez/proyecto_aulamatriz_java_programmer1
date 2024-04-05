package clases.anidadas.anonymous.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class CalseAnonima {

    /**
     * Son clases sin nombre que se crean y se utilizan al
     * mismo tiempo que se imlementa una interfaz o
     * clase abstracta
     */

    public static void main(String[] args) {
        Saludar saludar = new Saludar() {
            @Override
            public void sayHello() {

            }

            @Override
            public void sayBye() {

            }
        };

        Button button =new Button("Click me");
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"wooooow");
            }
        });*/

        button.addActionListener((e)->{
            JOptionPane.showMessageDialog(null,"wooooow");
        } );

        Frame frame = new Frame();
        frame.add(button);
        frame.setSize(200,200);
        frame.setVisible(true);

    }

}
