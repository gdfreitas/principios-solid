package solid.lsp.solucao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Aguia extends AveVoadora {

    @Override
    public void comer() {
        System.out.println("<alimentando-se>");
    }

    @Override
    public void voar() {
        System.out.println("<voar>");
    }

}
