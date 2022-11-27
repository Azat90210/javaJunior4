package lesson9;

public class Kornevie extends Plants {
    private boolean koren;
    private boolean stebel;

    public Kornevie() {
    }

    public Kornevie(boolean koren) {
        this.koren = koren;
    }

    public Kornevie(String listya, String razmnogenie, String osobennosti, boolean koren, boolean stebel) {
        super(listya, razmnogenie, osobennosti);
        this.koren = koren;
        this.stebel = stebel;
    }

    public boolean isKoren() {
        return koren;
    }

    public void setKoren(boolean koren) {
        this.koren = koren;
    }

    public boolean isStebel() {
        return stebel;
    }

    public void setStebel(boolean stebel) {
        this.stebel = stebel;
    }
}
