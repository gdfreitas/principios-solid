package solid.isp.solucao;

@SuppressWarnings("all")
public abstract class Veiculo implements AcaoMotor {

    private boolean motorLigado;

    public boolean isMotorLigado() {
        return motorLigado;
    }

    @Override
    public void ligarMotor() {
        motorLigado = true;
    }

    @Override
    public void desligarMotor() {
        motorLigado = false;
    }

}