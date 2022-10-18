import java.util.Date;
import br.edu.ifpi.dominio.*;
import java.time.LocalDate;
import java.util.Scanner;
// Adicionar scanner completo.
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        Endereco endereco = new Endereco("Pics", "Sao Jose", "Rua de zeze", 21);
        Poupanca poupanca = new Poupanca(4893627, 026, 1000.00, null);
        Corrente corrente = new Corrente(5427272, 054, 2000.00, null, 500.00);
        Cliente cliente = new Cliente("Zeze", "514.297.801-51", LocalDate.of(2000, 1, 15), endereco, corrente);
        Cliente cliente2 = new Cliente("teus", "514.291.941-15", LocalDate.of(2000, 1, 15), endereco, poupanca);

        System.out.print("total conta poupanca = ");
        System.out.println(poupanca.getSaldo());
        System.out.print("total conta corrente = ");
        System.out.println(corrente.getSaldo());

        //conta.transferir(conta2, 100.00);

        //System.out.println(conta2.getSaldo());
        //System.out.println(conta.getSaldo());

        poupanca.sacar(1500.00);

        System.out.println(poupanca.getSaldo());
    }
}