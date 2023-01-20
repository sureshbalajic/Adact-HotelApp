package org.test;

import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adact {
	
	static WebDriver Dri;
	
	@BeforeClass
	
	public static void url() {
		WebDriverManager.chromedriver().setup();
		
		 Dri = new ChromeDriver();
		
		Dri.get("https://adactinhotelapp.com/index.php");

	}
//	
	@Before
	
	public void str() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
	}
	
	@After
	
	public void en() {
		System.out.println(System.currentTimeMillis());
		
	}
	
	@AfterClass
	
	public static void qu() throws InterruptedException {
		Thread.sleep(8000);
		Dri.close();
	}
	@Test
	
	public void adc() throws InterruptedException {
		
	Dri.findElement(By.id("username")).sendKeys("itsmebalaji007");
	Dri.findElement(By.id("password")).sendKeys("Balaji@7");	
	Dri.findElement(By.id("login")).click();	
	WebElement tex1 = Dri.findElement(By.xpath("//td[contains(text(),'Search Hotel ')]"));
	String text = tex1.getText();
	System.out.println(text);
	
	WebElement loc = Dri.findElement(By.id("location"));
	
	Select sele = new Select(loc);
	
	sele.selectByValue("Brisbane");
	
	WebElement hot = Dri.findElement(By.id("hotels"));
	
	Select hotse = new Select(hot);
	
	hotse.selectByValue("Hotel Sunshine");
	
	WebElement rtp = Dri.findElement(By.id("room_type"));
	
	Select rttp = new Select(rtp);
	rttp.selectByValue("Super Deluxe");
	
	WebElement child = Dri.findElement(By.id("child_room"));
	
	Select Chil = new Select(child);
	Chil.selectByValue("1");
	
	Dri.findElement(By.id("Submit")).click();
	
	WebElement tex2 = Dri.findElement(By.xpath("//td[contains(text(),'Select Hotel' )]"));
	String text2 = tex2.getText();
	System.out.println(text2);

	Dri.findElement(By.id("radiobutton_0")).click();
	Dri.findElement(By.id("continue")).click();
	
	WebElement tex3 = Dri.findElement(By.xpath("//td[contains(text(),'Book A Hotel ' )]"));
	String text3 = tex3.getText();
	System.out.println(text3);
	
	Dri.findElement(By.id("first_name")).sendKeys("Suresh");
	Dri.findElement(By.id("last_name")).sendKeys("Balaji");
	Dri.findElement(By.id("address")).sendKeys("Thoraipakam,Chennai-600097,TamilNadu");
	Dri.findElement(By.id("cc_num")).sendKeys("1234567891020306");
	
	WebElement card = Dri.findElement(By.id("cc_type"));
	Select cardt = new Select(card);
	cardt.selectByValue("VISA");
	
	WebElement expm = Dri.findElement(By.id("cc_exp_month"));
	
	Select Expmm = new Select(expm);
	Expmm.selectByValue("12");
	
	WebElement Expy = Dri.findElement(By.id("cc_exp_year"));
	Select Expyy = new Select(Expy);
	Expyy.selectByValue("2022");
	
	Dri.findElement(By.id("cc_cvv")).sendKeys("998585");
	Dri.findElement(By.id("book_now")).click();
	
	Thread.sleep(5000);
	
	WebElement tex4 = Dri.findElement(By.xpath("//td[text()='Booking Confirmation ']"));
	String text4 = tex4.getText();
	System.out.println(text4);
	
	WebElement con = Dri.findElement(By.xpath("//input[@name='order_no']"));
	String att = con.getAttribute("value");
	System.out.println(att);
	
	Dri.findElement(By.id("my_itinerary")).click();
	Dri.findElement(By.id("order_id_text")).sendKeys("458N87KAIE");
	Dri.findElement(By.id("search_hotel_id")).click();
	Dri.findElement(By.id("check_all")).click();
	Thread.sleep(1000);
	WebElement total = Dri.findElement(By.id("total_price_814688"));
	String text5 = total.getText();
	System.out.println(text5);
	}
	

}
