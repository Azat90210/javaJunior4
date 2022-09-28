package homework;

public class WallEntry {
    private String wallEntry;

    public WallEntry() {
    }

    public WallEntry(String wallEntry) {
        this.wallEntry = wallEntry;
    }


    public String getWallEntry() {
        return wallEntry;
    }

    public void setWallentry(String wallEntry) {
        this.wallEntry = wallEntry;
    }

    @Override
    public String toString() {
        return "WallEntry{" +
                "wallEntry='" + wallEntry + '\'' +
                '}';
    }
}
