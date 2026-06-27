public class Main {
	public static void main(String[] args) {
		Personagem heroi1 = new Guerreiro("Arthus", "Guerreiro", 1, 100, 10.5);
		Personagem heroi2 = new Mago("Elenara", "Mago", 5, 80, 12.5);

		Grupo grupoA = new Grupo();
		Grupo grupoB = new Grupo();

		grupoA.adicionarPersonagem(heroi1);
		grupoB.adicionarPersonagem(heroi2);

		System.out.println("=== EQUIPE A ===");
		grupoA.listarPersonagens();

		System.out.println("=== EQUIPE B ===");
		grupoB.listarPersonagens();

		grupoA.batalhar(heroi1, heroi2);
	}
}
