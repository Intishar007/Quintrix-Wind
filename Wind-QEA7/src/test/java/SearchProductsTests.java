import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductsTests extends SeleniumTestBase{
	@Test
	public void tc017_CanSearchWithSpecialKeyword() throws InterruptedException {
		WebElement search=this.getDriver().findElement(By.id("search_query_top"));
		WebElement submit=this.getDriver().findElement(By.name("submit_search"));

		search.sendKeys("Dresses");
		submit.click();
		Thread.sleep(1000);

		String actualUrl ="http://invenauto.tech/index.php?controller=search&orderby=position&orderway=desc&search_query=Dresses&submit_search=";
		String expectedUrl= this.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
}