package com.example.application.services;

import com.example.application.views.myview.Reserva;

import java.util.List;

public interface ReservaService {
    void guardarReserva(Reserva reserva);
    List<Reserva> obtenerTodasLasReservas();
}
