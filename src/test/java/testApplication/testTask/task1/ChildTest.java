package testApplication.testTask.task1;


import org.junit.Assert;
import org.junit.Test;

public class ChildTest {

    @Test
    public void testChildFormatMethod() {
        Child child = new Child();
        child.setFio("vitali-buKachou' aLEX");
        String formattedFio = child.format();
        String expected = "Vitali-Bukachou' Alex";
        Assert.assertEquals(expected, formattedFio);
    }

    @Test
    public void testChildFormatMethod2() {
        Child child = new Child();
        child.setFio("vitali-b' a ");
        String formattedFio = child.format();
        String expected = "Vitali-B' A ";
        Assert.assertEquals(expected, formattedFio);
    }

}