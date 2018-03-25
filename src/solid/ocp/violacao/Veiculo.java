package solid.ocp.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Veiculo {

    private double rigidezSuspensao;
    private double rigidezDirecao;
    private double injecaoCombustivel;

    public double getRigidezSuspensao() {
        return rigidezSuspensao;
    }

    public void setRigidezSuspensao(final double rigidezSuspensao) {
        this.rigidezSuspensao = rigidezSuspensao;
    }

    public double getRigidezDirecao() {
        return rigidezDirecao;
    }

    public void setRigidezDirecao(final double rigidezDirecao) {
        this.rigidezDirecao = rigidezDirecao;
    }

    public double getInjecaoCombustivel() {
        return injecaoCombustivel;
    }

    public void setInjecaoCombustivel(final double injecaoCombustivel) {
        this.injecaoCombustivel = injecaoCombustivel;
    }
}
