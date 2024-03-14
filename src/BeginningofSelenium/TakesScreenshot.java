package BeginningofSelenium;

import java.io.File;

import org.openqa.selenium.OutputType;

public interface TakesScreenshot {

	File getScreenshotAs(OutputType<File> file);

}
