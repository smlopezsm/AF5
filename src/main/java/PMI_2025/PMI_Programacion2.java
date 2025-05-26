package PMI_2025;

import Controller.Controlador;
import Model.Persona;
import View.Pantalla;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;

public class PMI_Programacion2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Persona>  lista= new ArrayList<>();
        try {
            UIManager.setLookAndFeel( new FlatCobalt2IJTheme() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        Controlador contPersonas= new Controlador(lista);
        Pantalla ventana= new Pantalla(contPersonas);
        ventana.setVisible(true);
    }
}
