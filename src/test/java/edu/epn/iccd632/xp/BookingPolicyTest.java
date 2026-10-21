package edu.epn.iccd632.xp;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Pruebas JUnit para HU-01 (reservar un bloque libre).
 * Fase RED: sin logica, cada prueba falla a proposito.
 */
class BookingPolicyTest {

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

    // ---- CR-01: maximo UNA reserva activa por estudiante (RED) ----

    @Test
    void estudianteConReservaActivaNoPuedeReservarOtroBloque() {
        fail("RED CR-01: limite de una reserva activa aun no implementado");
    }

    @Test
    void otroEstudianteSiPuedeReservarUnBloqueLibre() {
        fail("RED CR-01: reserva de otro estudiante aun no verificada");
    }

    @Test
    void despuesDeLiberarSuReservaPuedeReservarOtroBloque() {
        fail("RED CR-01: reserva tras cancelar aun no verificada");
    }

    @Test
    void seConservanReglasAnterioresReservaOcupadaNoSeSobrescribe() {
        fail("RED CR-01: conservacion de reglas anteriores aun no verificada");
    }
}