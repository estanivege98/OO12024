package org.example;

import java.time.LocalDate;

interface IAbono {
    void calcularCosto(LocalDate fecha);
    boolean esValido();
    double abonoDisponible();
}
