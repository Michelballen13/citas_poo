package entitis;

import java.time.LocalDateTime;

import com.citas_poo.IAgendable;

import enums.EstadoCita;

public class CitaMedico extends Cita implements IAgendable {

    private Medico medico;
    private String motivo;
    private EstadoCita estado;

    public CitaMedico(Integer id, LocalDateTime fecha, 
                    entitis.Paciente paciente, 
                    entitis.Consultorio consultorio,
                    Medico m ,
                    String motivo ,
                    EstadoCita estado) {
        super(id, fecha, paciente, consultorio);
        this.medico = m;
        this.motivo = motivo;
        this.estado = estado;

        
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public void agendendarCita(LocalDateTime fecha) {
       super.setFecha(fecha);
       this.estado = EstadoCita.AGENDAR;
    }

    @Override
    public void cancelarCita() {
       
    }

    @Override
    public void reagendarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }

    

}
