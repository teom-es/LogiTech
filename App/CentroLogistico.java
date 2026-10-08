import java.util.ArrayList;

public class CentroLogistico {
    private ArrayList<Enviable> inventario;

    public CentroLogistico() {
        this.inventario = new ArrayList<>();
    }

    public void registrarPaquete(Enviable e) {
        inventario.add(e);
    }

    public void mostrarReporteEnvios() {
        for (Enviable e : inventario) {
            System.out.println(((Paquete) e).obtenerDetalle());
            System.out.println(
                    "Costo de envio: " + e.calcularCostoEnvio() + " Apto para envio: "
                            + (e.esAptoparaEnvioAereo() ? "Si"
                                    : "No"));
        }
    }

    public double calcularRecaudacionTotal() {
        double total = 0;
        for (Enviable e : inventario) {
            total += e.calcularCostoEnvio();
        }
        return total;
    }
}