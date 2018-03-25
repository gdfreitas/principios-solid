package solid.ocp.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Economico implements ControleDirecao {

    @Override
    public double getRigidezSuspensao() {
        return 15;
    }

    @Override
    public double getRigidezDirecao() {
        return 15;
    }

    @Override
    public double getInjecaoCombustivel() {
        return 10;
    }

}
