package feliz;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        Cliente isabella = new Cliente();
        isabella.setNome("Isabella");

        Conta cc = new ContaCorrente(isabella);
        Conta poupanca = new ContaPoupanca(isabella);

        cc.depositar(5000);
        cc.transferir(600, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}

