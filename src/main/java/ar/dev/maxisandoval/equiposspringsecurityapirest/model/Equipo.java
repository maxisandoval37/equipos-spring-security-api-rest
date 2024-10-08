package ar.dev.maxisandoval.equiposspringsecurityapirest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Equipo {

    private String nombre;
    private String banderaPaisOrigen;
}