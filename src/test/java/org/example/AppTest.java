package org.example;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class AppTest{
    @Test
    public void main() {

        List<Float> numbers = new ArrayList<>();
        numbers.add(10f);
        numbers.add(11f);

        List<String> operations = new ArrayList<>();
        operations.add("*");
        float expectedResult = ExpectedResult.Test(10, 11);
        float actualResults = ActualResult.Calculate(numbers, operations);
        System.out.println(expectedResult);
        System.out.println(actualResults);

        if (expectedResult == actualResults){
        System.out.println("Test passed");}
        else{
        System.out.println("Test failed");}

    }
}
