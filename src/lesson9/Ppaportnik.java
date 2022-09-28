package lesson9;

public class Ppaportnik extends Kornevie{
    private boolean kust;

    public Ppaportnik() {
    }

    public Ppaportnik(String listya, String razmnogenie, String osobennosti, boolean koren, boolean stebel, boolean kust) {
        super(listya, razmnogenie, osobennosti, koren, stebel);
        this.kust = kust;
    }

    public boolean isKust() {
        return kust;
    }

    public void setKust(boolean kust) {
        this.kust = kust;
    }
}
