import org.junit.* ;
import static org.junit.Assert.* ;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class BasicTestIT {
	@Test
	public void testSayHi() throws Exception {
		final WebClient webClient = new WebClient();

		final HtmlPage page = webClient.getPage("https://localhost:5310/path/login");
		assertEquals("My Web App", page.getTitleText());

		final String pageAsText = page.asText();
		assertTrue(pageAsText.contains("Hello World"));

		webClient.closeAllWindows();
	}
}