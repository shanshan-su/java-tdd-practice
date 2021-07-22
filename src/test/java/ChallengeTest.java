import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChallengeTest {

//    How Many Solutions Does This Quadratic Have?
    @Test
    public void testIfSolutionsWorks() {
        assertEquals(2, Challenge.solutions(1, 0, -1));
        assertEquals(1, Challenge.solutions(1, 0, 0));
        assertEquals(0, Challenge.solutions(1, 0, 1));
        assertEquals(0, Challenge.solutions(200, 420, 800));
        assertEquals(2, Challenge.solutions(200, 420, -800));
        assertEquals(2, Challenge.solutions(1000, 1000, 0));
        assertEquals(1, Challenge.solutions(10000, 400, 4));
    }

    // War of Numbers
    @Test
    public void testIfWareOfNumbersWorks() {
        assertEquals(168, Challenge.warOfNumbers(new int[]{5,9,45,6,2,7,34,8,6,90,5,243}));
        assertEquals(793, Challenge.warOfNumbers(new int[]{654,7,23,3,78,4,56,34}));
        assertEquals(5, Challenge.warOfNumbers(new int[]{1,2,3,4,5,6,7,8,9}));
        assertEquals(228, Challenge.warOfNumbers(new int[]{97,83,209,141,134,298,110,207,229,275,115,64,244,278}));
        assertEquals(83, Challenge.warOfNumbers(new int[]{332,92,35,315,109,168,320,230,63,323,16,204,105,17,226,157,245,44,223,136,93}));
        assertEquals(846, Challenge.warOfNumbers(new int[]{322,89,36,310,297,157,251,55,264,244,200,304,25,308,311,269,303,257,6,311,307,310,50,46,54,237,59,105,267}));
        assertEquals(0, Challenge.warOfNumbers(new int[]{50,100,149,1,200,199,3,2}));
    }

    // Consecutive Numbers
    @Test
    public void testIfConsWorks() {
        assertTrue(Challenge.consecutive(new int[]{5, 1, 4, 3, 2}));
        assertTrue(Challenge.consecutive(new int[]{55, 59, 58, 56, 57}));
        assertTrue(Challenge.consecutive(new int[]{-3, -2, -1, 1, 0}));
        assertFalse(Challenge.consecutive(new int[]{5, 1, 4, 3, 2, 8}));
        assertFalse(Challenge.consecutive(new int[]{5, 6, 7, 8, 9, 9}));
        assertFalse(Challenge.consecutive(new int[]{5, 3}));
    }

    // Seven Boom!
    @Test
    public void testIfSevenBoomWorks() {
        assertEquals("Boom!", Challenge.sevenBoom(new int[]{2, 6, 7, 9, 3}));
        assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[]{33, 68, 400, 5}));
        assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[]{86, 48, 100, 66}));
        assertEquals("Boom!", Challenge.sevenBoom(new int[]{76, 55, 44, 32}));
        assertEquals("Boom!", Challenge.sevenBoom(new int[]{35, 4, 9, 37}));
    }

    // Phone Number Word Decoder
    @Test
    public void testIfTextToNumWorks() {
        assertEquals("123-647-3937", Challenge.textToNum("123-647-EYES"));
        assertEquals("(325)444-8378", Challenge.textToNum("(325)444-TEST"));
        assertEquals("653-879-8447", Challenge.textToNum("653-TRY-THIS"));
        assertEquals("435-224-7613", Challenge.textToNum("435-224-7613"));
        assertEquals("(333)668-3245", Challenge.textToNum("(33D)ONT-FAIL"));
        assertEquals("(025)445-6741", Challenge.textToNum("(025)445-6741"));
    }

    // How Many "Prime Numbers" Are There?
    @Test
    public void testIfPrimeNumbersWorks() {
        assertEquals(8, Challenge.primeNumbers(20));
        assertEquals(10, Challenge.primeNumbers(30));
        assertEquals(25, Challenge.primeNumbers(100));
        assertEquals(46, Challenge.primeNumbers(200));
        assertEquals(168, Challenge.primeNumbers(1000));
        assertEquals(0, Challenge.primeNumbers(-5));
        assertEquals(18, Challenge.primeNumbers(66));
        assertEquals(32, Challenge.primeNumbers(133));
        assertEquals(25, Challenge.primeNumbers(99));
    }

    // Persistent Little Bugger
    @Test
    public void testIfBuggerWorks() {
        assertEquals(3, Challenge.bugger(39));
        assertEquals(0, Challenge.bugger(4));
        assertEquals(2, Challenge.bugger(25));
        assertEquals(4, Challenge.bugger(999));
    }

    // No Yelling
    @Test
    public void testIfNoYellingWorks() {
        assertEquals("What went wrong?", Challenge.noYelling("What went wrong?????????"));
        assertEquals("Oh my goodness!", Challenge.noYelling("Oh my goodness!!!"));
        assertEquals("WHAT!", Challenge.noYelling("WHAT!"));
        assertEquals("WHAT?", Challenge.noYelling("WHAT?"));
        assertEquals("Oh my goodness!", Challenge.noYelling("Oh my goodness!"));
        assertEquals("I just cannot believe it.", Challenge.noYelling("I just cannot believe it."));
        assertEquals("I just!!! can!!! not!!! believe!!! it!", Challenge.noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
        assertEquals("That's a ton!! of cheese!", Challenge.noYelling("That's a ton!! of cheese!!!!"));
    }

    // Filter out Strings from an Array
    @Test
    public void testIfFilterArrayWorks() {
        assertThat(Challenge.filterArray(new String[]{"1", "2", "a", "b"}), is(new String[]{"1", "2"}));
        assertThat(Challenge.filterArray(new String[]{"1", "a", "b", "0", "15"}), is(new String[]{"1", "0", "15"}));
        assertThat(Challenge.filterArray(new String[]{"1", "2", "aasf", "1", "123", "123"}), is(new String[]{"1", "2", "123"}));
        assertThat(Challenge.filterArray(new String[]{"jsyt", "4", "yt", "6"}), is(new String[]{"4","6"}));
        assertThat(Challenge.filterArray(new String[]{"r", "5", "y", "e", "8", "9"}), is(new String[]{"5", "8", "9"}));
        assertThat(Challenge.filterArray(new String[]{"a", "e", "i", "o", "u"}), is(new String[]{}));
        assertThat(Challenge.filterArray(new String[]{"4", "z", "f", "5"}), is(new String[]{"4", "5"}));
        assertThat(Challenge.filterArray(new String[]{"abc", "123"}), is(new String[]{"123"}));
        assertThat(Challenge.filterArray(new String[]{"$%^", "567", "&&&"}), is(new String[]{"567"}));
        assertThat(Challenge.filterArray(new String[]{"w", "r", "u", "43", "s", "a", "76", "d", "88"}), is(new String[]{"43", "76", "88"}));

    }

    // You FAILEDPASSED the Exam
    @Test
    public void testIfGradePercentageWorks() {
        assertEquals("You PASSED the Exam", Challenge.gradePercentage("85%", "85%"));
        assertEquals("You PASSED the Exam", Challenge.gradePercentage("99%","85%"));
        assertEquals("You FAILED the Exam", Challenge.gradePercentage("65%","90%"));
        assertEquals("You FAILED the Exam", Challenge.gradePercentage("65%","66%"));
        assertEquals("You PASSED the Exam", Challenge.gradePercentage("5%","5%"));
        assertEquals("You FAILED the Exam", Challenge.gradePercentage("5%","6%"));
        assertEquals("You PASSED the Exam", Challenge.gradePercentage("9%","6%"));
    }


}
