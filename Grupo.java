import java.util.ArrayList; // Comando obrigatório para o Java trazer a "ferramenta" ArrayList

public class Grupo {
    
    // 1. O Atributo: Nossa lista elástica de personagens
    private ArrayList<Personagem> membros;

    // 2. O Construtor: Inicializa a lista vazia quando um Grupo for criado
    public Grupo() {
        this.membros = new ArrayList<>();
    }

    // 3. Método para adicionar um herói na lista
    public void adicionarPersonagem(Personagem p) {
	membros.add(p);
    }

    // 4. Método para listar todos os heróis do grupo
    public void listarPersonagens() {
        System.out.println("--- Membros do Grupo ---");
	for (Personagem p : membros) {
                p.exibirStatus();
        }
    }
    // 5. Método de Batalha
    public void batalhar(Personagem a, Personagem b) {
        System.out.println("\n--- BATALHA: " + a.getNome() + " VS " + b.getNome() + " ---");

        // SUA TAREFA:
        // Passo A: Calcule o poder do personagem 'a'
        // Dica: multiplique a.getNivel() por a.getPoderBase()
        double poderA =	a.getNivel() * a.getPoderBase();

        // Passo B: Calcule o poder do personagem 'b' usando a mesma lógica
        double poderB = b.getNivel() * b.getPoderBase();

        // Passo C: Crie a estrutura de decisão (if / else if / else) para ver quem ganhou
        if (poderA > poderB) {
            System.out.println(a.getNome() + " venceu! Poder total: " + poderA);
        } // Adicione o 'else if' para o caso do B vencer, e o 'else' para o empate!
	else if (poderB > poderA) {
            System.out.println(b.getNome() + " venceu! Poder total: " + poderB);
	}
	else {
            System.out.println("Ninguem venceu! Empate!");
	}
    }
}
