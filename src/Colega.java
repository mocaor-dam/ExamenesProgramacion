import exceptions.AburrimientoException;
import exceptions.HambreException;
import interfaces.Regalador;

public class Colega extends Invitado implements Regalador {

    private TipoDeRegalo tipoDeRegalo;

    private final int MIN_HAMBRE = 50;
    private final int MAX_HAMBRE = 70;

    public Colega(String nombre, int hambre, int aburrimiento, TipoDeRegalo tipoDeRegalo) throws HambreException, AburrimientoException {
        super(nombre, hambre, aburrimiento);
        this.tipoDeRegalo = tipoDeRegalo;
        comprobarHambreColega();
    }

    public void comprobarHambreColega() throws HambreException {
        if (getHambre() > MIN_HAMBRE){
            throw new HambreException("El familiar debe de empezar entre 50 y 70 de hambre");
        } else if (getHambre() < MAX_HAMBRE) {
            throw new HambreException("El familiar debe de empezar entre 50 y 70 de hambre");
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
            divertirse(getAburrimiento());
        }
        if (Evento.MUSICA_BAJA){
            aburrirse(getAburrimiento());
        }
    }

    @Override
    public int aburrirse(int aburrimiento) {
        return 0;
    }

    @Override
    public String regalar() {
        return getTipoDeRegalo().name();
    }
}
