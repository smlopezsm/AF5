package PMI_2025;

import View.Pantalla;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;

public class PMI_Programacion2 {
    public static void main(String[] args) {
        FlatCobalt2IJTheme.setup();
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
