package solid.isp.violacao;

@SuppressWarnings("all")
public class Drone extends Veiculo {

    private boolean cameraLigada;

    public boolean isCameraLigada() {
        return cameraLigada;
    }

    @Override
    public void ligarCamera() {
        cameraLigada = true;
    }

    @Override
    public void desligarCamera() {
        cameraLigada = false;
    }

    @Override
    public void ligarRadio() {
        throw new UnsupportedOperationException("Drone não possui rádio!");
    }

    @Override
    public void desligarRadio() {
        throw new UnsupportedOperationException("Drone não possui rádio!");
    }
}