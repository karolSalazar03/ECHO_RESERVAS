package edu.epn.iccd632.xp;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Pruebas JUnit para HU-01 (reservar un bloque libre).
 * Fase RED: sin logica, cada prueba falla a proposito.
 */
class RedBookingPolicyTest {

    @Test
    void reservaValidaDevuelveTrueYOcupaElBloque() {
        fail("RED HU-01: reserva valida aun no implementada");
    }

    @Test
    void segundoIntentoSobreElMismoBloqueDevuelveFalse() {
        fail("RED HU-01: rechazo de bloque ocupado aun no implementado");
    }

    @Test
    void segundoIntentoConservaAlPrimerTitular() {
        fail("RED HU-01: conservacion del primer titular aun no implementada");
    }

    @Test
    void bloqueInvalidoDevuelveFalse() {
        fail("RED HU-01: validacion de bloque aun no implementada");
    }

    @Test
    void estudianteNuloDevuelveFalse() {
        fail("RED HU-01: validacion de estudiante nulo aun no implementada");
    }

    @Test
    void estudianteEnBlancoDevuelveFalse() {
        fail("RED HU-01: validacion de estudiante en blanco aun no implementada");
    }
}