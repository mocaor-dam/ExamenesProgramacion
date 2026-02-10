import exceptions.CumpleDeLoloException;

import java.util.Random;

public class Main {
    private static final int ROPA_MAX = 4;

    public static void main(String[] args) {
        System.out.println("--- ¡COMIENZA EL CUMPLE DE LOLO! ---");
        try {
            //  1: Crea un Array de Invitados de tamaño 10.
            Invitado[] invitados = new Invitado[10];

            // TODO 2: Rellena las primeras posiciones:
            // - 3 Familiares (con nombres y stats aleatorios)
            Familiar familiar = new Familiar("Paco", 40, 50, TipoDeRegalo.DINERO);
            Familiar familiar2 = new Familiar("Juana", 20, 10, TipoDeRegalo.ROPA);
            Familiar familiar3 = new Familiar("Pepa", 90, 30, TipoDeRegalo.JUGUETES);

            invitados[0] = familiar;
            invitados[1] = familiar2;
            invitados[2] = familiar3;
            // - 3 Colegas (con nombres y stats aleatorios)
            Colega colega1 = new Colega("Javi", 30, 20, TipoDeRegalo.ROPA);
            Colega colega2 = new Colega("Ale", 60, 10, TipoDeRegalo.DINERO);
            Colega colega3 = new Colega("Dani", 80, 40, TipoDeRegalo.JUGUETES);

            invitados[3] = colega1;
            invitados[4] = colega2;
            invitados[5] = colega3;


            // - 1 Gorrón
            // PISTA: Usa un contador para saber en qué posición del array insertas.
            Gorron gorron = new Gorron("Chamorro", 90, 30);
            invitados[6] = gorron;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





        int ronda = 1;
        boolean fiestaSigue = true;
        boolean yaSeAbrieronRegalos = false;

        // Bucle de la fiesta (máximo 10 rondas)
        while (fiestaSigue && ronda <= 10) {
            System.out.println("\n--- RONDA " + ronda + " ---");
            Evento eventoActual = obtenerEventoAleatorio();
            System.out.println("Evento: " + eventoActual);

            // Evitamos que se abran regalos dos veces
            while (eventoActual == Evento.APERTURA_REGALOS && yaSeAbrieronRegalos) {
                eventoActual = obtenerEventoAleatorio();
            }

            System.out.println("Evento: " + eventoActual);

            // TODO 3: Recorre el array de invitados
            // 1. Cuidado con las posiciones null del array.
            // 2. Verifica si el invitado sigue en la fiesta.
            // 3. Haz que reaccione al evento (gestiona las excepciones).
            // 4. Si es APERTURA_REGALOS y el invitado es regalador:
            //    - Pide el regalo (imprímelo por pantalla).


            // TODO 4: Chequeo de fin de fiesta
            // - Si se han regalado 4 prendas de ropa -> Mensaje de decepción.
            // - Si no queda nadie en la fiesta -> Fin con mensaje.

            ronda++;
        }
        System.out.println("--- FIN DE LA FIESTA ---");
    }


    public Invitado[] mirarInvitados(Invitado invitados){
        for (int i = 0; i < invitados[i]; i++) {


        }
    }


    private static Evento obtenerEventoAleatorio() {
        // TODO 5: Obtener un evento aleatorio
        Evento.eventoAleatorio();

        throw new UnsupportedOperationException("Rellena el código");
    }
}