package br.com.github.view;

import br.com.github.model.Favorites;
import br.com.github.model.Music;
import br.com.github.model.Podcast;
import br.com.github.model.ResponseHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("Song");
        music.setAlbum("Album");
        music.setArtist("Artist");
        music.setGenre("Genre");
        music.songCredits();
        music.likes();
        music.totalReproductions();
        music.getClassification();
        Favorites favorites = new Favorites();
        favorites.print(music);


        Scanner scanner = new Scanner(System.in);
        ResponseHandler responseHandler = new ResponseHandler();
        System.out.println("Deseja escutar a música digite? Digite 'sim' ou 'não':");
        String responseMusic = scanner.nextLine();
        responseHandler.handleResponse(responseMusic, music);


        System.out.println();

        Podcast podcast = new Podcast();
        podcast.setTitle("Podcast");
        podcast.setHost("Host");
        podcast.setDescription("Descrição");
        podcast.podcastCredits();
        podcast.totalReproductions();
        System.out.println("Deseja escutar o podcast? Digite 'sim' ou 'não': ");
        String responsePodcast = scanner.nextLine();
        responseHandler.handleResponse(responsePodcast, podcast);


        System.out.println();



    }
}