public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Guerreiro("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Mago("Elenara", "Mago", 5, 80, 12.5);

	Personagem[] equipe = new Personagem[2];

	equipe[0] = heroi1;
	equipe[1] = heroi2;

	System.out.println("-- Iniciando a Batalha --");

	for (Personagem p : equipe) {
		p.exibirStatus();
		p.usarHabilidadeEspecial();
	}

	System.out.println("--------------------------");
    }
}
