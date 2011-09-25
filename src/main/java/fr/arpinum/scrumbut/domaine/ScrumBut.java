package fr.arpinum.scrumbut.domaine;

public class ScrumBut {

    protected ScrumBut() {
        
    }

    public ScrumBut(String raison, String contournement) {
        this.raison = raison;
        this.contournement = contournement;
    }

    public String getRaison() {
        return raison;
    }

    public String getContournement() {
        return contournement;
    }

    public String getId() {
        return id;
    }

    private String raison;
    private String contournement;
    private String id;
}
