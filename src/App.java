
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
public class App {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.luc.edu/").get();
        String title = doc.title();
        System.out.println(title);

        Element policy = doc.getElementById("anti-discriminatory-content");

        String policyHeader = policy.select("h5").first().text();

        String policyText = policy.select("p").first().text();
        
        System.out.println(policyHeader);
        System.out.println(policyText);
    }
}
