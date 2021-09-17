import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class scrapping {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Document d =Jsoup.connect("https://www.imdb.com/list/ls501028731/?ref_=watch_wchgd_1_2_m_wtw_netflix_i").timeout(60000).get();
		Elements body =d.select("div.lister-list");
		//System.out.println(body.select("div").size());
		for(Element e: body.select("div"))
		{
	String img=	e.select("div.lister-item-image.ribbonize img").attr("src");
	System.out.println(img);
	String title=e.select("div.lister-item-image.ribbonize img").attr("alt"); 
	System.out.println(title);
	String year =e.select("div.lister-item-content h3.lister-item-header span.lister-item-year text-muted.unbold").text();
	System.out.println(year);
	String rating =e.select("div.ipl-rating-star.small span.ipl-rating-star__rating").text().trim();
	System.out.println(rating);

	
		}
	}

}
