import java.awt.Dimension;
import java.awt.Toolkit;

public class App {
    public static void main(String[] args) {
        // Obtém a instância do Toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obtém a dimensão da tela
        Dimension screenSize = toolkit.getScreenSize();

        // Obtém a largura e altura da tela
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Exibe a resolução da tela
        System.out.println("Resolução da tela: " + screenWidth + "x" + screenHeight);
    }
}
