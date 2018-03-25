package solid.dip.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Botao {

    // botão fica dependente da classe concreta Lampada
    private Lampada lampada;

    public void acionar(final boolean ligar) {
        if (ligar) {
            lampada.ligar();
        } else {
            lampada.desligar();
        }
    }

    public Lampada getLampada() {
        return lampada;
    }

    public void setLampada(final Lampada lampada) {
        this.lampada = lampada;
    }

}
