
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
public class App {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("http://www.mplsrenters.com/").get();
        String title = doc.title();

        String someText = doc.getElementById("typed-strings").html();
        System.out.println(someText);
    }
}
