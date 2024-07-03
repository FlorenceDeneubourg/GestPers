package Console;

import java.awt.Component;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class GestionJFrame extends JFrame {
   // Déclaration des boutons de l'interface utilisateur
   protected JButton btnLoad;
   protected JButton btnAffichage;
   protected JButton btnMag;
   protected JButton btnPret;
   protected JButton btnRetour;
   protected JButton btnModifPersonnel;
   protected JButton btnSupprimerPersonnel;
   protected JButton btnAjoutPersonnel;
   protected JButton btnSauvegarde;
   protected JButton btnClose;

   // Déclaration des listes de personnel et d'emprunts, et des objets pour la gestion
   private ArrayList<Personnel> Person = new ArrayList<>();
   private Magasin mag = new Magasin();
   private ArrayList<Emprunt> pret = new ArrayList<>();
   private Sauvegarde save = new Sauvegarde();
   private AffichagePers affichePers = new AffichagePers();
   private GestionPersonnel gestpers = new GestionPersonnel();
   private GestionEmprunt gestemprunt = new GestionEmprunt();

   // Constructeur de la classe
   public GestionJFrame() {
      super("Gestion Personnel & prêt matériel.");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Définir l'opération de fermeture par défaut
      JPanel contentPane = (JPanel) this.getContentPane();

      // Création des textes pour les boutons avec HTML pour le formatage
      String texteBtnAfficher = "<html><Div Align=Center> Affichage <BR> données personnel </Div></html>";
      String texteBtnModifPersonnel = "<html><Div Align=Center> Modification <BR> données personnel </Div></html>";
      String texteBtnLoad = "<html><Div Align=Center> Charger <BR> données personnel </Div></html>";

      // Initialisation des boutons avec les textes correspondants
      this.btnLoad = new JButton(texteBtnLoad);
      this.btnAffichage = new JButton(texteBtnAfficher);
      this.btnMag = new JButton("Création du magasin");
      this.btnPret = new JButton("Prêt de matériel");
      this.btnRetour = new JButton("Retour de matériel");
      this.btnModifPersonnel = new JButton(texteBtnModifPersonnel);
      this.btnSupprimerPersonnel = new JButton("Supprimer une personne");
      this.btnAjoutPersonnel = new JButton("Ajouter une personne");
      this.btnSauvegarde = new JButton("Sauvegarde");
      this.btnClose = new JButton("Fermer");

      // Définir la disposition du panneau principal
      contentPane.setLayout(new GridLayout(3, 1));
      // Ajouter les boutons au panneau principal
      contentPane.add(this.btnLoad);
      contentPane.add(this.btnAffichage);
      contentPane.add(this.btnMag);
      contentPane.add(this.btnPret);
      contentPane.add(this.btnRetour);
      contentPane.add(this.btnModifPersonnel);
      contentPane.add(this.btnSupprimerPersonnel);
      contentPane.add(this.btnAjoutPersonnel);
      contentPane.add(this.btnSauvegarde);
      contentPane.add(this.btnClose);

      // Définir les actions à exécuter lorsque les boutons sont cliqués
      this.btnLoad.addActionListener((e) -> {
         try {
            this.gestpers.LoadPersonnel(this.Person); // Charger les données du personnel
         } catch (SAXException | IOException | ParserConfigurationException ex) {
            throw new RuntimeException(ex); // Gérer les exceptions
         }
      });

      this.btnAffichage.addActionListener((e) -> {
         this.affichePers.AffichageListe(this.Person); // Afficher la liste du personnel
      });

      this.btnMag.addActionListener((e) -> {
         GestionEmprunt.Magasin(this.mag); // Gérer le magasin
      });

      this.btnPret.addActionListener((e) -> {
         this.gestemprunt.Emprunt(this.mag, this.Person, this.pret); // Gérer les emprunts
      });

      this.btnRetour.addActionListener((e) -> {
         this.gestemprunt.RetourEmprunt(this.pret); // Gérer le retour des emprunts
      });

      this.btnModifPersonnel.addActionListener((e) -> {
         this.gestpers.ModifPersonnel(this.Person); // Modifier les données du personnel
      });

      this.btnSupprimerPersonnel.addActionListener((e) -> {
         this.gestpers.SuppressionPersonnel(this.Person); // Supprimer une personne
      });

      this.btnSauvegarde.addActionListener((e) -> {
         this.save.Sauvegarde(this.Person, this.pret); // Sauvegarder les données
      });

      this.btnAjoutPersonnel.addActionListener((e) -> {
         this.gestpers.AjoutPersonnel(this.Person); // Ajouter une personne
      });

      this.btnClose.addActionListener((e) -> {
         this.dispose(); // Fermer la fenêtre
      });

      // Définir la taille de la fenêtre et la positionner au centre de l'écran
      this.setSize(800, 600);
      this.setLocationRelativeTo(null);
   }
}
