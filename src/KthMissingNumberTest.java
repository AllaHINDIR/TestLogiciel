import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class KthMissingNumberTest {

    List<String[]> columnValues = new ArrayList<String[]>();


    @Before
    public void init(){
        try {
            Scanner scanner = new Scanner(new File("myFile.csv"));
            while(scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(",");
                columnValues.add(values);
            }
        }catch(Exception e) {
            //whatever
        }
    }

    @org.junit.jupiter.api.Test
    void solve() {

        //set x to 1 to avoid columns
        for(int x = 1; x < columnValues.size(); x++) {
            String col1 = columnValues.get(x)[0];
            double col3 = Double.parseDouble(columnValues.get(x)[1]);
            double col4 = Double.parseDouble(columnValues.get(x)[2]);
            //test values here
        }
    }
}