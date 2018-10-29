/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelamientocolas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Juan K
 */
public class ModelamientoColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*   Estilo segun el sistema operativo que se esté usando*/
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//UI depende del sistema operativo
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*-------------------------------------------------------*/
        
        Main conexion= new Main();
        conexion.setVisible(true);
        conexion.setTitle("Colas. Modelamiento y simulacón");
        conexion.setLocationRelativeTo(null);
        conexion.setResizable(false);       
        conexion.setVisible(true);
    }
    
}
