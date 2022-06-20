import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2020-05-25T21:45:15Z"));

        System.out.println(sdf.format(d));

        // Como acrescentar 4 horas

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        // Como pegar uma unidade de tempo
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println(minutes);

        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println(month);



    }
}
