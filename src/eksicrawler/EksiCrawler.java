package eksicrawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EksiCrawler {

    public static void main(String[] args) {
        
        try{
            Document doc = Jsoup.connect("https://eksisozluk.com/basliklar/gundem").get(); 
            Element today = doc.getElementById("index-section");
            Elements todaysTitles = today.getElementsByTag("a");
            
            for(Element i : todaysTitles){
                System.out.println(i.text());
            }
           
        }catch(IOException e){
            System.out.println(e);
        }finally{
            System.out.println("Process completed!");
        }
    }
}