package lesson9;

public class Tree extends Kornevie{
    private String type;

    public Tree() {
    }

    public Tree(String type) {
        this.type = type;
    }

    public Tree(String listya, String razmnogenie, String osobennosti, boolean koren, boolean stebel, String type) {
        super(listya, razmnogenie, osobennosti, koren, stebel);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
