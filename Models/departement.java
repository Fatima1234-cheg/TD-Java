package Models;

import java.util.ArrayList;
    public class Departement {
     //les attributs de class departements
        private int id;
        private String intitule;
        private Enseignant chef;

        // ArrayList pour stocker les filières associées au département
        ArrayList<Filiere> filieres = new ArrayList<Filiere>();


        public Departement() {
        }
// pour initialiser les attributs lors de la création d'une instance de la classe.
        public Departement(String intitule, Enseignant chef) {
            this.intitule = intitule;
            this.chef = chef;
        }
        // Méthodes d'accès (getters et setters) pour les attributs privés
        public String getIntitule() {
            return intitule;
        }

        public void setIntitule(String intitule) {
            this.intitule = intitule;
        }

        public Enseignant getChef() {
            return chef;
        }

        public void setChef(Enseignant chef) {
            this.chef = chef;
        }

        public ArrayList<Filiere> getFilieres() {
            return filieres;
        }

        public void setFilieres(ArrayList<Filiere> filieres) {
            this.filieres = filieres;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}
