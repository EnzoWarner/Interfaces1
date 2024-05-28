public class Gerente extends Funcionario implements Autenticavel {
    private String senha;
    
    public Gerente(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}
