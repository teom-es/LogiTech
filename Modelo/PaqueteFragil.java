public class PaqueteFragil extends Paquete {
    private String nivelProteccion;

    public PaqueteFragil(String codigoTrack, double pesoKg, String destino, String nivelProteccion) {
        super(codigoTrack, pesoKg, destino);
        this.nivelProteccion = nivelProteccion;
    }

    public String getnivelProteccion() {
        return nivelProteccion;
    }

    public void setnivelProteccion(String nivelProteccion) {
        String nivel = nivelProteccion.trim();
        if (nivel.equalsIgnoreCase("Baja")) {
            this.nivelProteccion = "Baja";
        } else if (nivel.equalsIgnoreCase("Media")) {
            this.nivelProteccion = "Media";
        } else if (nivel.equalsIgnoreCase("Alta")) {
            this.nivelProteccion = "Alta";
        } else {
            throw new IllegalArgumentException(
                    "Nivel de protección inválido: '" + nivelProteccion + "'. Use Baja, Media o Alta.");
        }
    }

    public boolean esAptoparaEnvioAereo() {
        return false;
    }

    public double calcularCostoEnvio() {
        if (nivelProteccion == "Alta") {
            return 1000 * getPesoKg() * 1.30;
        } else if (nivelProteccion == "Media") {
            return 1000 * getPesoKg() * 1.15;
        } else {
            return 1000 * getPesoKg();
        }
    }

    public String obtenerDetalle() {
        return "Codigo: " + getCodigotrack() + " Destino: " + getDestino() + " Peso: " + getPesoKg()
                + " Nivel de proteccion: " + nivelProteccion;
    }

}