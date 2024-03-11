package entitis;

import enums.LocalDateTime;
import enums.TipoIdentificacion;
import enums.TipoSangre;

public class Paciente extends Usuarios {

    private String email;
    private Long celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;
    public Paciente(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String email, Long celular, LocalDateTime fechaNacimiento, Double altura,
            Double peso, TipoSangre tipoSangre, char factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getCelular() {
        return celular;
    }
    public void setCelular(Long celular) {
        this.celular = celular;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public char getFactorRH() {
        return factorRH;
    }
    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }
   
    
}
