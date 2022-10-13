import java.util.Date;
import br.edu.ifpi.dominio.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Endereco endereco = new Endereco("Pics", "Sao Jose", "Rua de zeze", 21);
        Conta conta = new Conta(5427272, 054, 2000.00);
        Conta conta2 = new Conta(4893627, 026, 1000.00);
        Cliente cliente = new Cliente("Zeze", "514.297.801-51", LocalDate.of(2000, 1, 15), endereco, conta);
        
        System.out.println(conta2.getSaldo());
        System.out.println(conta.getSaldo());

        conta.transferir(conta2, 100.00);

        System.out.println(conta2.getSaldo());
        System.out.println(conta.getSaldo());

        conta2.depositar(500.00);

        System.out.println(conta2.getSaldo());
    }

}