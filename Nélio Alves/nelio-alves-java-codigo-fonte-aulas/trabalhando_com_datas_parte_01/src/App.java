import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/05/2020");
        Date y2 = sdf2.parse("25/05/2021 21:08:01");
        Date y3 = Date.from(Instant.parse("2022-05-25T21:30:30Z")); // padrão ISO 8601 UTC

        System.out.println("y1 s/ format: " + y1);
        System.out.println("y1 c/ format: " + sdf1.format(y1));
        System.out.println("y2 s/ format: " + y2);
        System.out.println("y2 c/ format: " + sdf2.format(y2));
        System.out.println("y3 s/ format: " + y3);
        System.out.println("y3 c/ format: " + sdf2.format(y3));
        
        System.out.println("------------------------------------------");
        
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("x1 s/ format: " + x1);
        System.out.println("x1 c/ format: " + sdf1.format(x1));
        System.out.println("x2 s/ format: " + x2);
        System.out.println("y2 c/ format: " + sdf2.format(x2));
        
        System.out.println("------------------------------------------");

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("y1 s/ format: " + y1);
        System.out.println("y1 c/ format: " + sdf3.format(y1));
        System.out.println("y2 s/ format: " + y2);
        System.out.println("y2 c/ format: " + sdf3.format(y2));
        System.out.println("y3 s/ format: " + y3);
        System.out.println("y3 c/ format: " + sdf3.format(y3));





    }
}
