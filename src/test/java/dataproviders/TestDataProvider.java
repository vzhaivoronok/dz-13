package dataproviders;

import org.example.Man;
import org.example.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "manData")
    public static Object[][] man() {
        return new Object[][]{
                {new Man("Dmitro", "Ivanov", 20, null)},
                {new Man("Belenkov", "Vukol", 65, null)},
                {new Man("Apolloniy", "Rykachev", 70, null)},
                {new Man("Erast", "Mustafin", 36, null)},

        };

    }
    @DataProvider(name = "womanData")
    public static Object[][] woman() {
        return new Object[][]{
                {new Woman("Borislava", "Boreczkaya ", 29, null)},
                {new Woman("Glafira", "Dvorzheczkaya", 81, null)},
                {new Woman("Taisya", "Ilinskaya ", 39, null)},
                {new Woman("Harita", "Zhuk", 57, null)},

        };

    }
}
