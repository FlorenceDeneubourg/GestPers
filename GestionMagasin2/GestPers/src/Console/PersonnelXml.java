package Console;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PersonnelXml {
   
   // Déclaration des variables statiques pour le document XML et l'élément racine
   public static Document document;
   public static Element racine;

   // Méthode pour lire et récupérer les éléments "Personnel" depuis le fichier XML
   static NodeList Lecture() throws SAXException, IOException, ParserConfigurationException {
      // Chemin vers le fichier XML
      File inputFile = new File("./Fichier/Personnel.xml");
      
      // Création des constructeurs de documents et de l'usine
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      
      // Parsing du fichier XML pour créer un Document
      Document doc = dBuilder.parse(inputFile);
      // Normalisation du document XML pour s'assurer qu'il est correctement formaté
      doc.getDocumentElement().normalize();
      
      // Récupération de l'élément racine du document XML
      racine = doc.getDocumentElement();
      
      // Récupération de tous les éléments "Personnel" dans une NodeList
      NodeList listPers = racine.getElementsByTagName("Personnel");
      
      // Retourne la NodeList contenant tous les éléments "Personnel"
      return listPers;
   }
}