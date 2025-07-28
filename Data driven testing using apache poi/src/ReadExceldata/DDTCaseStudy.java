package ReadExceldata; // Note: Package name is for Excel, but code uses CSV.

import java.io.FileReader; // Required import for reading files
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; // Using ChromeDriver as per your code
import org.testng.annotations.AfterMethod; // Corrected to @AfterMethod as per your code
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class DDTCaseStudy {
    
    WebDriver driver;
    // Define the path to your CSV file
    String CsvPath = "C:\\Users\\Shirsa Sen\\Downloads\\apache1.csv";

    @BeforeTest
    public void setup() throws Exception {
        // Note: You need chromedriver.exe configured for this to work
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
    }

    @Test
    public void fillFormFromCsvTest() throws Exception {
        // Initialize the CSV reader
        CSVReader reader = new CSVReader(new FileReader(CsvPath));
        String[] csvCell;
        
        // Skip the header row if your CSV has one
        reader.readNext(); 

        // The while loop reads the CSV file line by line until it's empty
        while ((csvCell = reader.readNext()) != null) {
            // Assign data from the current line to variables
            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String MNumb = csvCell[3];
            String CName = csvCell[4];

            System.out.println("Filling form with data: " + FName + ", " + LName);

            // Find elements and fill the form with data from the CSV
            driver.findElement(By.name("FirstName")).sendKeys(FName);
            driver.findElement(By.name("LastName")).sendKeys(LName);
            driver.findElement(By.name("EmailID")).sendKeys(Email);
            driver.findElement(By.name("MobNo")).sendKeys(MNumb);
            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(1500); // Wait to see the data entered
            
            // Click the submit button
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            
            Thread.sleep(1500); // Wait for the alert to appear
            
            // Switch to the alert and accept it
            Alert alert = driver.switchTo().alert();
            alert.accept();

            // After accepting the alert, the form might be cleared or you might be on a new page.
            // For this specific blog, the page reloads, so we need to navigate back.
            driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
        }
        reader.close(); // Close the reader after the loop is finished
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
