package br.com.github.model;

public class Favorites {
    public void print(Audio audio){
        if (audio.getClassification() >=9){
            System.out.println("A música: " + audio.getTitle() + " é um sucesso!");
        } else if (audio.getClassification() <= 6){
            System.out.println("A música: " + audio.getTitle() + " é um fracasso!");
        }
    }

}
