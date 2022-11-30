

public class ReservaHotel {

    private String documento;
    private String nombre;
    private String celular;
    private String fechaReserva;
    private String horaReserva;

    public ReservaHotel(String documento, String nombre, String celular, String fechaReserva, String horaReserva) {
        this.documento = documento;
        this.nombre = nombre;
        this.celular = celular;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    @Override
    public String toString() {
        return "DatosReservacion{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", celular=" + celular +
                ", fechaReserva=" + fechaReserva +
                ", horaReserva=" + horaReserva +
                '}';
    }
}


