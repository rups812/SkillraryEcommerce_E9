package Scripts;

import org.testng.annotations.Test;

import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2()
	{
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.childBrowser(driver);
		demoSkillraryPage ds=new demoSkillraryPage(driver);
		ds.feedbackButton();
		DownloadInvoicePage dI=new DownloadInvoicePage(driver);
		dI.downloadInvoiceWebElement();
	}
	
}
