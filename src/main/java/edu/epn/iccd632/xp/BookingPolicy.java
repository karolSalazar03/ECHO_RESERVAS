package edu.epn.iccd632.xp;

import java.util.Map;

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
        // 3. Registrar al titular
        ownerBySlot.put(slot, studentId);
        return true;
    }
}