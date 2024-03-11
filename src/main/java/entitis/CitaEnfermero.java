package entitis;

import java.time.LocalDateTime;

import com.citas_poo.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable{
    private String procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(Integer id, 
                        LocalDateTime fecha, 
                        entitis.Paciente paciente,
                        entitis.Consultorio consultorio, 
                        Enfermero e , 
                        String p ) {
        super(id, fecha, paciente, consultorio);
        this.enfermero = enfermero ;
        this.procedimiento = procedimiento;

        
    
    }

    public CitaEnfermero(Integer id, LocalDateTime fecha, entitis.Paciente paciente, entitis.Consultorio consultorio,
            String procedimiento, Enfermero enfermero) {
        super(id, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendendarCita(LocalDateTime fecha) {
    super.fecha = fecha ;    }

    @Override
    public void cancelarCita() {
    System.out.println("cita cancelada");    }

    @Override
    public void reagendarCita() {
    super.fecha = fecha ;    }

    


    
}
