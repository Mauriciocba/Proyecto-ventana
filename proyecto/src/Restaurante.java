
import java.util.ArrayList;


public class Restaurante {
   
    private ArrayList<Reserva> reserva ;

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public Restaurante() {
        
        this.reserva = new ArrayList();
    }
    
    public void AgregarReserva(Reserva res){
        this.reserva.add(res);
    }
    
    
}
