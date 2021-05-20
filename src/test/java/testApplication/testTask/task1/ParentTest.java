package testApplication.testTask.task1;


import org.junit.Assert;
import org.junit.Test;

public class ParentTest {

    @Test
    public void testParentFormatMethod1(){
        Parent parent = new Parent();
        parent.setFio("vitali-buKachou' aLEX");
        String formattedFio = parent.format();
        String expected = "vitali-buKachou' aLEX!";
        Assert.assertEquals(expected, formattedFio);
    }

}