package solid.isp.solucao;

@SuppressWarnings("all")
public class Drone extends Veiculo implements AcaoCamera {

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

}
