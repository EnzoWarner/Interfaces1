public class SistemaInterno {
    public void login(Autenticavel autenticavel, String senha) {
        if (autenticavel.autentica(senha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login!");
        }
    }
}
