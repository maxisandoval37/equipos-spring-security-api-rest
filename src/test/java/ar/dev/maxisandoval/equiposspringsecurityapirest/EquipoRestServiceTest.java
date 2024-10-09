package ar.dev.maxisandoval.equiposspringsecurityapirest;

import ar.dev.maxisandoval.equiposspringsecurityapirest.model.Equipo;
import ar.dev.maxisandoval.equiposspringsecurityapirest.service.EquipoRestService;
import ar.dev.maxisandoval.equiposspringsecurityapirest.service.PaisRestService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class EquipoRestServiceTest {

    @Mock
    private PaisRestService paisRestService;

    @InjectMocks
    private EquipoRestService equipoRestService;

    private AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception{
        closeable.close();
    }

    @Test
    void testGetEquipos() {
        String pais = "Argentina";
        String imgUrl = "https://ejemplo.com/arg.png";
        when(paisRestService.obtenerImgPais(pais)).thenReturn(imgUrl);

        List<Equipo> equipos = equipoRestService.getEquipos();

        assertEquals(2, equipos.size());
        assertEquals("Bover", equipos.get(0).getNombre());
        assertEquals(imgUrl,  equipos.get(0).getBanderaPaisOrigen());
        assertEquals("Rica", equipos.get(1).getNombre());
        assertEquals(imgUrl,  equipos.get(1).getBanderaPaisOrigen());
    }
}