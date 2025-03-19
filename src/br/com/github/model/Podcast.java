package br.com.github.model;

import br.com.github.interfaces.Playable;

public class Podcast extends Audio implements Playable {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void podcastCredits() {
        System.out.println("Título: " + getTitle());
        System.out.println("Host: " + getHost());
        System.out.println("Descrição: " + getDescription());
    }

    public void totalReproductions() {
        for (int a = 0; a < 50; a++) {
            reproduce();
        }
        System.out.println("Esse Podcast teve: " + getTotalReproductions() + " reproduções");
    }
    @Override
    public void play() {
        System.out.println("Tocando o Podcast: " + getTitle());
    }
}
