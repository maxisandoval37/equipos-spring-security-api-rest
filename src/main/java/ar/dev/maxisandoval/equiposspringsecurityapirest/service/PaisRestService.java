package ar.dev.maxisandoval.equiposspringsecurityapirest.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class PaisRestService {

    private final WebClient.Builder webClientBuilder;

    public String obtenerImgPais(String nombrePais) {
        return webClientBuilder.baseUrl("https://restcountries.com/v3.1/")
                .build()
                .get()
                .uri("name/{nombrePais}?fields=flags", nombrePais)
                .retrieve()
                .bodyToMono(CountryFlagResponse[].class)
                .map(response -> response[0].getFlags().getPng())
                .block();
    }

    @Data
    static class CountryFlagResponse {
        private Flags flags;
    }

    @Data
    static class Flags {
        private String png;
    }
}