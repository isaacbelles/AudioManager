package br.com.github.model;

import br.com.github.interfaces.Playable;

public class ResponseHandler {
    public void handleResponse(String response, Playable playable){
        if (response.equals("sim")){
            playable.play();
        } else if (response.equals("não")) {
            System.out.println("Você não quer reproduzir o áudio.");
        } else {
            System.out.println("Resposta inválida. Por favor, responda com 'sim' ou 'não'.");
        }
    }
}
