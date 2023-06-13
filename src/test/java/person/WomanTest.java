package person;

import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomanTest {


    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testPartnership(Woman woman){
        Man man = new Man("Dmitro", "Ivanov", 20, null);
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Wrong last name");
        Assert.assertEquals(woman.getPartner(),man, "Incorrect partner");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), woman.getMaidenName(), "Wrong last name after deregister");
        Assert.assertEquals(woman.getPartner(),null, "Incorrect partner after deregister");


    }


}
