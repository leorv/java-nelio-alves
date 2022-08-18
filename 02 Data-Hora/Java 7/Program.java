import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        
        System.out.println("y1 = " + sdf1.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));
        System.out.println("y3 = " + sdf3.format(y3));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        // Passando milissegundos
        Date x3 = new Date(0L);
        System.out.println("x3 = " + x3);
        Date x4 = new Date(1000L * 60L * 60L * 5L); // 5hrs em milissegundos. L = long.
        System.out.println("x4 = " + x4);

        // Usando Callendar (Uma forma mais antiga, sistemas legados)
        // Somando uma unidade de tempo
        Calendar cal = Calendar.getInstance();
        cal.setTime(y3);
        cal.add(Calendar.HOUR_OF_DAY, 4); // Adicionando 4 horas à data do calendário.
        y3 = cal.getTime();
        System.out.println("y3 Calendar: " + y3);
        
        // Acessando uma unidade que você queira.
        int minutes = cal.get(Calendar.MINUTE); // Cuidado, para month, ele começa no mês 0 (zero).
        System.out.println("Quantidade de minutos (Calendar)" + minutes);
    }
}