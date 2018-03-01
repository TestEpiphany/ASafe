package A_SafePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class A_SafeClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.asafe.com/en-gb/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[1]/a")).click();//Why-A-Safe
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[2]/a")).click();//Industry Solutions
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[4]/a")).click();//Services
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[5]/a")).click();//Resources
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[6]/a")).click();//Code of Practice
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/form/input")).sendKeys("Products");
		
		driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/div/a/img")).click();       //Logo to return to the home page/landing page
		driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div[4]/a[2]/div/p")).click();  //Products
		//driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div[4]/a[1]/div/p")).click();  //Enquire
		driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/div/a/img")).click();       //Logo to return to the home page/landing page
		Thread.sleep(3000);	
		
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(we).build().perform();
	
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //Product Categories Dropdown  
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Range Dropdown
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //Product Range Dropdowns
		
		
		Thread.sleep(1000);
		//Products
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[1]/a")).click();	//Pedestrian Barriers   
		
		//Actions action = new Actions(driver);
		
		WebElement trafficBarriers = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(trafficBarriers).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[2]/a")).click(); //Traffic Barriers	
		
		WebElement trafficBarriers2 = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(trafficBarriers2).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown  
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[3]/a")).click(); //Traffic Barriers+	
		

		WebElement highLevel= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(highLevel).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown  
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[4]/a")).click(); //High Level Barriers
		
		
		WebElement Kerb= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(Kerb).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown  
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[5]/a")).click(); //Kerb Barriers
		
		
		WebElement gates= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(gates).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown  
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[6]/a")).click(); //Gates
		
		WebElement column= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(column).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown  
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[7]/a")).click(); //Column Guards
		
		WebElement bollards= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(bollards).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown  
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[8]/a")).click(); //Bollards
		
		WebElement heightRestrictors= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(heightRestrictors).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[9]/a")).click(); //Height Restrictors
		
		WebElement rackEnd= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(rackEnd).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[11]/a")).click(); //RackEnd Barriers
		
		WebElement rackLeg= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(rackLeg).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[12]/a")).click(); //Rack Leg Protectors
		
		WebElement rackEye= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(rackEye).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul[1]/li[13]/a")).click(); //RackEye
		
		WebElement sliderPlates= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(sliderPlates).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[1]/li[14]/a")).click(); //Slider Plates
		
		WebElement wallGuards= driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(wallGuards).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[1]/li[15]/a")).click(); //Wall Guards
		
		WebElement safetySigns = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(safetySigns).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[1]/li[16]/a")).click(); //Safety Signs
		
		WebElement dockBuffers = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(dockBuffers).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[1]/li[17]/a")).click(); //Dock Buffers

		
		WebElement trailerPlates = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(trailerPlates).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[1]/li[18]/a")).click(); //Trailer Plates

	
		WebElement wheelStops = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
		action.moveToElement(wheelStops).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[1]/span")).click(); //List Product Categories Dropdown 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[1]/li[19]/a")).click(); //Wheel Stops
		
			
		//CONTACT PAGE
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[7]/a")).click();//CONTACTS fORM
		driver.findElement(By.xpath("//*[@id=\"f6718dda-0e45-48f9-bf8f-ecfe8a500a9e\"]")).sendKeys("Emman");//First Name
		driver.findElement(By.xpath("//*[@id=\"41a3ec9d-738c-4f6d-848e-68f20866e63c\"]")).sendKeys("Dele");//Last Name
		driver.findElement(By.xpath("//*[@id=\"c9204231-7756-4e10-cb50-60870fb4bb73\"]")).sendKeys("ayo0000@epiph.co.uk");//Email Address
		driver.findElement(By.xpath("//*[@id=\"1e714552-8fc8-4dd2-b9ca-1999542ddf89\"]")).sendKeys("078653425809");//Telephone Number
		driver.findElement(By.xpath("//*[@id=\"eb8a378f-3c7b-4ff3-d79f-95ebcdffa32c\"]")).sendKeys("078653425809");//company Name
		driver.findElement(By.xpath("//*[@id=\"d69e4ea5-4957-4b27-f572-cae872e2dc75\"]")).sendKeys("078653425809");//Reason for Contact
		driver.findElement(By.xpath("//*[@id=\"88a3f9c4-4132-47dd-be41-40020d3fbafd\"]")).click();//Opt-in to our newsletter
		driver.findElement(By.xpath("//*[@id=\"88a3f9c4-4132-47dd-be41-40020d3fbafd\"]")).click();//Opt-OUT to our newsletter
		driver.findElement(By.xpath("//*[@id=\"88a3f9c4-4132-47dd-be41-40020d3fbafd\"]")).click();//Opt-in to our newsletter
		driver.findElement(By.xpath("//*[@id=\"contour_form_117222ac46534ff89a83bdac9e19fc14\"]/form/div/div[2]/div/div/input")).click();
		
		
		 System.out.println("----------------------------------------------------------------");
		 System.out.println("Site test....Success"); 
	
		//driver.close();	
		
           	//PRODUCT APPLICATION
		 
		    WebElement pedestrianSegregation = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(pedestrianSegregation).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[1]/a")).click(); //Pedestrian Segregation 
			
			WebElement trafficSegregation = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(trafficSegregation).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[2]/a")).click();
			
			
			WebElement trafficPedestrian = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(trafficPedestrian).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[3]/a")).click();//Traffic & Pedestrian Segregation
			
			
			
			WebElement highLevelTopple = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(highLevelTopple).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[4]/a")).click();//High Level & Topple Protection
			
			
						
			WebElement buildingEquipment = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(buildingEquipment).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[5]/a")).click();//Building & Equipment Protection
			
			
			WebElement corridorWall = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(corridorWall).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[6]/a")).click();//Corridor & Wall Protection
			
			
			WebElement columnProtection = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(columnProtection).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[7]/a")).click();//Column Protection
			
			WebElement industrialDoor = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(industrialDoor).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[8]/a")).click();//Industrial Door Protection
			
			
			WebElement carPark = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(carPark).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[9]/a")).click();//Car Park Protection
			
			
			WebElement rackingStorage = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(rackingStorage).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[10]/a")).click();//Racking & Storage Protection			
			

			WebElement rackingDamage = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));
			action.moveToElement(rackingDamage).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[11]/a")).click();//Racking Damage Detection
			
			
			WebElement serviceYardDock = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));			
			action.moveToElement(serviceYardDock).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[12]/a")).click();//Service Yard & Dock Protection
			
			
			WebElement airportMast = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));			
			action.moveToElement(airportMast).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[13]/a")).click();//Airport Mast & Floodlight Column Protection
			
			
			WebElement airportFEGP = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
			action.moveToElement(airportFEGP).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[14]/a")).click();//Airport FEGP, Crocodile & Stand Guidance Protection
			
			
			WebElement airportEquipment = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
			action.moveToElement(airportEquipment).build().perform();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul/li[2]/span")).click(); //Product Applications Dropdown
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[2]/li[15]/a")).click();//Airport Equipment & Baggage Conveyor Protection			
			
			
			 System.out.println("----------------------------------------------------------------");
			 System.out.println("PRODUCT APPLICATION PAGES....Success"); 
			 
			 
		
		    ///Why A-Safe CTAs
	     	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[1]/a")).click();//Why-A-Safe
	  
			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/a[1]/div/p")).click();//Video Library
			driver.navigate().back();
			
			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/a[2]/div/p")).click();//Video Library
			driver.navigate().back();		
		
			driver.findElement(By.xpath("/html/body/div[1]/section[5]/div[2]/div/div[4]/a/div/p")).click();//Experience Our Innovation/ Watch
			driver.navigate().back();
			
			driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div[2]/div/div/div/div[4]/a/div/p")).click();//EThe Future of Safety Technology/ Meet RackEye
			driver.navigate().back();
			
			
			 System.out.println("----------------------------------------------------------------");
			 System.out.println("Why A Safe page test....Success"); 
			
			
				//PRODUCT BRANDS
			 
			    WebElement atlas = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(atlas).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[1]/a")).click();// Atlas
				
				
				WebElement iFlex = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(iFlex).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[2]/a")).click();// iFlex
				
				
				WebElement eFlex = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(eFlex).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[3]/a")).click();// eFlex
				
				
				WebElement mFlex = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(mFlex).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[4]/a")).click();// mFlex
				
				
				WebElement forkGuard = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(forkGuard).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[5]/a")).click();// ForkGuard
				
				
				WebElement rackGuard = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(rackGuard).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[6]/a")).click();// RackGuard
				
				
				WebElement rackEye2 = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div/ul/li[3]/a"));					
				action.moveToElement(rackEye2).build().perform();
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/span")).click(); //Product Brands Dropdown
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/ul[3]/li[7]/a")).click();// RackEye
				
				
				System.out.println("----------------------------------------------------------------");
			    System.out.println("PRODUCT Brands PAGES....Success"); 
				
				
				
			
		
	         driver.close();
		
		

	}

}
