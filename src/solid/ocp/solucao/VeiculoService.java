package solid.ocp.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class VeiculoService {

    private Veiculo veiculo;

    public VeiculoService(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    // não tem a necessidade de alterar esta classe caso um novo tipo de controle seja criado
    public void alterarControleDirecao(final ControleDirecao controleDirecao) {
        veiculo.setInjecaoCombustivel(controleDirecao.getInjecaoCombustivel());
        veiculo.setRigidezDirecao(controleDirecao.getRigidezDirecao());
        veiculo.setRigidezSuspensao(controleDirecao.getRigidezSuspensao());
    }

}
