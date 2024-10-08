package ar.dev.maxisandoval.equiposspringsecurityapirest.controller;

import ar.dev.maxisandoval.equiposspringsecurityapirest.model.Equipo;
import ar.dev.maxisandoval.equiposspringsecurityapirest.service.EquipoRestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@AllArgsConstructor
@RestController
public class EquipoController {

    private final EquipoRestService equipoRestService;

    @GetMapping("/equipos")
    public List<Equipo> listarEquipos() {
        return equipoRestService.getEquipos();
    }
}