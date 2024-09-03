package ar.edu.info.unlp.ejercicioDemo;

public class WallPostImp implements WallPost{
    private String text = "Undefined post";
    private int likes = 0;
    private boolean fetured = false;

    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }
    public int getLikes(){
        return this.likes;
    }
    public void like(){
        this.likes++;
    }
    public void dislike(){
        this.likes--;
    }
    public boolean isFeatured(){
        return fetured;
    }
    public void toggleFeatured(){
        if (!isFeatured()){
            this.fetured = true;
        }
    }
    @Override
    public String toString(){
        return "Wallpost {" + getText() + ", " + getLikes() + ", " + isFeatured() + "}";
    }
}
