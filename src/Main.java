import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");

        Banco banco1 = new Banco("Santander");
        System.out.println(banco1.getContas());

        Conta cc = new ContaCorrente(cliente, banco1);
        Conta poupanca = new ContaPoupanca(cliente, banco1);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);

        banco1.setContas(contas);
        System.out.println(banco1.getNome());
        System.out.println(banco1.getContas());

    }
}