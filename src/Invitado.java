import exceptions.AburrimientoException;
import exceptions.HambreException;

public abstract class Invitado {
    private String nombre;
    private int hambre;
    private int aburrimiento;

    private final int MAX_HAMBRE = 100;
    private final int MIN_HAMBRE = 0;
    private final int MAX_ABURRIMIENTO = 100;
    private final int MIN_ABURRIMIENTO = 0;

    public Invitado(String nombre, int hambre, int aburrimiento) throws HambreException, AburrimientoException {
        this.nombre = nombre;
        setHambre(hambre);
        setAburrimiento(aburrimiento);

    }


    //Metodos abstractos
    public abstract void reaccionar(Evento evento);

    public abstract int aburrirse(int aburrimiento);

    public abstract int divertirse(int aburrimiento);

    public abstract int pasarHambre(int hambre);

    public abstract int comer(int comer);
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) throws HambreException {
        if (this.hambre < MIN_HAMBRE) {
            throw new HambreException("El hambre debe ser mayor que 0");
        } else if (this.hambre > MAX_HAMBRE) {
            throw new HambreException("Debe de ser menor que " + MAX_HAMBRE);
        }

        this.hambre = hambre;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento)throws AburrimientoException {
        if (this.aburrimiento < MIN_ABURRIMIENTO){
            throw new AburrimientoException("El aburrimiento debe ser positivo");
        } else if (this.aburrimiento > MAX_ABURRIMIENTO) {
            throw new AburrimientoException("El aburrimiento debe ser menor a " + MAX_ABURRIMIENTO);
        }
        this.aburrimiento = aburrimiento;
    }

}
