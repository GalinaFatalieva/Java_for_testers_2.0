package taskNumber5Test;

import org.junit.Assert;
import org.junit.Test;
import taskNumber5.actions.Addition;

public class AdditionTest {

    double aTest = 6;
    double bTest = 1;

    @Test
    public void addition(){
        Addition addition = new Addition();
        addition.calculate(aTest,bTest);
        Assert.assertEquals("сложение не правильное",aTest+bTest, addition.getAnswer(),0);
    }

    @Test
    public void subtraction(){
        Addition subtraction = new Addition();
        subtraction.calculate(aTest,bTest);
        Assert.assertEquals("вычетание не правильное",aTest-bTest, subtraction.getAnswer(),0);
    }

    @Test
    public void multiplication(){
        Addition multiplication = new Addition();
        multiplication.calculate(aTest,bTest);
        Assert.assertEquals("умножение не правильное",aTest*bTest, multiplication.getAnswer(),0);
    }

    @Test
    public void division(){
        Addition division = new Addition();
        division.calculate(aTest,bTest);
        Assert.assertEquals("деление не правильное",aTest/bTest, division.getAnswer(),0);
    }

}
