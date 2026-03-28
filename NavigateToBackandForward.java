package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBackandForward {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     //Navigate to Myntra
     driver.get("https://www.myntra.com/?utm_source=gh_toi&utm_medium=toi_rev&utm_campaign=gh_toi_Listicle_3&gad_source=1&gad_campaignid=23485853448&gbraid=0AAAABCrN4sOs2CKrPBuBKrhWBQzagKEPq&gclid=Cj0KCQiA5I_NBhDVARIsAOrqIsarn8NiwhcEwnlMVs9YjUBqoSLhL48flcy2sg66aRIxJWKwX_MIrW4aAoEJEALw_wcB");
     Thread.sleep(3000);
   //Navigate to BigBasket
     driver.navigate().to("https://www.bigbasket.com/ps/?q=paneer&nc=as&page=1&filter=%5B%7B%22name%22%3A%22Brands%22%2C%22type%22%3A%22brand%22%2C%22values%22%3A%5B%7B%22id%22%3A787%2C%22name%22%3A%22Milky+Mist%22%2C%22image%22%3A%22%22%2C%22slug%22%3A%22milky-mist%22%2C%22level%22%3A0%2C%22url%22%3A%22milky-mist%22%2C%22is_selected%22%3Afalse%7D%5D%7D%5D&gad_source=1&gad_campaignid=21496179289&gbraid=0AAAAApHC0mh6Tq8weIUzNIKFuPd0Sjxid&gclid=Cj0KCQiA5I_NBhDVARIsAOrqIsZIuXCDActMdpph1LMP4YWO9dMxbmTd37S2T2ROc3zrUa6YV2HmML4aAoRsEALw_wcB");
     Thread.sleep(3000);
     //Navigate to Ajio
     driver.navigate().to("https://www.ajio.com/shop/women?&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_TROAS_Sept2025&gad_source=1&gad_campaignid=23011145465&gbraid=0AAAAADP0DvfYtmWJClz0Xb9_EpyReNZ1_&gclid=Cj0KCQiA5I_NBhDVARIsAOrqIsYyuPA2fS7-zBMJ-l8Zl1QYG_m_mozae1nzpxbJoZ294Wi3fV9bioEaAov4EALw_wcB");
     Thread.sleep(3000);
     //Navigate back to BigBasket
     driver.navigate().back();
     System.out.println(driver.getTitle());
     Thread.sleep(3000);
     //Navigate to Ajio and verify
     driver.navigate().forward();
     System.out.println(driver.getTitle());
	}

}
