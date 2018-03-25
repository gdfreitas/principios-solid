package solid.ocp.solucao;

/**
 * @author gabriel.freitas
 */
public interface ControleDirecao {

    default double getRigidezSuspensao() {
        return 0;
    }

    default double getRigidezDirecao() {
        return 0;
    }

    default double getInjecaoCombustivel() {
        return 0;
    }

}
