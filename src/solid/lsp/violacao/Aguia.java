package solid.lsp.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Aguia implements Ave {

    @Override
    public void voar() {
        System.out.println("<voando rápido>");
    }

    @Override
    public void comer() {
        System.out.println("<alimentando-se>");
    }

}
