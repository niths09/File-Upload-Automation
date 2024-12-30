package fileupload;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));  // Increased wait time
        driver.get("https://imgur.com/upload");
        waitForTheUser();
        
        // Wait for the label element to be clickable and click it (this triggers the file input dialog)
        WebElement label = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='file-input']")));
        label.click();
        waitForTheUser();
        
        // Wait for the input element to be present in the DOM
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
        
        // Provide the file path directly to the <input type="file"> element
        fileInput.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\SeleniumShot\\cybersecurity_image.jpg");
        waitForTheUser();
        
        // Check if the file has been uploaded by detecting the success message
        boolean isUploaded = checkFileUploadSuccess(driver, wait);
        
        if (isUploaded) {
            System.out.println("File uploaded successfully!");
            System.out.println();
            System.out.println("Upload Complete"); // Print "Upload Complete" after success
        } else {
            System.out.println("File upload failed.");
        }
        
        driver.quit();
    }
    
    public static void waitForTheUser() {
        try {
            Thread.sleep(2000);  // Wait for 2 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    // Method to check if the file is uploaded successfully
    public static boolean checkFileUploadSuccess(WebDriver driver, WebDriverWait wait) {
        try {
            // Wait for the success message (Upload Complete with the tick mark) to appear
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Toast-message--check']")));
            
            // Ensure that the success message is visible for a few seconds before it disappears
            waitForTheUser();  // Wait to see the success message for validation (you can adjust this timing)
            
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;  // If the success message is not found, return false
        }
    }
}
