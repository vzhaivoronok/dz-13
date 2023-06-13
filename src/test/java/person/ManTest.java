package person;

import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManTest
{

     @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void testRetirement(Man manFromTestProvider){
        Assert.assertEquals(manFromTestProvider.isRetired(), manFromTestProvider.getAge()>65, "Incorrect isRetired method");
    }
}
