package solid.ocp.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Conforto implements ControleDirecao {

    @Override
    public double getRigidezSuspensao() {
        return 20;
    }

    @Override
    public double getRigidezDirecao() {
        return 20;
    }

    @Override
    public double getInjecaoCombustivel() {
        return 25;
    }

}
