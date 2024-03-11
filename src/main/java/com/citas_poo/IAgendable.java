package com.citas_poo;

import java.time.LocalDateTime;

public interface IAgendable {

    public void agendendarCita (LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita();

}
