package src.entities;

public class Music {
    String title;
    String path;

    public Music(String title, String path) {
        this.title = title;
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}