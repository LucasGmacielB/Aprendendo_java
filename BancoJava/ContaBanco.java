package BancoJava;
public class ContaBanco {
    public int numeroConta = 0;
    protected String tipo = "";
    private String dono = "";
    private double saldo = 0.0;
    private boolean status = false;
    //método construtor
    public ContaBanco(int numeroConta, String dono){
        this.dono = dono;
        this.numeroConta = numeroConta; 
        fecharConta();
    }
    //ao colocar o valor no parâmetro "depositar" ela sera automaticamente adicionada ao saldo
    public double depositar(double depositar){
        if (this.status == true) {
            this.saldo = depositar;
        }
        return this.saldo;
    }
    //se o parâmetro retirar for maior que o saldo não acontecerá nada. Se o parâmetro retirar for mair que zero e menor ou igual ao saldo, ele poderá ser subtraído do saldo
    public double retirar(double retirar){
        if (retirar > this.saldo) {
            this.saldo = getSaldo();
        } else if (retirar > 0 && retirar <= this.saldo) {
            this.saldo -= retirar;
        }
        return this.saldo;
    }
// abre a conta e da um bônus dependendo do tipo da conta colocado no parâmetro "tipo" do métopdo
    public void abrirConta(String tipo){
        if (this.tipo == "CC" || this.tipo == "CP") {
            this.status = true;
        }
        this.tipo = tipo;
        if (this.tipo == "CC") {
            this.saldo += 10;
        } else if (this.tipo == "CP") {
            this.saldo +=20;
        }
        
    }
// só fecha a conta se o saldo for igual a 0
    public void fecharConta(){
        this.tipo = "";
        if (this.saldo == 0) {
            this.status = false;
        }
    }
//ao ser chamado mastra algumas informações para o usuário
    public void infoConta(){
        System.out.println("-------------------------------------------");
        System.out.println("Informações da conta:");
        System.out.println("Conta número " + getNumeroConta());
        System.out.println("Dono: " + getDono());
        if (this.tipo == "CC") {
            System.out.println("Tipo de conta: " + getTipo() + " Parabéns!!! Você recebeu 10 reais um bonos por abrir sua conta CC.");
        } else if (this.tipo == "CP") {
            System.out.println("Tipo de conta: " + getTipo() + " Parabéns!!! Você recebeu 20 um bônus por abrir sua conta CP.");
        }
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + (this.status ? "Conta aberta" : "Conta fechada"));
    }

    public double pagarMensal() {
        double mensal = 12;
        this.saldo -= mensal;
        return this.saldo;
    }
//todos os GETs
    public double getSaldo() {
        return this.saldo;
    }
    public String getDono() {
        return this.dono;
    }
     public String getTipo() {
        return this.tipo;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }

}
