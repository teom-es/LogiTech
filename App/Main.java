public class Main {
    public static void main(String[] args) {
        CentroLogistico centro = new CentroLogistico();

        PaqueteEstandar e1 = new PaqueteEstandar("1234", 10, "Argentina", 3);
        PaqueteEstandar e2 = new PaqueteEstandar("4321", 9, "Chaco", 2);
        PaqueteFragil f1 = new PaqueteFragil("5678", 20, "Chile", "Alta");
        PaqueteFragil f2 = new PaqueteFragil("8765", 15, "Paraguay", "Baja");

        e1.actualizarDestino("Buenos aires");
        f1.actualizarDestino("Peru", true);

        centro.registrarPaquete(e1);
        centro.registrarPaquete(e2);
        centro.registrarPaquete(f1);
        centro.registrarPaquete(f2);

        try {
            new PaqueteEstandar("1234", -10, "Argentina", 3);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error capturado: " + ex.getMessage());
        }

        try {
            new PaqueteEstandar("", 10, "Argentina", 3);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error capturado: " + ex.getMessage());
        }
        try {
            new PaqueteFragil("5678", 20, "Chile", "");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error capturado: " + ex.getMessage());
        }

        try {
            centro.mostrarReporteEnvios();
            System.out.println("Recaudacion total: " + centro.calcularRecaudacionTotal());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}