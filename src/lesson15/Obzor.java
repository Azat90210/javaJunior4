package lesson15;

public class Obzor {
    private String obzor;
    private String urlVideo;

    public Obzor() {
    }

    public Obzor(String obzor, String urlVideo) {
        this.obzor = obzor;
        this.urlVideo = urlVideo;
    }

    public String getObzor() {
        return obzor;
    }

    public void setObzor(String obzor) {
        this.obzor = obzor;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obzor obzor1 = (Obzor) o;

        if (obzor != null ? !obzor.equals(obzor1.obzor) : obzor1.obzor != null) return false;
        return urlVideo != null ? urlVideo.equals(obzor1.urlVideo) : obzor1.urlVideo == null;
    }

    @Override
    public int hashCode() {
        int result = obzor != null ? obzor.hashCode() : 0;
        result = 31 * result + (urlVideo != null ? urlVideo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Obzor{" +
                "obzor='" + obzor + '\'' +
                ", urlVideo='" + urlVideo + '\'' +
                "}\n";
    }
}
