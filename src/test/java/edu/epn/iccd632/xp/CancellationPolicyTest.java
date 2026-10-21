package edu.epn.iccd632.xp;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class CancellationPolicyTest {

    @Test
    public void testCancelacionExitosaDevuelveTrue() {
        CancellationPolicy policy = new CancellationPolicy();
        Map<String, String> reservas = new HashMap<>();
        
        // 1. Simulamos manualmente que ya existe una reserva en la memoria
        reservas.put("A", "estudiante123");
        
        // 2. Ejecutamos tu método cancel pasándole el mapa simulado
        boolean resultado = policy.cancel(reservas, "estudiante123", "A");
        
        // 3. Verificamos que devuelva true y que el mapa quede vacío
        assertTrue(resultado, "Cancelar una reserva válida debe devolver true");
        assertFalse(reservas.containsKey("A"), "El bloque A debe quedar liberado en el mapa");
    }
}