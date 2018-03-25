package solid.lsp.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Avestruz implements Ave {

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Avestruz não voa!");
    }

    @Override
    public void comer() {
        System.out.println("<alimentando-se>");
    }
}
