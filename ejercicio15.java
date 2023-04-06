public class ejercicio15 {

    // Definición de la tabla de ventas como una matriz de tamaño 5x7
    private int[][] tablaVentas = new int[5][7];
  
    // Definición de la estructura de datos para los registros de vendedores
    private class RegistroVendedor {
      String nombre;
      int totalVentas;
  
      RegistroVendedor(String nombre, int totalVentas) {
        this.nombre = nombre;
        this.totalVentas = totalVentas;
      }
    }
  
    // Definición del array de registros de vendedores
    private RegistroVendedor[] registros = new RegistroVendedor[5];
  
    // Constructor de la clase
    public ejercicio15() {
      // Inicialización de los registros de vendedores con nombres y total de ventas en cero
      registros[0] = new RegistroVendedor("Vendedor 1", 0);
      registros[1] = new RegistroVendedor("Vendedor 2", 0);
      registros[2] = new RegistroVendedor("Vendedor 3", 0);
      registros[3] = new RegistroVendedor("Vendedor 4", 0);
      registros[4] = new RegistroVendedor("Vendedor 5", 0);
    }
  
    // Método para ingresar una venta en la tabla de ventas
    public void ingresarVenta(int vendedor, int dia, int monto) {
      tablaVentas[vendedor][dia - 1] = monto;
      // Actualización del total de ventas del vendedor correspondiente
      registros[vendedor].totalVentas += monto;
    }
  
    // Método para obtener el total de ventas de un vendedor
    public int obtenerTotalVentas(int vendedor) {
      return registros[vendedor].totalVentas;
    }
  
    // Método para obtener el nombre de un vendedor
    public String obtenerNombreVendedor(int vendedor) {
      return registros[vendedor].nombre;
    }
  
    // Método para obtener la matriz de ventas completa
    public int[][] obtenerTablaVentas() {
      return tablaVentas;
    }
  }
  
