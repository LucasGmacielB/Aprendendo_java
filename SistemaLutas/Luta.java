import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    public void marcarluta(Lutador l01, Lutador l02) {
        if (l01.getCategoria() == l02.getCategoria() && l01 != l02) {
            this.desafiado = l01;
            this.desafiante = l02;
            if (desafiado.getSexo().equals(desafiante.getSexo())) {
                this.aprovada = true;
            } else {
                this.aprovada = false;
            }
        } else {
            this.aprovada = false;
        }
    }

    public void lutar() {
        if (this.aprovada == true) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random ganhador = new Random();
            int var = ganhador.nextInt(3);
            System.out.println("=====RESULTADO=====");
            if (var == 0) {
                System.out.println("Empate");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            } else if (var == 1) {
                System.out.println(desafiado.getNome() + " ganhou");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else if (var == 2){
                System.out.println(desafiante.getNome() + " ganhou");
                desafiado.perderLuta();
                desafiante.ganharLuta();
            }
            System.out.println("====================");
        } else {
            System.out.println("Luta não aprovada");
        }
    }
    
    

    
}
