package solid.dip.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Botao {

    // botão liga ou desliga qualquer dispositivo, Lampada, Motor, Alarme, etc
    private Dispositivo dispositivo;

    public void acionar(final boolean ligar) {
        if (ligar) {
            dispositivo.ligar();
        } else {
            dispositivo.desligar();
        }
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
}
