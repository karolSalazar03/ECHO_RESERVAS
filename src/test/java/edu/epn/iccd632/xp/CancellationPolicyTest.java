package edu.epn.iccd632.xp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CancellationPolicyTest {

@Test
    public void testCancelacionExitosaDevuelveTrue() {
        Reservations res = new Reservations();
        
        // 1. Primero reservamos un bloque para que exista
        res.book("estudiante123", "A");
        
        // 2. Intentamos cancelar con el mismo titular y bloque
        boolean resultado = res.cancel("estudiante123", "A");
        
        // 3. Verificamos que la cancelación sea exitosa (devuelva true)
        assertTrue(resultado, "Cancelar una reserva válida debe devolver true");
    }
}