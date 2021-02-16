package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;
import com.relevantcodes.extentreports.LogStatus;

import Test.BaseClass;

public class ReusableActions extends BaseClass{
	public void navigateToUrl(String sUrl) {
		driver.navigate().to(sUrl);
		test.log(LogStatus.PASS, "navigateToUrl", "navigated successfully to"+sUrl);
	}
	public void EnterText(String value, WebElement we) {
		we.sendKeys(value);
		test.log(LogStatus.PASS, "EnterText", "Value entered successfully"+value);
	}
	public void Clicking(WebElement we) {
		we.click();
		test.log(LogStatus.PASS, "Clicking", "button clicked successfully");

	}
	public void SelectOption(String value, WebElement we) {
		Select s = new Select(we);
		s.selectByVisibleText(value);
		test.log(LogStatus.PASS, "SelectOption", "Value Selected successfully"+value);
	}
	public void SelectOption(int index, WebElement we) {
		Select s = new Select(we);
		s.selectByIndex(index);
		test.log(LogStatus.PASS, "SelectOption", "Value with index Selected successfully"+index);
	}
	public void SelectOption(String value, WebElement we,String selectByValue) {
		Select s = new Select(we);
		s.selectByValue(value);
		test.log(LogStatus.PASS, "SelectOption", "Value with index Selected successfully"+value);
	}

	public void MultipleWinHandles() {
		String p=driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			String c=i.next();
			
			if(!p.equals(c)) {
				System.out.println(driver.switchTo().window(c).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(p);
	}
	public void navigations(String s) {

		if(s.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}
		else if(s.equalsIgnoreCase("forward")){
			driver.navigate().forward();
		}
		else if(s.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
		else {
			System.out.println("wrong input provided");
		}
	}
	public void moveTo(WebElement we) {
		Actions a=new Actions(driver);
		a.moveToElement(we).build().perform();
	}
	public void moveAndClick(WebElement we) {
		Actions a=new Actions(driver);
		a.moveToElement(we).click().build().perform();
	}
	
	public void rightClick(WebElement we) {
		Actions a=new Actions(driver);
		a.contextClick(we).perform();
	}
	public void doubleClick(WebElement we) {
		Actions a =new Actions(driver);
		a.doubleClick(we).perform();

	}
	public void dragging(WebElement s,WebElement d) {
		Actions a =new Actions(driver);
		a.dragAndDrop(s,d).build().perform();
	}

public void holdAndRlease(WebElement we) {
	Actions a =new Actions(driver);
	a.clickAndHold(we).build().perform();
	a.release(we).build().perform();
}
	public static void main(String ergs[]) throws InvalidFormatException, IOException {
		readExcel();
	}
	public static HashMap<String, HashMap> readExcel() throws InvalidFormatException, IOException {
		String Path="C:\\Users\\Bhavani\\eclipse-workspace\\HotelAdactinMaven\\src\\main\\resources\\HotelAdactin.xlsx";
		String sheetName="TestData";
		File file = new File(Path);
		
		HashMap<String, HashMap> hmExceldata= new HashMap<String, HashMap>();
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);  
		int index=wb.getSheetIndex(sheetName);
		XSSFSheet sheet=wb.getSheetAt(index);
		int row_count=sheet.getLastRowNum()+1;
		Row r1 = sheet.getRow(0);
		int col_count=r1.getLastCellNum();
		for(int i=1; i<row_count; i++) {
			Row row=sheet.getRow(i);
			HashMap<String, String> hmRowdata= new HashMap<String, String>();
			for(int j=1; j<col_count; j++) {
			
				org.apache.poi.ss.usermodel.Cell data= row.getCell(j);
				String data1="";
				try {
					data1=data.toString();
				}
				catch(Exception e) {
					
				}
				//System.out.println("value for row:"+ i + " and column :" + j+ " is :" +data.toString());
				hmRowdata.put(r1.getCell(j).toString(), data1);
			}
			hmExceldata.put(row.getCell(0).toString(), hmRowdata);
		}
		wb.close();
		System.out.println(hmExceldata);
		return hmExceldata;
	}
	
}

