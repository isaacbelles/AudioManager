package br.com.github.model;

public class Audio {
    private String title;
    private int totalReproductions;
    private int likes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getClassification() {
        return classification;
    }

    public int getLikes() {
        return likes;
    }

    public void liked(){
        likes++;
    }

    public void reproduce(){
        totalReproductions++;
    }
    public void duration (){
    }
}