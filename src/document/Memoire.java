package documents;

import main.Bibliotheque;
import service.Historique;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Memoire extends Document{

    private String name;
    private Date date_soutenance;
    private String titre_du_memoire;

    public Memoire() {
    }

    public Memoire(int id, String titre, String localisation, int nbExemplaires, String nomCandidat, String titreMemoire , Date dateSoutenance) {
        super(id, titre, localisation, nbExemplaires);
        this.name= nomCandidat;
        this.titre= titreMemoire;
        this.date_soutenance= dateSoutenance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_soutenance() {
        return date_soutenance;
    }

    public void setDate_soutenance(Date date_soutenance) {
        this.date_soutenance = date_soutenance;
    }

    public String getTitre_du_memoire() {
        return titre_du_memoire;
    }

    public void setTitre_du_memoire(String titre_du_memoire) {
        this.titre_du_memoire = titre_du_memoire;
    }

    @Override
    public String toString() {
        return "Memoire{" +
                "name='" + name + '\'' +
                ", date_soutenance=" + date_soutenance +
                ", titre_du_memoire='" + titre_du_memoire + '\'' +
                '}';
    }

    public void afficherCeDocument(int disponible, int nb){
        double k;
        if (nb==0)
            k=0;
        else
            k= Math.ceil(((double) getNbPretTotale()/nb)*100);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("|%9s", getClass().getSimpleName());
        System.out.printf("|%4d", getId());
        System.out.printf("|%36s", getTitre());
        System.out.printf("|%20s", getName());
        System.out.printf("|%20s", getTitre());
        System.out.printf("|%10s", sdf.format(getDate_soutenance()));
        System.out.print("|   ------   ");
        System.out.printf("|%12s", getLocalisation());
        System.out.printf("|%12d", getNbExemplaires());
        if (disponible==0){
            System.out.print("|"+ANSI_RED);
            System.out.printf("%12d", disponible);
            System.out.print(ANSI_RESET);
        }else
            System.out.printf("|%12d", disponible);
        System.out.printf("|%13d", getNbPretTotale());
        if (k>30){
            System.out.print("|"+ANSI_GREEN);
            System.out.printf("%5s", k);
            System.out.print("%");
            System.out.print(ANSI_RESET);
        }else{
            System.out.printf("|%5s", k);
            System.out.print("%");
        }
        System.out.printf("|%5s", k);
        System.out.print("%");
        System.out.println("|");
    }

    public void modifierCeDocument(Scanner sc, ArrayList<Historique> historique){
        String choix, str;
        Bibliotheque b = new Bibliotheque();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\t Que voulez vous modifier de ce Livre : ");
        do {
            System.out.println("\t 0) Sortire");
            System.out.println("\t 1) Titre ("+getTitre()+")");
            System.out.println("\t 2) Localisation ("+getLocalisation()+")");
            System.out.println("\t 3) Nombre Exemplaires ("+getNbExemplaires()+")");
            System.out.println("\t 4) Nom Candidat ("+getName()+")");
            System.out.println("\t 5) Titre Memoire ("+getTitre()+")");
            System.out.println("\t 6) Date Soutenance ("+sdf.format(getDate_soutenance())+")");
            choix = sc.nextLine();
            switch (choix){
                case "0": return;
                case "1":
                    String ancienTitre = getTitre();
                    System.out.println("\t Entrer nouveau titre");
                    setTitre(sc.nextLine());
                    historique.add(new Historique(new Date(), "Document", "Modification",getId(), "Titre de "+ancienTitre+" par "+getTitre()));
                    System.out.println("\t Modification avec succees.");
                    b.pause(1000);
                    break;
                case "2":
                    String loc = getLocalisation();
                    System.out.println("\t Entrer nouvelle localisation (Salle/Rayon)");
                    setLocalisation(sc.nextLine());
                    System.out.println("\t Modification avec succees.");
                    historique.add(new Historique(new Date(), "Document", "Modification", getId(), "Localisation de "+loc+" par "+getLocalisation()));
                    b.pause(1000);
                    break;
                case "3":
                    System.out.println("\t Entrer nouveau nombre d'exemplaires");
                    boolean verifier=false;
                    int nb = getNbExemplaires();
                    do {
                        try{
                            setNbExemplaires(sc.nextInt());
                            verifier = true;
                        } catch (Exception e){
                            System.out.println("\t Erreur! Veillez entrer des chiffres...");
                            System.out.println("\t Entrer nouveau nombre d'exemplaires");
                            b.pause(500);
                            sc.nextLine();
                        }
                    }while (!verifier);
                    sc.nextLine();
                    historique.add(new Historique(new Date(), "Document", "Modification", getId(), "Nb exemplaires de "+nb+" a "+getNbExemplaires()+" exemplaires en totale"));
                    System.out.println("\t Modification avec succees.");
                    b.pause(1000);
                    break;
                case "4":
                    String ancienNomCandidat = getName();
                    System.out.println("\t Entrer nouveau nom Candidat");
                    setName(sc.nextLine());
                    historique.add(new Historique(new Date(), "Document", "Modification",getId(), "Nom candidat de "+ancienNomCandidat+" par "+getName()));
                    System.out.println("\t Modification avec succees.");
                    b.pause(1000);
                    break;
                case "5":
                    String ancienTitreMemoire=getTitre();
                    System.out.println("\t Entrer nouveau titre memoire");
                    setTitre(sc.nextLine());
                    historique.add(new Historique(new Date(), "Document", "Modification",getId(), "Nom editeur de "+ancienTitreMemoire+" par "+getTitre()));
                    System.out.println("\t Modification avec succees.");
                    b.pause(1000);
                    break;
                case "6":
                    String ancienneDateSoutenance = sdf.format(getDate_soutenance());
                    System.out.println("\t Entrer nouvelle date de Soutenance sous forme (DD/MM/YYYY)");
                    str = sc.nextLine();
                    try {
                        setDate_soutenance(sdf.parse(str));
                        System.out.println("\t Modification avec succees.");
                        historique.add(new Historique(new Date(), "Document", "Modification",getId(), "Date soutenance de "+ancienneDateSoutenance+" par "+sdf.format(getDate_soutenance())));
                        b.pause(1000);
                    }catch (ParseException e){
                        System.out.println("\t Forme non respecter!");
                        b.pause(1000);
                    }
                    break;
                default:
                    System.out.println("\t Choix invalide! veillez réessayer");
                    b.pause(500);
                    break;
            }
        }while (true);
    }


}
