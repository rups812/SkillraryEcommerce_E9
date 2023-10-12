package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryHomePage;
import POM.TestingPage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.childBrowser(driver);
		demoSkillraryPage ds=new demoSkillraryPage(driver);
		utilities.dropDown(ds.getSearchDd(), pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utilities.Scrolling(driver, tp.getfbIcon());
		tp.fbIconWebElement();
	}
}
