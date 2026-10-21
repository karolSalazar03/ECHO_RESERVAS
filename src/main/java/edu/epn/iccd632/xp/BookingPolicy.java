package edu.epn.iccd632.xp;

import java.util.Map;

/** HU-01. PUNTO DE TRABAJO PARA LA PAREJA 1. */
final class BookingPolicy {
    boolean book(Map<String, String> ownerBySlot, String studentId, String slot) {
        // 1. Validar datos: estudiante no nulo ni en blanco, bloque A, B o C
        if (!Reservations.validStudent(studentId) || !Reservations.validSlot(slot)) {
            return false;
        }
        // 2. Bloquear duplicados: si el bloque ya tiene titular, se conserva y se rechaza
        if (ownerBySlot.containsKey(slot)) {
            return false;
        }
        // 3. CR-01: un estudiante no puede tener mas de una reserva activa
        if (ownerBySlot.containsValue(studentId)) {
            return false;
        }
        // 4. Registrar al titular
        ownerBySlot.put(slot, studentId);
        return true;
    }
}