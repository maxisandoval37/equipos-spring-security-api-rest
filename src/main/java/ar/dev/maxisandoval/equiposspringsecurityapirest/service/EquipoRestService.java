package ar.dev.maxisandoval.equiposspringsecurityapirest.service;

import ar.dev.maxisandoval.equiposspringsecurityapirest.model.Equipo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class EquipoRestService {

    private final PaisRestService paisRestService;

    public List<Equipo> getEquipos() {
        log.info("*************Entrando al endpoint: getEquipos*************");
        String pais = "Argentina";
        String banderaPais = paisRestService.obtenerImgPais(pais);

        return List.of(
                Equipo.builder().nombre("Bover").banderaPaisOrigen(banderaPais).build(),
                Equipo.builder().nombre("Rica").banderaPaisOrigen(banderaPais).build());
    }
}