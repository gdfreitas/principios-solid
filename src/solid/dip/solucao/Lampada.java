package solid.dip.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Lampada implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("ligar lampada");
    }

    @Override
    public void desligar() {
        System.out.println("desligar lampada");
    }
}
