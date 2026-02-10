import exceptions.AburrimientoException;
import exceptions.HambreException;
import interfaces.Regalador;
import jdk.jfr.Event;

public class Familiar extends Invitado implements Regalador {

    private TipoDeRegalo tipoDeRegalo;

    private final int HAMBRE_MINIMA = 30;
    private final int HAMBRE_MAXIMA = 60;


    public Familiar(String nombre, int hambre, int aburrimiento, TipoDeRegalo tipoDeRegalo) throws HambreException, AburrimientoException {
        super(nombre, hambre, aburrimiento);
        this.tipoDeRegalo = tipoDeRegalo;
        comprobarHambreFamiliar();
    }

    public void comprobarHambreFamiliar() throws HambreException {
        if (getHambre() > HAMBRE_MINIMA){
            throw new HambreException("El familiar debe de empezar entre 30 y 60 de hambre");
        } else if (getHambre() < HAMBRE_MAXIMA) {
            throw new HambreException("El familiar debe de empezar entre 30 y 60 de hambre");
        }

    }



    public TipoDeRegalo getTipoDeRegalo() {
        return tipoDeRegalo;
    }

    public void setTipoDeRegalo(TipoDeRegalo tipoDeRegalo) {
        this.tipoDeRegalo = tipoDeRegalo;
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
         return getAburrimiento() - 30;

    }

    @Override
    public int divertirse(int aburrimiento) {
        return getAburrimiento() + 20;
    }

    @Override
    public int pasarHambre(int hambre) {
        return 0;
    }

    @Override
    public int comer(int comer) {
        return 0;
    }

    @Override
    public String regalar() {
        return getTipoDeRegalo().name();
    }
}
