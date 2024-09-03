package ar.edu.info.unlp.ejercicioDemo;

public interface WallPost {
    public String getText();
    public void setText(String text);
    public int getLikes();
    public void like();
    public void dislike();
    public boolean isFeatured();
    public void toggleFeatured();
}
