package BancoJava;
public class Principal {
    public static void main(String[] args) {
        int numconta = 0;
        ContaBanco lucas = new ContaBanco(++ numconta, "Lucas");
        
        lucas.abrirConta("CC");
        lucas.fecharConta();
        lucas.infoConta();
    }
} 