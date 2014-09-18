import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquaredNumberTest {

    @Rule
    public TextFromStandardInputStream systemInMock =
            TextFromStandardInputStream.emptyStandardInputStream();
    @Rule
    public StandardOutputStreamLog systemOutMock = new StandardOutputStreamLog();

    @Test
    public void testSquaredTwo() throws Exception {
        // Given
        String input = "2";
        systemInMock.provideText(input);

        // When
        SquaredNumber.main();

        // Then
        String output = "4\n";
        assertThat(systemOutMock.getLog(), is(output));
    }

    @Test
    public void testSquaredThree() throws Exception {
        // Given
        String input = "3";
        systemInMock.provideText(input);

        // When
        SquaredNumber.main();

        // Then
        String output = "9\n";
        assertThat(systemOutMock.getLog(), is(output));
    }

    @Test
    public void testSquaredNumberSequence() throws Exception {
        // Given
        String input = "2\n3\n4";
        systemInMock.provideText(input);

        // When
        SquaredNumber.main();

        // Then
        String output = "4\n9\n16\n";
        assertThat(systemOutMock.getLog(), is(output));
    }

}
