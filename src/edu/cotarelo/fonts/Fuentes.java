package edu.cotarelo.fonts;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author bgallego
 */
public class Fuentes {

    private Font font = null;
    public String roBlack = "Roboto-Black.ttf";
    public String roBold = "Roboto-Bold.ttf";
    public String roBoldItalic = "Roboto-BoldItalic.ttf";
    public String roItalic = "Roboto-Italic.ttf";
    public String roLight = "Roboto-Light.ttf";
    public String roRegular = "Roboto-Regular.ttf";
    public String roMedium = "Roboto-Medium.ttf";

    /*
    * roBold = Titulos de las ventanas, 22 pt
      roBold = Botones de las ventanas, 18 pt
    * roRegular = Texto de contenidos, 12-14 pt
     */
    public Font fuente(String fontName, int estilo, float tamanio) {
        try {
            //Se carga la fuente
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
