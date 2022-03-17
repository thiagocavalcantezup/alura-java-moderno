import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate data = LocalDate.of(2025, Month.JANUARY, 31);
        int anos = data.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, data);
        System.out.println(periodo.getDays());

        LocalDate proximaData = data.plusYears(4);
        System.out.println(proximaData);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(proximaData.format(formatador));

        DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorHoras));
        System.out.println(agora.toLocalDate().format(formatador));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);
    }

}
