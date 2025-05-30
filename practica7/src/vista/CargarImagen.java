/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author saule
 */
public class CargarImagen {
    public BufferedImage cargarImagen() {
        BufferedImage image = null;
        JFileChooser escojerImagen = new JFileChooser();
        int resultado = escojerImagen.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = escojerImagen.getSelectedFile();
            try {
                image = ImageIO.read(archivo);
                JOptionPane.showMessageDialog(null, "Imagen cargada con éxito");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen ");
            }
        }
        return image;
    }    
}
