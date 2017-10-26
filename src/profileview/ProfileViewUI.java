/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profileview;
import javax.swing.*;
/**
 *
 * @author nadaziab
 */
public class ProfileViewUI {
    
    JFrame f = new JFrame();
    
    public ProfileViewUI() {
        f.setTitle("Profile");
        f.setSize(800, 500); // default size is 0,0
        f.setLocation(300, 300); // default is 0,0 (top left corner)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}