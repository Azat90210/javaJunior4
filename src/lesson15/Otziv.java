package lesson15;

public class Otziv {
    private int rate;
    private String comment;

    public Otziv() {
    }

    public Otziv(int rate, String comment) {
        this.rate = rate;
        this.comment = comment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (rate != otziv.rate) return false;
        return comment != null ? comment.equals(otziv.comment) : otziv.comment == null;
    }

    @Override
    public int hashCode() {
        int result = rate;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "rate=" + rate +
                ", comment='" + comment + '\'' +
                "}\n";
    }
}
