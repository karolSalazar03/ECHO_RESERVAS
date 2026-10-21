package edu.epn.iccd632.xp;

/** Demostración sencilla; el comportamiento real se verifica con JUnit. */
public final class Main {
    public static void main(String[] args) {
        Reservations r = new Reservations();

        System.out.println("=== CR-01: maximo UNA reserva activa por estudiante ===");
        System.out.println("E01 reserva A (esperado true):            " + r.book("E01", "A"));
        System.out.println("E01 intenta reservar B (esperado false):  " + r.book("E01", "B"));
        System.out.println("E02 reserva B libre (esperado true):      " + r.book("E02", "B"));
        System.out.println("E02 intenta sobrescribir A (esperado false): " + r.book("E02", "A"));
        System.out.println("E02 intenta cancelar A de E01 (esperado false): " + r.cancel("E02", "A"));
        System.out.println("E01 cancela A (esperado true):            " + r.cancel("E01", "A"));
        System.out.println("A libre despues de cancelar (esperado true): " + r.isAvailable("A"));
        System.out.println("E01 reserva C tras cancelar (esperado true): " + r.book("E01", "C"));
    }
}