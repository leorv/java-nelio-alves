import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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



    }
}