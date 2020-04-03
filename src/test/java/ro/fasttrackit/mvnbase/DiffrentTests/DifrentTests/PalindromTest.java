package ro.fasttrackit.mvnbase.DiffrentTests.DifrentTests;

import org.junit.jupiter.api.*;
import ro.fasttrackit.mvnbase.DifrentApps.Palindrom;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromTest {

    private Palindrom palindrom;

    @BeforeAll
    void setup() {
        palindrom = new Palindrom();
    }


    @Test
    @DisplayName("When null is received Then response is false")
    void nullPalindrom() {
        var palindrome = new Palindrom();
        var result = palindrome.isPalindrome(null);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("single char")
    void singleChar() {

        //run
        var result = palindrom.isPalindrome("a");

//assert
        assertTrue(result);

    }
    @Test
    @DisplayName("Is palinrom")
    void  palindromWord(){

        var result=palindrom.isPalindrome("ana");
        assertThat(result);

    }

    @Test
    @DisplayName("Is palinrom case")
    void  palindromWordcase(){

        var result=palindrom.isPalindrome("Ana");
        assertTrue(result);

    }

}