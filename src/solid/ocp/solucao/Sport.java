package solid.ocp.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Sport implements ControleDirecao {

    @Override
    public double getRigidezSuspensao() {
        return 50;
    }

    @Override
    public double getRigidezDirecao() {
        return 35;
    }

    @Override
    public double getInjecaoCombustivel() {
        return 45;
    }
}
