import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        // Formato padrão ISO 8601

        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Global, Londres.

        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Personalizado, Brasil.

        // Formato customizado
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        // Passando isoladamente os dados.
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println("LocalDate.now(): " + date01);
        System.out.println("LocalDateTime.now(): " + date02);
        System.out.println("Instant.now(): " + d03);

        System.out.println("LocalDate.parse: " + d04);
        System.out.println("LocalDateTime.parse: " + d05);
        System.out.println("Instant.parse: " + d06);
        System.out.println("Instant.parse: (Brasil)" + d07);

        System.out.println("LocalDate.parse dd/mm/yyyy: " + d08);
        System.out.println("LocalDateTime.parse dd/mm/yyyy HH:mm: " + d09);

        System.out.println("LocalDate.of: " + d10);
        System.out.println("LocalDateTime.of: " + d11);

        // Transformando data para texto
        System.out.println("LocalDate d10 formatado dd/MM/yyyy: " + d10.format(fmt1));
        // outra forma de chamar a função.
        System.out.println("LocalDate d10 formatado dd/MM/yyyy (outra forma): " + fmt1.format(d10));

        // Dois formatos para a mesma data:
        System.out.println("LocalDateTime d05 dd/MM/yyyy: " + d05.format(fmt1));
        System.out.println("LocalDateTime d05 dd/MM/yyyy HH:mm: " + d05.format(fmt2));

        // Formatando Instant (Global)
        System.out.println("Instant d06 formatado: " + fmt3.format(d06));

        // Converter data-hora global para local
        // // tem que falar o timezone.
        // for (String s : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(s);
        // }
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r1 LocalDate system default = " + r1);
        System.out.println("r2 LocalDate portugal = " + r2);
        System.out.println("r1 LocalDateTime system default = " + r3);
        System.out.println("r2 LocalDateTime portugal = " + r4);

        // Pegar uma informação específica
        System.out.println("dia do mês da LocalDate d04: " + d04.getDayOfMonth());

        // Cálculo com data e hora
        // Lembrando que data e hora são imutáveis, se quer saber quando era uma hora antes,
        // tem que criar um novo objeto e receber o valor.
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("pastWeekLocalDate d04: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate d04: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("pastWeekLocalDateTime d05: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime d05: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // Using amount with temporal unit
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant d06: " + pastWeekInstant);
        System.out.println("nextWeekInstant d06: " + nextWeekInstant);

        // Calcular a duração
        // Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0, 0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("Duration t1 = " + t1.toDays());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("Duration t2 = " + t2.toDays());
        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("Duration t3 = " + t3.toDays());
    }
}