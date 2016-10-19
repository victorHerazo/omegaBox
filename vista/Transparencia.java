/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author victor
 */
public class Transparencia extends BasicTabbedPaneUI {
    public void paint(Graphics g, JComponent c) {
        //cor rgb e com alpha 0
        Color tp = new Color(0, 0, 0, 65);
        tabPane.setBackground(tp);
        super.paint(g,c);
        
//        JTabbedPane tab = new JTabbedPane();
//          tab.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI(){
//        protected void paintContentBorder(Graphics g,int tabPlacement,int selectedIndex){}
//});
      }
}
