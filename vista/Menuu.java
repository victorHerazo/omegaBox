/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author victor
 */
public class Menuu extends JFrame {
    JPanel p1;
    
    public Menuu(){
        createAndShowGUI();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    private void createAndShowGUI(){
        setTitle("Transparent Panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\OmegaBox\\src\\recursos\\IMG\\fondo-2560x1080.jpg")));
        
        setLayout(new FlowLayout());
        
        p1 = new JPanel();
        p1.setBackground(new Color(0,0,0,65));
        
//        p2 = new JPanel();
//        p2.setBackground(new Color(0,0,0,65));
        
        p1.setPreferredSize(new Dimension(500,300));
//        p2.setPreferredSize(new Dimension(250,150));
        
        add(p1);
//        add(p2);
        
        setSize(1000,400);
        setVisible(true);
    }
    
//    
    
     
    public static void main(String  args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menuu(); //To change body of generated methods, choose Tools | Templates.
            }
        });   
    }
}
