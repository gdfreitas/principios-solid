package solid.isp.solucao;

@SuppressWarnings("all")
public class Carro extends Veiculo implements AcaoRadio {

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

}