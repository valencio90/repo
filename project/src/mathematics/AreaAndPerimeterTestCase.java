package mathematics;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AreaAndPerimeterTestCase {

    @Test
    public void testAreaAndPerimeter() {

        double area = AreaAndPerimeter.calculateCircleArea(3.5);
        double perimeter = AreaAndPerimeter.calculateCirclePerimeter(3.5);

        assertEquals(38.484,area, 0.001);
        assertEquals(21.991,perimeter, 0.001);
    }

}