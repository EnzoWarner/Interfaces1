public class Cliente implements Autenticavel {
    private String senha;
    
    public Cliente(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}
