import java.util.Date;
import br.edu.ifpi.dominio.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Endereco endereco = new Endereco("Pics", "Sao Jose", "Rua de zeze", 21);
        Conta conta = new Conta(5427272, 054, 1000.00);
        Conta conta2 = new Conta(5427272, 054, 1000.00);
        Cliente cliente = new Cliente("Zeze", "514.297.801-51", LocalDate.of(2000, 1, 15), endereco, conta);

       conta.transferir(100, conta);
    }

}
