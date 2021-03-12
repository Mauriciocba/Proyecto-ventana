
public class  Reserva {
    
    private String  nombreCliente;
    private int CantAdultos;
    private int Cantninos;
    private double importeSeña;

    public double getImporteSeña() {
        return importeSeña;
    }

    public void setImporteSeña(double importeSeña) {
        this.importeSeña = importeSeña;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCantAdultos() {
        return CantAdultos;
    }

    public void setCantAdultos(int CantAdultos) {
        this.CantAdultos = CantAdultos;
    }

    public int getCantninos() {
        return Cantninos;
    }

    public void setCantninos(int Cantninos) {
        this.Cantninos = Cantninos;
    }

    public Reserva(String nombreCliente, int CantAdultos, int Cantninos, double importeSeña) {
        this.nombreCliente = nombreCliente;
        this.CantAdultos = CantAdultos;
        this.Cantninos = Cantninos;
        this.importeSeña = importeSeña;
    }

    @Override
    public String toString() {
        return  "Cliente: " + nombreCliente + " Adultos: " + CantAdultos + " Niños: " + Cantninos + " Seña:" + importeSeña;
    }

   
    
    
}
