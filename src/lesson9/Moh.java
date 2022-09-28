package lesson9;

public class Moh extends Plants{
    private boolean stebel;

    public Moh() {
        super();
    }

    public Moh(boolean stebel) {
        super();
        this.stebel = stebel;
    }

    public Moh(String listya, String razmnogenie, String osobennosti, boolean stebel) {
        super(listya, razmnogenie, osobennosti);
        this.stebel = stebel;
    }

    public boolean isStebel() {
        return stebel;
    }

    public void setStebel(boolean stebel) {
        this.stebel = stebel;
    }
}
