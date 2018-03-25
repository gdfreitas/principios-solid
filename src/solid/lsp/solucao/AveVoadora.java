package solid.lsp.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public abstract class AveVoadora extends Ave {

    public void voar() {
        System.out.println("<voar>");
    }

    // ... outros comportamentos que somente aves que voam possuem

}
