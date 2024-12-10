package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReversedSequenceTest {

    @Test
    void getReverseTextTest1() {
        CharSequence text = new ReversedSequence("Cottage");
        String expected = "egattoC";
        String actual = ReversedSequence.getText();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getReverseTextTest2() {
        CharSequence text = new ReversedSequence("");
        String expected = "";
        String actual = ReversedSequence.getText();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void lengthTest1() {
        CharSequence text = new ReversedSequence("");
        int expected = 0;
        int actual = text.length();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void lengthTest2() {
        CharSequence text = new ReversedSequence("Cottage");
        int expected = 7;
        int actual = text.length();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void charAtTest1() {
        CharSequence text = new ReversedSequence("Cottage");
        char expected = 0;
        char actual = text.charAt(15);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void charAtTest2() {
        CharSequence text = new ReversedSequence("Cottage");
        char expected = 'g';
        char actual = text.charAt(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void subSequenceTest1() {
        CharSequence text = new ReversedSequence("Cottage");
        var expected = "at";
        var actual = text.subSequence(2, 4);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void subSequenceTest2() {
        CharSequence text = new ReversedSequence("Cottage");
        var expected = "";
        var actual = text.subSequence(10, 3);
        assertThat(actual).isEqualTo(expected);
    }
}

