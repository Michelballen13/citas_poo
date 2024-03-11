package entitis;

import enums.Especialidad;
import enums.TipoIdentificacion;

public class Medico extends Usuarios {

        public Medico(int id, 
        String nombres, 
        String apellidos, 
        TipoIdentificacion tipoIdentificacion,
        Long numeroIdentificacion, 
        long registroMedico, 
        Especialidad especialidad) {
            super(id, 
            nombres, 
            apellidos, 
            tipoIdentificacion, 
            numeroIdentificacion);
            this.registroMedico = registroMedico;
            this.especialidad = especialidad;
        }

    private long registroMedico;
    private Especialidad especialidad;
    
    public long getRegistroMedico() {
        return registroMedico;
    }
    public void setRegistroMedico(long registroMedico) {
        this.registroMedico = registroMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    

    

}
