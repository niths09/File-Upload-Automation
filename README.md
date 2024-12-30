# File Upload Automation with Selenium  

This project demonstrates an automated approach to uploading files to the Imgur website using Selenium WebDriver. The script handles file input fields and verifies the success of the upload process through dynamic element interactions.  

## Features  

- **Automated File Upload**: Interacts with the `<input type="file">` element to upload files.  
- **Dynamic Element Handling**: Uses explicit waits to handle web elements that may take time to load.  
- **Success Verification**: Confirms the success of the file upload by detecting visual confirmation messages on the web page.  
- **Cross-Browser Compatibility**: Designed for Google Chrome but can be adapted for other browsers with the appropriate WebDriver.  

## Prerequisites  

Ensure the following are available on your system:  
1. **Java Development Kit (JDK)** - Version 8 or above.  
2. **Selenium WebDriver** - Ensure the required Selenium libraries are included in your project.  
3. **Google Chrome** - Latest stable version.  
4. **ChromeDriver** - Match the version with your installed browser.  
5. **File Path** - Specify the correct file path for the file to be uploaded (e.g., `C:\\path\\to\\file.jpg`).  
6. **Integrated Development Environment (IDE)** - IntelliJ IDEA, Eclipse, or any other IDE for Java.  

## Technologies Used  

- **Java** - Primary programming language for the project.  
- **Selenium WebDriver** - For automating browser interactions.  
- **Google Chrome & ChromeDriver** - Browser and WebDriver used for testing.
