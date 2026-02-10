import exceptions.AburrimientoException;
import exceptions.HambreException;

public class Gorron extends Invitado {

   private final int HAMBRE_INICIAL = 90;

    public Gorron(String nombre, int hambre, int aburrimiento) throws HambreException, AburrimientoException {
        super(nombre, hambre, aburrimiento);
        hambre = HAMBRE_INICIAL;
    }


    public void robarComida(){

    }


    public int getHAMBRE_INICIAL() {
        return HAMBRE_INICIAL;
    }

    @Override
    public void reaccionar(Evento evento) {
        if (Evento.MUSICA_ALTA){
            aburrirse(getAburrimiento());
        }
        if (Evento.MUSICA_BAJA){
            divertirse(getAburrimiento());
        }
    }

    @Override
    public int aburrirse(int aburrimiento) {
        return 0;
    }
}
