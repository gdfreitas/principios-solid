package solid.isp.violacao;

@SuppressWarnings("all")
public class Carro extends Veiculo {

    private boolean radioLigado;

    public boolean isRadioLigado() {
        return radioLigado;
    }

    @Override
    public void ligarRadio() {
        radioLigado = true;
    }

    @Override
    public void desligarRadio() {
        radioLigado = false;
    }

    @Override
    public void ligarCamera() {
        throw new UnsupportedOperationException("Carro não possui câmera!");
    }

    @Override
    public void desligarCamera() {
        throw new UnsupportedOperationException("Carro não possui câmera!");
    }
}