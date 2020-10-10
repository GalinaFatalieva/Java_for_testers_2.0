package taskNumber5Test;

import org.junit.Assert;
import org.junit.Test;
import taskNumber5.actions.Addition;
import taskNumber5.actions.Division;
import taskNumber5.actions.Multiplication;
import taskNumber5.actions.Subtraction;

public class ActionTest {

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
        Subtraction subtraction = new Subtraction();
        subtraction.calculate(aTest,bTest);
        Assert.assertEquals("вычетание не правильное",aTest-bTest, subtraction.getAnswer(),0);
    }

    @Test
    public void multiplication(){
        Multiplication multiplication = new Multiplication();
        multiplication.calculate(aTest,bTest);
        Assert.assertEquals("умножение не правильное",aTest*bTest, multiplication.getAnswer(),0);
    }

    @Test
    public void division(){
        Division division = new Division();
        division.calculate(aTest,bTest);
        Assert.assertEquals("деление не правильное",aTest/bTest, division.getAnswer(),0);
    }


}
