package testcases;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import keys.Keywords;

public class CModeRecipeCreation {
	@Test
	public void cModeRecipeCreation()throws Exception {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		Keywords key = new Keywords();
		FileInputStream file = new FileInputStream("recipeCreationTests.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		Sheet s = workbook.getSheet("Sheet1");
		Sheet s = workbook.getSheet("cModeRecipeCreation");

		@SuppressWarnings("rawtypes")
		Iterator itr = s.iterator();	
		while(itr.hasNext()) {
			Row rowitr = (Row) itr.next();
			@SuppressWarnings("rawtypes")
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata = (Cell) cellitr.next();
				switch(celldata.getCellType()) {
				case NUMERIC:
					a.add(celldata.getNumericCellValue());
					break;
				case STRING:
					a.add(celldata.getStringCellValue());
					break;
				case BOOLEAN:
					a.add(celldata.getBooleanCellValue());
					break;
				default:
					break;
				}
			}
		}
		System.out.println(a);

		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("openBrowser")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.openBrowser();
				}
			}
			if(a.get(i).equals("dropDown")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.dropDown(data, objectName);
				}
			}
			if(a.get(i).equals("unitDropDown")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.unitDropDown(data, objectName);
				}
			}
			if(a.get(i).equals("customBrowserWindow")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.customBrowserWindow();
				}
			}
			if(a.get(i).equals("filterDropDown")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.filterDropDown(data, objectName);
				}
			}



			if(a.get(i).equals("navigate")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.navigate(data);
				}
			}

			if(a.get(i).equals("intNavigation")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.intNavigation(data);
				}
			}

			if(a.get(i).equals("closeWindow")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.closeWindow();
				}
			}


			if(a.get(i).equals("modeDropDown")) {
				String keyword =(String) a.get(i);
				String data =   (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.modeDropDown(data,objectName);
				}
			}
			if(a.get(i).equals("pumpDropDown")) {
				String keyword =(String) a.get(i);
				String data =   (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.pumpDropDown(data,objectName);
				}
			}
			if(a.get(i).equals("auxPortDropDown")) {
				String keyword =(String) a.get(i);
				String data =   (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.auxPortDropDown(data,objectName);
				}
			}

			if(a.get(i).equals("click")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.click(objectName);
				}

			}
			if(a.get(i).equals("input")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.input(data,objectName);
				}
			}
			if(a.get(i).equals("input2")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.input(data,objectName);
				}
			}
			if(a.get(i).equals("radioButton")) {
				String keyword =(String) a.get(i);
				String data = (String) a.get(i+1);
				String objectName = (String) a.get(i+2);
				String runmode = (String) a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if(runmode.equals("yes")) {
					key.radioButton(objectName);
				}
			}


		}
	}

}
