public class Main {
    public static void main(String[] args) {
        // Criação dos objetos
        Diretor diretor = new Diretor("senhaDiretor123");
        Gerente gerente = new Gerente("senhaGerente456");
        Cliente cliente = new Cliente("senhaCliente789");
        
        // Criação do sistema interno
        SistemaInterno sistema = new SistemaInterno();
        
        // Teste de login no sistema interno
        System.out.println("Testando login do Diretor:");
        sistema.login(diretor, "senhaDiretor123"); // Login realizado com sucesso!
        sistema.login(diretor, "senhaIncorreta");  // Falha no login!
        
        System.out.println("Testando login do Gerente:");
        sistema.login(gerente, "senhaGerente456"); // Login realizado com sucesso!
        sistema.login(gerente, "senhaIncorreta");  // Falha no login!
        
        System.out.println("Testando login do Cliente:");
        sistema.login(cliente, "senhaCliente789"); // Login realizado com sucesso!
        sistema.login(cliente, "senhaIncorreta");  // Falha no login!
    }
}
