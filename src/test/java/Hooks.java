import com.openDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by ravi on 7/29/2017.
 */
public class Hooks {
     openDriver openD = new openDriver();
    @Before
    public void openBrowser() throws IOException {

    //open a browser
        openD.browser();
    }

    @After
    public void closeBrowser(){

        //quit browser
        openD.quitBrowser();

    }
}
