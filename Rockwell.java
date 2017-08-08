package FinalScript;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rockwell {
	WebDriver driver;
	static int row_count = 0;
	String [] level_text = new String[5];
	@AfterTest
	public void test()
	{
		
		String  TRC_PART_NUMBER = "'data.csv'!$T$2";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 4, TRC_PART_NUMBER);
		String Level1ProductId = "INDEX('[data.csv]data'!$C$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 9, Level1ProductId);
		String L1Type = "INDEX('[data.csv]data'!$D$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 10, L1Type);
		String Level2ProductId = "INDEX('[data.csv]data'!$E$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 11, Level2ProductId);
		String L2Type = "INDEX('[data.csv]data'!$F$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 12, L2Type);
		String Level3ProductId = "INDEX('[data.csv]data'!$G$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 13, Level3ProductId);
		String  L3Type = "INDEX('[data.csv]data'!$H$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 14, L3Type);
		String  Level4ProductId= "INDEX('[data.csv]data'!$I$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 15, Level4ProductId);
		String  L4Type= "INDEX('[data.csv]data'!$J$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 16, L4Type);
		String  Level5ProductId= "INDEX('[data.csv]data'!$K$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 17, Level5ProductId);
		String  L5Type= "INDEX('[data.csv]data'!$L$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 18, L5Type);
		String FriendlyURL = "INDEX('[data.csv]data'!$M$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 19, FriendlyURL);
		String  NavigationText= "INDEX('[data.csv]data'!$N$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 20, NavigationText);
		String PageHeading= "INDEX('[data.csv]data'!$O$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 21, PageHeading);
		String  SubcatListingimage= "INDEX('[data.csv]data'!$P$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 22, SubcatListingimage);
		String  ShortDescriptionImage= "INDEX('[data.csv]data'!$Q$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 23, ShortDescriptionImage);
		String  OverviewTabImage= "INDEX('[data.csv]data'!$R$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 24, OverviewTabImage);
		String  ProductDescription= "INDEX('[data.csv]data'!$S$2,MATCH(E2,'[data.csv]data'!$T$2,0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 25, ProductDescription);
		
		
	}
	@BeforeTest
	public void configuration()
	{
		FileOutputStream fileOut1=null;
		FileOutputStream fileOut2=null;
		try{
			 
    		File file = new File(".\\output\\data.csv");
    		File file1 = new File(".\\output\\Final.xlsx");
    		file.delete();
    		file1.delete();
    	}catch(Exception e){
 
    		e.printStackTrace();
    	}
		
		
		
		try {
				fileOut1 = new FileOutputStream(".\\output\\data.csv");
//				File f = new File(".\\output\\Final.xlsx");
//				f.createNewFile();
				Workbook wb = new XSSFWorkbook();
			    FileOutputStream fileOut = new FileOutputStream(".\\output\\Final.xlsx");
			    Sheet sheet1 = wb.createSheet("Sheet1");
			    Row row = sheet1.createRow((short)0);
			    for(int i=0;i<26;i++)
			    {
			    	Cell c = row.createCell(i);
			    }
			    wb.write(fileOut);
			    fileOut.close();
//				  Workbook wb = new HSSFWorkbook();
//			    FileOutputStream fileOut = new FileOutputStream(".\\output\\Final.xlsx",true);
//			    
//			    wb.write(fileOut);
//			    fileOut.close();
//			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writeToCsv("Status", false);
		writeToCsv("Pri/ Sec", false);
		writeToCsv("Level 1 Product Id", false);
		writeToCsv("L1 Type", false);
		writeToCsv("Level 2 Product Id", false);
		writeToCsv("L2 Type", false);
		writeToCsv("Level 3 Product Id", false);
		writeToCsv("L3 Type", false);
		writeToCsv("Level 4 Product Id", false);
		writeToCsv("L4 Type", false);
		writeToCsv("Level 5 Product Id", false);
		writeToCsv("L5 Type", false);
		writeToCsv("Friendly URL", false);
		writeToCsv("Navigation Text", false);
		writeToCsv("Page Heading", false);
		writeToCsv("Subcat Listing image", false);
		writeToCsv("Short Description Image", false);
		writeToCsv("Overview Tab Image", false);
		writeToCsv("Product Description", false);
		writeToCsv("Product Catalog Number", true);
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 0, "TRC_PART_NUMBER");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 1, "MANUFACTURER_NAME");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 2, "BRAND_NAME");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 3, "UPC");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 4, "MANUFACTURER_PART_NUMBER");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 5, "UNSPSC");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 6, "ACTIVE(Active='Y' InActive='N' Planned Obsolescence='P' Obsolete='O' Item Alert='T' Unlisted='U' Non-price Maintained='K' Withdrawn='W' Pending To Delete='X')");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 7, "DISPLAY_ONLINE");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 8, "ORIG_SORT");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 9, "Level 1 Product Id");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 10, "L1 Type");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 11, "Level 2 Product Id");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 12, "L2 Type");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 13, "Level 3 Product Id");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 14, "L3 Type");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 15, "Level 4 Product Id");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 16, "L4 Type");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 17, "Level 5 Product Id");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 18, "L5 Type");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 19, "Friendly URL");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 20, "Navigation Text");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 21, "Page Heading");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 22, "Subcat Listing image");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 23, "Short Description Image");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 24, "Overview Tab Image");
		writeExcel(".\\output\\Final.xlsx", "Sheet1", 0, 25, "Product Description");
		String sheetName = getExcelData(".\\configuration\\congif.xlsx", "config", 1, 2);
		int rowStartNo = getExcelNumericData(".\\configuration\\congif.xlsx", "config", 2, 2);
		int rowEndNo = getExcelNumericData(".\\configuration\\congif.xlsx", "config", 3, 2);
		String  TRC_PART_NUMBER = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$A$"+rowStartNo+":$A$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 0, TRC_PART_NUMBER);
		String  MANUFACTURER_NAME = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$B$"+rowStartNo+":$B$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 1, MANUFACTURER_NAME);
		String  BRAND_NAME = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$C$"+rowStartNo+":$C$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 2, BRAND_NAME);
		String  UPC = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$D$"+rowStartNo+":$D$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 3, UPC);
		String  UNSPSC = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$F$"+rowStartNo+":$F$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 5, UNSPSC);
		String  ACTIVE = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$G$"+rowStartNo+":$G$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 6, ACTIVE);
		String  DISPLAY_ONLINE = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$H$"+rowStartNo+":$H$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 7, DISPLAY_ONLINE);
		String  ORIG_SORT = "INDEX('[distributorInputFile.xlsx]"+sheetName+"'!$I$"+rowStartNo+":$I$"+rowEndNo+",MATCH(E2,'[distributorInputFile.xlsx]"+sheetName+"'!$E$"+rowStartNo+":$E$"+rowEndNo+",0))";
		
		writeExcelData(".\\output\\Final.xlsx", "Sheet1", 1, 8, ORIG_SORT);
		
		
	}
	public static void writeExcel(String filePath, String sheetName, int rowNo, int cellNo, String data)
	{
		try
		{			
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			if(r==null){
				r = st.createRow(rowNo);
			}			
			Cell c = r.createCell(cellNo);
			c.setCellType(Cell.CELL_TYPE_STRING);
			c.setCellValue(data);
			//CellStyle cs = wb.createCellStyle();			
			//c.setCellValue(data);			
			FileOutputStream fileOut = new FileOutputStream(filePath);
			wb.write(fileOut);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
	public static void writeExcelData(String filePath, String sheetName, int rowNo, int cellNo, String data)
	{
		try
		{			
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			if(r==null){
				r = st.createRow(rowNo);
			}			
			Cell c = r.createCell(cellNo);
			c.setCellType(Cell.CELL_TYPE_FORMULA);
			c.setCellFormula(data);
			//CellStyle cs = wb.createCellStyle();			
			//c.setCellValue(data);			
			FileOutputStream fileOut = new FileOutputStream(filePath);
			wb.write(fileOut);
			//evalExcelData(filePath, sheetName, rowNo, cellNo);
			//XSSFFormulaEvaluator.evaluateAllFormulaCells((XSSFWorkbook) wb);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
	public static int getExcelNumericData(String filePath, String sheetName, int rowNo, int cellNo)
	{
		
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			Cell c = r.getCell(cellNo);
			int data = (int)c.getNumericCellValue();
			return data;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	public static String getExcelData(String filePath, String sheetName, int rowNo, int cellNo)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			Cell c = r.getCell(cellNo);
			String data = c.getStringCellValue();
			return data;
		}
		catch(Exception e)
		{
			return " ";
		}
	}
	public static void evalExcelData(String filePath, String sheetName, int rowNo, int cellNo)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			Cell c = r.getCell(cellNo);
			CreationHelper createHelper = wb.getCreationHelper();
			
			createHelper.createFormulaEvaluator().evaluateAll();
			//createHelper.createFormulaEvaluator().evaluateInCell(c);
			//String data = c.getStringCellValue();
			//return data;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://ab.rockwellautomation.com/allenbradley/productdirectory.page?");
		//driver.findElement(By.linkText("Products")).click();
//		waitDynamicallyforelement(driver, driver.findElement(By.linkText("Product Directory")));
//		driver.findElement(By.linkText("Product Directory")).click();
	}
	 static void waitDynamicallyforelement(WebDriver driver, WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	 static void waitDynamicallyforelements(WebDriver driver, List<WebElement> element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
		}
	 @Test
	 public void productContent()
		{
			launchApp();
			String product_content=null;
			String fall_back = driver.getCurrentUrl();
			System.out.println(fall_back);
			List<WebElement> element1 = driver.findElements(By.xpath("//div[@id='productdirectory']//h3/a"));
			try
			{
				for(int i=1;i<=element1.size();i++)
				{
					String st1 = "(//div[@id='productdirectory']//h3/a)["+i+"]";
					try{
							WebElement ele = driver.findElement(By.xpath(st1));
							level_text[0] = ele.getText();
							System.out.println(level_text[0]);
							logGenerator(level_text[0]);
							ele.click();
							level_one();
							driver.get(fall_back);
						}
					catch(Exception e)
					{
						logGenerator("-----------------------------Started-----------------------------------------------");
						logGenerator(driver.getCurrentUrl());
						StackTraceElement[] x = e.getStackTrace();
						for(StackTraceElement stackTrace:x){
							if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
								logGenerator(level_text[0]);
								logGenerator("In class: "+stackTrace.getClassName());
								logGenerator("at line number: "+stackTrace.getLineNumber());
							}															
						}
						logGenerator("-----------------------------Ended-------------------------------------------------");					
					}
							level_text[0]=null;
							
				}
			}
			catch(Exception e)
			{
				logGenerator("-----------------------------Started-----------------------------------------------");
				logGenerator(driver.getCurrentUrl());
				StackTraceElement[] x = e.getStackTrace();
				for(StackTraceElement stackTrace:x){
					if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
						logGenerator(level_text[0]);
						logGenerator("In class: "+stackTrace.getClassName());
						logGenerator("at line number: "+stackTrace.getLineNumber());
					}	
				}
				logGenerator("-----------------------------Ended-------------------------------------------------");	
			}
		}
	 public void level_one()
		{			
		 	String fall_back = null;
			String l0_text = null;
		 	try
			{
		 		Thread.sleep(2000);
		 		fall_back = driver.getCurrentUrl();
				List<WebElement> li1 = driver.findElements(By.xpath("//div[@id='catsubcatcontent']"));
				Thread.sleep(1000);
				for(int k=1;k<=li1.size();k++)
				{
					String str1 = "(//div[@id='catsubcatcontent'])["+k+"]//a";
					List<WebElement> ele = driver.findElements(By.xpath(str1));
					if(ele.size()>2)
					{
							String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
							try{
									WebElement element1 = driver.findElement(By.xpath(str2));
									level_text[1] = element1.getText();
									logGenerator("--"+level_text[1]);
									System.out.println("--"+level_text[1]);
									element1.click();									
									level_two();
									driver.get(fall_back);
							}
							catch(Exception e)
							{
								logGenerator("-----------------------------Started-----------------------------------------------");
								logGenerator(driver.getCurrentUrl());
								StackTraceElement[] x = e.getStackTrace();
								for(StackTraceElement stackTrace:x){
									if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
										logGenerator(level_text[1]);
										logGenerator("In class: "+stackTrace.getClassName());
										logGenerator("at line number: "+stackTrace.getLineNumber());
									}	
								}
								logGenerator("-----------------------------Ended-------------------------------------------------");	
							}
							level_text[1]=null;
					}
					else
					{
						String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
						try{
								WebElement element1 = driver.findElement(By.xpath(str2));
								level_text[1] = element1.getText();
								System.out.println("--"+level_text[1]);
								logGenerator("--"+level_text[1]);
								String link_text = element1.getText();
								String img_url = "(//div[@id='catsubcatcontent'])["+k+"]//a/img";
								String sub_img_src = driver.findElement(By.xpath(img_url)).getAttribute("src");
								element1.click();
								before_final(sub_img_src,link_text);
								driver.get(fall_back);
						}
						catch(Exception e)
						{
							logGenerator("-----------------------------Started-----------------------------------------------");
							logGenerator(driver.getCurrentUrl());
							StackTraceElement[] x = e.getStackTrace();
							for(StackTraceElement stackTrace:x){
								if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
									logGenerator(level_text[1]);
									logGenerator("In class: "+stackTrace.getClassName());
									logGenerator("at line number: "+stackTrace.getLineNumber());
								}	
							}
							logGenerator("-----------------------------Ended-------------------------------------------------");	
						}
						level_text[1]=null;
					}
				}
			}
		 	catch(Exception e)
			{
		 		logGenerator("-----------------------------Started-----------------------------------------------");
				logGenerator(driver.getCurrentUrl());
				StackTraceElement[] x = e.getStackTrace();
				for(StackTraceElement stackTrace:x){
					if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
						logGenerator(level_text[1]);
						logGenerator("In class: "+stackTrace.getClassName());
						logGenerator("at line number: "+stackTrace.getLineNumber());
					}	
				}
				logGenerator("-----------------------------Ended-------------------------------------------------");	
			}
		}
	 public void level_two()
		{			
		 	String fall_back = null;
			String l0_text = null;
		 	try
			{
		 		Thread.sleep(2000);
		 		fall_back = driver.getCurrentUrl();
				List<WebElement> li1 = driver.findElements(By.xpath("//div[@id='catsubcatcontent']"));
				Thread.sleep(1000);
				for(int k=1;k<=li1.size();k++)
				{
					String str1 = "(//div[@id='catsubcatcontent'])["+k+"]//a";
					List<WebElement> ele = driver.findElements(By.xpath(str1));
					if(ele.size()>2)
					{
							String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
							try{
									WebElement element1 = driver.findElement(By.xpath(str2));
									level_text[2] = element1.getText();
									logGenerator("----"+level_text[2]);
									System.out.println("----"+level_text[2]);
									element1.click();
									level_three();
									driver.get(fall_back);
							}
							catch(Exception e)
							{
								logGenerator("-----------------------------Started-----------------------------------------------");
								logGenerator(driver.getCurrentUrl());
								StackTraceElement[] x = e.getStackTrace();
								for(StackTraceElement stackTrace:x){
									if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
										logGenerator(level_text[2]);
										logGenerator("In class: "+stackTrace.getClassName());
										logGenerator("at line number: "+stackTrace.getLineNumber());
									}	
								}
								logGenerator("-----------------------------Ended-------------------------------------------------");	
							}
							level_text[2]=null;
					}
					else
					{
						String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
						try{
								WebElement element1 = driver.findElement(By.xpath(str2));
								String _eleText = driver.findElement(By.xpath(str2)).getText();
								level_text[2] = element1.getText();
								logGenerator("----"+level_text[2]);
								System.out.println("----"+level_text[2]);
								String link_text = element1.getText();
								String img_url = "(//div[@id='catsubcatcontent'])["+k+"]//a/img";
								String sub_img_src = driver.findElement(By.xpath(img_url)).getAttribute("src");
								
								/// Summary
								// "Connected Components Workbench Software" is opening a new window
								// Checking for "Connected Components Workbench Software" link and skipping this.
								/// End Summary
								
								if(_eleText.equals("Connected Components Workbench Software"))
								{
									System.out.println("---- Skipped - Connected Components Workbench Software ");
								}
								else
								{
									element1.click();
								}	
								
								before_final(sub_img_src,link_text);
								driver.get(fall_back);
						}
						catch(Exception e)
						{
							logGenerator("-----------------------------Started-----------------------------------------------");
							logGenerator(driver.getCurrentUrl());
							StackTraceElement[] x = e.getStackTrace();
							for(StackTraceElement stackTrace:x){
								if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
									logGenerator(level_text[2]);
									logGenerator("In class: "+stackTrace.getClassName());
									logGenerator("at line number: "+stackTrace.getLineNumber());
								}	
							}
							logGenerator("-----------------------------Ended-------------------------------------------------");	
						}
						level_text[2]=null;
					}
				}
			}
			catch(Exception e)
			{
				logGenerator("-----------------------------Started-----------------------------------------------");
				logGenerator(driver.getCurrentUrl());
				StackTraceElement[] x = e.getStackTrace();
				for(StackTraceElement stackTrace:x){
					if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
						logGenerator(level_text[2]);
						logGenerator("In class: "+stackTrace.getClassName());
						logGenerator("at line number: "+stackTrace.getLineNumber());
					}	
				}
				logGenerator("-----------------------------Ended-------------------------------------------------");	
			}
			
		}
	 public void level_three()
		{					 	
		 	String fall_back = null;
			String l0_text = null;
			String link_text="";
			String sub_img_src = "";
		 	try
			{
		 		Thread.sleep(2000);
		 		fall_back = driver.getCurrentUrl();
				List<WebElement> li1 = driver.findElements(By.xpath("//div[@id='catsubcatcontent']"));
				Thread.sleep(1000);
				if(li1.size()>0)
				{			
					for(int k=1;k<=li1.size();k++)
						{
							String str1 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
							List<WebElement> ele = driver.findElements(By.xpath(str1));
							if(ele.size()>1)
							{									
								String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
									try{
											WebElement element1 = driver.findElement(By.xpath(str2));
											level_text[3] = element1.getText();
											logGenerator("------"+level_text[3]);
											System.out.println("------"+level_text[3]);
											element1.click();
											level_four();
											driver.get(fall_back);
									}
									catch(Exception e)
									{
										logGenerator("-----------------------------Started-----------------------------------------------");
										logGenerator(driver.getCurrentUrl());
										StackTraceElement[] x = e.getStackTrace();
										for(StackTraceElement stackTrace:x){
											if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
												logGenerator(level_text[3]);
												logGenerator("In class: "+stackTrace.getClassName());
												logGenerator("at line number: "+stackTrace.getLineNumber());
											}	
										}
										logGenerator("-----------------------------Ended-------------------------------------------------");	
									}
									level_text[3]=null;
							}
							else
							{								
								String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
								try{
									WebElement element1 = driver.findElement(By.xpath(str2));
									level_text[3] = element1.getText();
									logGenerator("------"+level_text[3]);
									System.out.println("------"+level_text[3]);
									link_text = element1.getText();
									String img_url = "(//div[@id='catsubcatcontent'])["+k+"]//a/img";
									sub_img_src = driver.findElement(By.xpath(img_url)).getAttribute("src");
									element1.click();
									before_final(sub_img_src,link_text);
									driver.get(fall_back);
								}
								catch(Exception e)
								{
									logGenerator("-----------------------------Started-----------------------------------------------");
									logGenerator(driver.getCurrentUrl());
									StackTraceElement[] x = e.getStackTrace();
									for(StackTraceElement stackTrace:x){
										if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
											logGenerator(level_text[3]);
											logGenerator("In class: "+stackTrace.getClassName());
											logGenerator("at line number: "+stackTrace.getLineNumber());
										}	
									}
									logGenerator("-----------------------------Ended-------------------------------------------------");	
								}
								level_text[3]=null;
							}
						}
				}
				else
				{					
					try{
							driver.findElement(By.cssSelector("#products")).click();
							driver.findElement(By.cssSelector("#products")).click();
							driver.findElement(By.cssSelector("#products")).click();
					}
					catch(Exception e)
					{
						logGenerator("-----------------------------Started-----------------------------------------------");
						logGenerator(driver.getCurrentUrl());
						StackTraceElement[] x = e.getStackTrace();
						for(StackTraceElement stackTrace:x){
							if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
								logGenerator(level_text[3]);
								logGenerator("In class: "+stackTrace.getClassName());
								logGenerator("at line number: "+stackTrace.getLineNumber());
							}	
						}
						logGenerator("-----------------------------Ended-------------------------------------------------");	
					}
					List<WebElement> li2=driver.findElements(By.xpath("//div[@id='products']//a"));
					fall_back = driver.getCurrentUrl();
					for(int i=1;i<=li2.size();i++)
					{
						String str10 = "(//div[@id='products']//a)["+i+"]";
						try{
								WebElement element = driver.findElement(By.xpath(str10));
								level_text[3] = element.getText();
								logGenerator("------"+level_text[3]);
								System.out.println("------"+level_text[3]);
								link_text = element.getText();
								element.click();
								before_final(sub_img_src,link_text);
								driver.get(fall_back);
						}
						catch(Exception e)
						{
							logGenerator("-----------------------------Started-----------------------------------------------");
							logGenerator(driver.getCurrentUrl());
							StackTraceElement[] x = e.getStackTrace();
							for(StackTraceElement stackTrace:x){
								if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
									logGenerator(level_text[3]);
									logGenerator("In class: "+stackTrace.getClassName());
									logGenerator("at line number: "+stackTrace.getLineNumber());
								}	
							}
							logGenerator("-----------------------------Ended-------------------------------------------------");	
						}
						level_text[3]=null;
					}
				}
			}
			catch(Exception e)
			{
				logGenerator("-----------------------------Started-----------------------------------------------");
				logGenerator(driver.getCurrentUrl());
				StackTraceElement[] x = e.getStackTrace();
				for(StackTraceElement stackTrace:x){
					if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
						logGenerator(level_text[3]);
						logGenerator("In class: "+stackTrace.getClassName());
						logGenerator("at line number: "+stackTrace.getLineNumber());
					}	
				}
				logGenerator("-----------------------------Ended-------------------------------------------------");	
			}
		}
	 public void level_four()
		{
		 	try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}		 	
		 	String fall_back = null;
			String l0_text = null;
		 	try
			{
		 		fall_back = driver.getCurrentUrl();
				List<WebElement> li1 = driver.findElements(By.xpath("//div[@id='catsubcatcontent']"));
				Thread.sleep(1000);
				for(int k=1;k<=li1.size();k++)
				{
					String str1 = "(//div[@id='catsubcatcontent'])["+k+"]//a";
					List<WebElement> ele = driver.findElements(By.xpath(str1));
					String str2 = "(//div[@id='catsubcatcontent'])["+k+"]//h4/a";
					try{
							WebElement element1 = driver.findElement(By.xpath(str2));
							level_text[4] = element1.getText();
							logGenerator("--------"+level_text[4]);
							System.out.println("--------"+level_text[4]);
							String link_text = element1.getText();
							String img_url = "(//div[@id='catsubcatcontent'])["+k+"]//a/img";
							String sub_img_src = driver.findElement(By.xpath(img_url)).getAttribute("src");
							element1.click();
							before_final(sub_img_src,link_text);
							driver.get(fall_back);
					}
					catch(Exception e)
					{
						logGenerator("-----------------------------Started-----------------------------------------------");
						logGenerator(driver.getCurrentUrl());
						StackTraceElement[] x = e.getStackTrace();
						for(StackTraceElement stackTrace:x){
							if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
								logGenerator(level_text[4]);
								logGenerator("In class: "+stackTrace.getClassName());
								logGenerator("at line number: "+stackTrace.getLineNumber());
							}	
						}
						logGenerator("-----------------------------Ended-------------------------------------------------");	
					}
					level_text[4]=null;
				}
			}
		 	catch(Exception e)
			{
		 		logGenerator("-----------------------------Started-----------------------------------------------");
				logGenerator(driver.getCurrentUrl());
				StackTraceElement[] x = e.getStackTrace();
				for(StackTraceElement stackTrace:x){
					if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
						logGenerator(level_text[4]);
						logGenerator("In class: "+stackTrace.getClassName());
						logGenerator("at line number: "+stackTrace.getLineNumber());
					}	
				}
				logGenerator("-----------------------------Ended-------------------------------------------------");	
			}
		}
	 public void before_final(String sub_img_src, String link_text)
		{
		 	try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}		 	
		 	String page_disp_name="";
		 	String image1="";
		 	String image2="";
		 	String str_url="";
			try{
				page_disp_name =driver.findElement(By.xpath("//div[@id='content-intro']//h1")).getText();
				image1 = driver.findElement(By.cssSelector("#content-intro img.img-responsive")).getAttribute("src");
				//image2 = driver.findElement(By.xpath("//div[@id='large-image']/img")).getAttribute("src");
				str_url = driver.getCurrentUrl();
				//driver.get(str_url);
				try{
					if(driver.findElements(By.xpath("//li[@id='selection']")).size()>0)
					{
						try
						{
							driver.findElement(By.xpath("//li[@id='selection']")).click();
							Thread.sleep(2000);
						}
						catch(Exception e)
						{
							logGenerator("-----------------------------Started-----------------------------------------------");
							logGenerator(driver.getCurrentUrl());
							StackTraceElement[] x = e.getStackTrace();
							for(StackTraceElement stackTrace:x){
								if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
									logGenerator(link_text);
									logGenerator("In class: "+stackTrace.getClassName());
									logGenerator("at line number: "+stackTrace.getLineNumber());
								}	
							}
							logGenerator("-----------------------------Ended-------------------------------------------------");	
						}						
						try {
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
							driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='selection']//iframe")));
							if(driver.findElements(By.xpath("//h2[contains(text(),'Product Selection site is down')]")).size()>0){
								driver.get(driver.getCurrentUrl());
								Thread.sleep(5000);
							}
							try
							{
								if(driver.findElement(By.id("theHeader")).isDisplayed())
								{
									List<WebElement> li1 = driver.findElements(By.xpath("//ul[@id='simpleUl']/li"));
									for(int l=1;l<=li1.size();l++)
									{
										int a=8;
										int count=2;
										if(l==a)
										{
											String str = "(//ul[@class='mSPages']/li)["+count+"]";
											driver.findElement(By.xpath(str)).click();
											count++;
											a=+7;
										}
										String str5 ="(//ul[@id='simpleUl']/li)["+l+"]";
										driver.findElement(By.xpath(str5)).click();
										final_level(page_disp_name,image1,str_url,link_text,sub_img_src);
									}
									
									driver.switchTo().defaultContent();
								}
								else
								{
									final_level(page_disp_name,image1,str_url,link_text,sub_img_src);
									driver.switchTo().defaultContent();
								}
							}
							catch(Exception e)
							{
								logGenerator("-----------------------------Started-----------------------------------------------");
								logGenerator(driver.getCurrentUrl());
								StackTraceElement[] x = e.getStackTrace();
								for(StackTraceElement stackTrace:x){
									if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
										logGenerator(link_text);
										logGenerator("In class: "+stackTrace.getClassName());
										logGenerator("at line number: "+stackTrace.getLineNumber());
									}	
								}
								logGenerator("-----------------------------Ended-------------------------------------------------");	
							}
						} catch (Exception e) {							
							if(driver.findElements(By.xpath("//a[@title='Use the Product Configuration Assistant']")).size()>0){
								logGenerator("Product Configuration Assistant is displayed. Product catalog not displayed");
							}
							driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						}																							
					}
					else
					{
						final_level(page_disp_name,image1,str_url,link_text,sub_img_src);
					}
				}
				catch(Exception e)
				{
					logGenerator("-----------------------------Started-----------------------------------------------");
					logGenerator(driver.getCurrentUrl());
					StackTraceElement[] x = e.getStackTrace();
					for(StackTraceElement stackTrace:x){
						if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
							logGenerator(link_text);
							logGenerator("In class: "+stackTrace.getClassName());
							logGenerator("at line number: "+stackTrace.getLineNumber());
						}	
					}
					logGenerator("-----------------------------Ended-------------------------------------------------");	
				}
		}
		catch(Exception e)
		{
			logGenerator("-----------------------------Started-----------------------------------------------");
			logGenerator(driver.getCurrentUrl());
			StackTraceElement[] x = e.getStackTrace();
			for(StackTraceElement stackTrace:x){
				if(stackTrace.getClassName().equals("FinalScript.Rockwell")){
					logGenerator(link_text);
					logGenerator("In class: "+stackTrace.getClassName());
					logGenerator("at line number: "+stackTrace.getLineNumber());
				}	
			}
			logGenerator("-----------------------------Ended-------------------------------------------------");	
		}
	}
	 void final_level(String page_disp_name, String image1, String str_url,String link_text, String sub_img_src)
		{
			try{
				int i= 0;
				//Thread.sleep(8000);
				WebElement catlogNum=driver.findElement(By.xpath("//span[text()='Catalog Number']"));
				waitDynamicallyforelement(driver,catlogNum );
				List<WebElement> product_id = driver.findElements(By.xpath("//div[@id='ProductsGrid']//a"));				
				do
				{				
					String path1 = "(//div[@id='ProductsGrid']//td[text()])["+(i+1)+"]";
					writeToCsv("PROD", false);
					writeToCsv("P", false);
					writeToCsv(level_text[0].replaceAll(",", "@@@@"), false);
					writeToCsv("C", false);
					writeToCsv(level_text[1].replaceAll(",", "@@@@"), false);
					if(level_text[4]==null)
					{
						if(level_text[3]==null)
						{
							if(level_text[2]==null)
							{
								writeToCsv("T", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
							}
							else
							{
								writeToCsv("SC", false);
								writeToCsv(level_text[2].replaceAll(",", "@@@@"), false);
								writeToCsv("T", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
								writeToCsv(" ", false);
							}
						}
					}
					if(level_text[4]==null)
					{
						if(level_text[3]==null)
						{
							
						}
						else
						{
							writeToCsv("SC", false);
							writeToCsv(level_text[2].replaceAll(",", "@@@@"), false);
							writeToCsv("SSC", false);
							writeToCsv(level_text[3].replaceAll(",", "@@@@"), false);
							writeToCsv("T", false);
							writeToCsv(" ", false);
							writeToCsv(" ", false);
						}
					}
					if(level_text[4]==null)
					{
					
					}
					else
					{	writeToCsv("SC", false);
						writeToCsv(level_text[2].replaceAll(",", "@@@@"), false);
						writeToCsv("SSC", false);
						writeToCsv(level_text[3].replaceAll(",", "@@@@"), false);
						writeToCsv("SSSC", false);
						writeToCsv(level_text[4].replaceAll(",", "@@@@"), false);
						writeToCsv("T", false);
					}
					writeToCsv(str_url.replaceFirst("http://ab.rockwellautomation.com", ""), false);
					writeToCsv(link_text.replaceAll(",", "@@@@"), false);
					writeToCsv(page_disp_name.replaceAll(",", "@@@@"), false);
					writeToCsv(sub_img_src.replaceFirst("http://ab.rockwellautomation.com", ""), false);
					writeToCsv(image1.replaceFirst("http://ab.rockwellautomation.com", ""), false);
					//writeToCsv(image2.replaceFirst("http://ab.rockwellautomation.com", ""), false);
					writeToCsv("",false);
					String str1 =  product_id.get(i).getText();
					String str3 = driver.findElement(By.xpath(path1)).getText();
					writeToCsv(str3.replaceAll(",", "@@@@"), false);
					writeToCsv(str1.replaceAll(",", "@@@@"), true);
					i++;
				}while(i<product_id.size());
				row_count=i;
			}
			catch(Exception e)
			{
				writeToCsv("", true);
			}
			}
		public void writeToCsv(String val, boolean finalVal){
			try {
				BufferedWriter b = new BufferedWriter(new FileWriter(new File(".\\output\\data.csv"),true));
				b.write(val+",");
				if(finalVal){
					b.write("\r\n");
				}
				b.close();		
			}
			catch (IOException e)
			{
				logGenerator(e.getMessage());
			}
		}
		public void logGenerator(String data)
		{
			try {
					FileWriter fileWrite = new FileWriter("./log.txt", true);
					BufferedWriter bw = new BufferedWriter(fileWrite);
					bw.write(data);
					bw.newLine();
					bw.close();
				
				
			} catch (IOException e) {
				
			}
									
		}
		
}
