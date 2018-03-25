package solid.ocp.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class VeiculoService {

    private Veiculo veiculo;

    public VeiculoService(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void alterarControleDirecao(final ControleDirecao controleDirecao) {
        switch (controleDirecao) {
            case SPORT:
                veiculo.setInjecaoCombustivel(45);
                veiculo.setRigidezDirecao(35);
                veiculo.setRigidezSuspensao(50);
                break;

            case CONFORTO:
                veiculo.setInjecaoCombustivel(25);
                veiculo.setRigidezDirecao(20);
                veiculo.setRigidezSuspensao(20);
                break;

            case ECONONOMICO: // necessidade de adicionar no futuro esta opção
                veiculo.setInjecaoCombustivel(10);
                veiculo.setRigidezDirecao(15);
                veiculo.setRigidezSuspensao(15);
                break;

            default:
                veiculo.setInjecaoCombustivel(15);
                veiculo.setRigidezDirecao(15);
                veiculo.setRigidezSuspensao(15);
        }
    }

}
