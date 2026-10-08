public class PaqueteEstandar extends Paquete {
    private int diasEstimados;

    public PaqueteEstandar(String codigoTrack, double pesoKg, String destino, int diasEstimados) {
        super(codigoTrack, pesoKg, destino);
        this.diasEstimados = diasEstimados;
    }

    public int getdiasEstimados() {
        return diasEstimados;
    }

    public void setdiasEstimados(int diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    @Override
    public double calcularCostoEnvio() {
        return 1000 * getPesoKg();
    }

    @Override
    public boolean esAptoparaEnvioAereo() {
        if (getPesoKg() <= 15) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String obtenerDetalle() {
        return "Codigo: " + getCodigotrack() + " Destino: " + getDestino() + " Peso: " + getPesoKg()
                + " Dias estimados: " + diasEstimados;
    }

}