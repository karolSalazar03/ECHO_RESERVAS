package edu.epn.iccd632.xp;

import java.util.Map;

/** HU-02. PUNTO DE TRABAJO PARA LA PAREJA 2. */
final class CancellationPolicy {
    boolean cancel(Map<String, String> ownerBySlot, String studentId, String slot) {
        // 1. Validar que los identificadores no sean nulos o vacíos
        if (studentId == null || studentId.trim().isEmpty() || slot == null) {
            return false;
        }

        // 2. Verificar si el bloque está reservado y el estudiante actual es el titular
        if (ownerBySlot.containsKey(slot) && ownerBySlot.get(slot).equals(studentId)) {
            // 3. Liberar el bloque eliminándolo del mapa y devolver true
            ownerBySlot.remove(slot);
            return true;
        }

        // 4. Si el bloque está libre o pertenece a otro estudiante, devolver false
        return false;
    }
}