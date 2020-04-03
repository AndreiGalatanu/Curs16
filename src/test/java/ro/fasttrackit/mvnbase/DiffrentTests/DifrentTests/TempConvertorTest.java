package ro.fasttrackit.mvnbase.DiffrentTests.DifrentTests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.mvnbase.DifrentApps.TempConvertor;

public class TempConvertorTest {


    private TempConvertor tempConvertor;

    @BeforeEach
    void setup() {
        tempConvertor = new TempConvertor();

    }


    @Test
    @DisplayName("Test one")
    void testOne(){

        var result=tempConvertor.fahrenheitToCelsius(100);

        Assertions.assertThat(result).isEqualTo(37.77777777777778);

    }
    @Test
    @DisplayName("Test tw0")
    void testTwo(){

        var result=tempConvertor.fahrenheitToCelsius(0);

        Assertions.assertThat(result).isEqualTo(-17.77777777777778);

    }
    @Test
    @DisplayName("Test three")
    void tesThree(){

        var result=tempConvertor.fahrenheitToCelsius(50);

        Assertions.assertThat(result).isEqualTo(10);

    }


    @Test
    @DisplayName("C to F test 1")
    void testFour(){
        var result=tempConvertor.celsiusToFahrenheit(50);

        Assertions.assertThat(result).isEqualTo(122);
    }






}
