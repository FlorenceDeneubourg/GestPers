package Console;

import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * La classe principale qui initialise l'interface graphique de l'application.
 * Elle configure le look and feel Nimbus et affiche la fenêtre principale.
 */
public class ClassMain {

    /**
     * Point d'entrée principal de l'application.
     *
     * @param args les arguments de la ligne de commande (non utilisés)
     * @throws SAXException si une erreur se produit lors de l'analyse SAX
     * @throws IOException en cas d'erreur d'entrée/sortie lors du traitement XML
     * @throws ParserConfigurationException en cas d'erreur de configuration du parseur XML
     */
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        try {
            // Définit le look and feel Nimbus pour l'interface graphique
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            // En cas d'échec de configuration du look and feel, affiche l'erreur
            e.printStackTrace();
        }
        
        // Crée une nouvelle instance de la fenêtre principale GestionJFrame
        GestionJFrame fenetre = new GestionJFrame();
        
        // Rend la fenêtre visible à l'écran
        fenetre.setVisible(true);
    }

}
