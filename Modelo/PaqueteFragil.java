public class PaqueteFragil extends Paquete {

    private String nivelProteccion;

    public PaqueteFragil(String codigoTrack, double pesoKg , String destino , String nivelProteccion) {
        super(codigoTrack, pesoKg, destino);
        this.nivelProteccion = nivelProteccion;
    }

    
    @Override
    public String obtenerDetalle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double calcularCostoEnvio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean esAptoparaEnvioAereo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}