public abstract class Paquete implements Enviable {
    private String codigoTrack;
    private double pesoKg;
    private String destino;


    public Paquete(String codigoTrack, double pesoKg , String destino) {
        this.codigoTrack = codigoTrack;
        this.pesoKg = pesoKg;
        this.destino = destino;
    }

    public String getCodigotrack() {
        return codigoTrack;
    }

    public void setCodigotrack(String codigoTrack) {
        if (codigoTrack == null || codigoTrack == "") {
            throw new IllegalArgumentException("El codigo no puede estar vacío.");
        }
        this.codigoTrack = codigoTrack;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso del paquete no puede estar vacio o ser negativo o cero");
        }
        this.pesoKg = pesoKg;
    }

    public String getDestino() {
        return destino;
    }

    public void actualizarDestino(String nuevoDestino, boolean express) {
        if (express == true) {
            destino = nuevoDestino + "[PRIORITARIO]";
        } else {
            destino = nuevoDestino;
        }
    }

    public abstract String obtenerDetalle();
}