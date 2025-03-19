package br.com.github.model;

import br.com.github.interfaces.Playable;

public class Music extends Audio implements Playable {
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void songCredits() {
        System.out.println("Título: " + getTitle());
        System.out.println("Artista: " + getArtist());
        System.out.println("Álbum: " + getAlbum());
        System.out.println("Gênero: " + getGenre());
    }

    public void likes() {
        for (int i = 0; i < 40; i++) {
            liked();
        }
        System.out.println("Essa música teve: " + getLikes() + " likes");
    }

    public void totalReproductions() {
        for (int a = 0; a < 70; a++) {
            reproduce();
        }
        System.out.println("Essa música teve: " + getTotalReproductions() + " reproduções");
    }


    @Override
    public int getClassification() {
        double media = getTotalReproductions() / getLikes();
        if (media <= 2){
            return 9;
        } else if (media > 2){
            return 6;
        }
        return 0;
    }

    @Override
    public void play() {
        System.out.println("Tocando a música: " + getTitle());
    }
}
