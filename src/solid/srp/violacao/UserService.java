package solid.srp.violacao;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class UserService {

    public void changeMail(User user) {
        if (hasPermission(user)) {
            // altera o e-mail
        }
    }

    private boolean hasPermission(final User user) {
        // verifica se o usuário possui permissão
        return true;
    }

}