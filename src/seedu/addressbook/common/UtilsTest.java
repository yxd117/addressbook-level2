package seedu.addressbook.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.parser.Parser;

public class UtilsTest {
	private Utils utils;

    @Before
    public void setup() {
    	utils = new Utils();
    }
    
	@Test
	public void test_isAnyNull() {
        final String[] input = {null, "1244", "hhh"};
		Boolean expected = true;
		Boolean result = utils.isAnyNull(input);
        assertEquals(expected, result);
	}
	@Test
	public void test() {
        final String[] input = {"1244", "hhh"};
		Boolean expected = false;
		Boolean result = utils.isAnyNull(input);
        assertEquals(expected, result);
	}

}
