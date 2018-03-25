package solid.dip.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Lampada {

    private boolean isLigada;

    public boolean isLigada() {
        return isLigada;
    }

    public void ligar() {
        this.isLigada = true;
    }

    public void desligar() {
        this.isLigada = false;
    }

}
