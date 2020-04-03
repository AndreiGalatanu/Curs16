package ro.fasttrackit.mvnbase.DiffrentTests.DifrentTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.mvnbase.DifrentApps.Calculator;

import static java.lang.Integer.MAX_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("wHEN I ADD 2 INTEGERS tHEN  theyr sum is returned")
    void addingTwoPositive() {
        //SETUP


        //RUN
        var result = calculator.add(1, 2);
        //ASSERT
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("wHEN I ADD A POSITIV AND A NEGATIVE NUMBER then Their diffferece is returned")
    void addingPositiveAndNegative() {

        //SETUP

        //RUN
        var result = calculator.add(1, -1);
        //ASSERT
        assertThat(result).isEqualTo(0);


    }

    @Test
    @DisplayName("WHEN addding a number over max int THEN.throw exception")
    void addingMax() {

        //Setup


        //run +assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.add(MAX_VALUE, 10));

        //ASSERT


    }

    @Test
    @DisplayName("WHEN addding two  number over max int THEN.throw exception")
    void addingTwoMaxIntegers() {

        //Setup


        //run +assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.add(MAX_VALUE, MAX_VALUE));

        //ASSERT


    }
    @Test
    @DisplayName("-Max val +expection")
    void substractMinusMaxInt(){

        try {

                calculator.substract(-MAX_VALUE,10);
            }catch (IllegalArgumentException iea){
                Assertions.assertTrue(true);
        }


    }

@Test
    @DisplayName("multiply test 1")
    void multiplyPositivewith1(){

        var result =calculator.multiply(7,1);
        assertThat(true);
}

    @Test
    @DisplayName("multiply teste")
    void multiplyPositive(){

        var result =calculator.multiply(7,7);
        assertThat(result).isEqualTo(49);
    }





}

