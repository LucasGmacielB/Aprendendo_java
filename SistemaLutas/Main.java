public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[7];
        lutadores[0] = new Lutador("lucas","masculino", "brasileiro", 30, 1.80, 80.3, 0, 0, 0);
        lutadores[1] = new Lutador("jose","masculino", "brasileiro", 28, 1.75, 70.0, 0, 0, 0);
        lutadores[2] = new Lutador("mario","masculino", "brasileiro", 35, 1.85, 90.0, 0, 0, 0);
        lutadores[3] = new Lutador("joao","masculino", "brasileiro", 25, 1.70, 60.0, 0, 0, 0);
        lutadores[4] = new Lutador("pedro","masculino", "brasileiro", 32, 1.78, 75.0, 0, 0, 0);
        lutadores[5] = new Lutador("carlos","masculino", "brasileiro", 29, 1.82, 85.0, 0, 0, 0);
        lutadores[6] = new Lutador("joana","feminino", "brasileiro", 28, 1.75, 70.0, 0, 0, 0);
        Luta fight = new Luta();
        //Exemplo de luta
        fight.marcarluta(lutadores[4], lutadores[6]);
        fight.lutar();
        lutadores[4].status();
        lutadores[6].status();
    }
}
