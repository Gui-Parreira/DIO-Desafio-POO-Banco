import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public Banco(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        contas.forEach(c -> c.getBanco());
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "{ Banco: " + nome +
                ", contas: " + contas + "}";
    }
}
