package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoSomethingClassTest {

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    final PrintStream originalOut = System.out;
    final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void example1a() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 299, -1, Integer.MIN_VALUE);
        Integer[] intArrays = new Integer[nums.size()];
        intArrays = nums.toArray(intArrays);
        Integer result = DoSomethingClass.example1(intArrays, intArrays.length);
        //validate that the lowest value is the lowest value entered into the array.
        assertEquals(result, Integer.MIN_VALUE);
    }

    @Test
    void example1b() {
        Integer[] intArrays = new Integer[0];
        //verify that method throws out of bound exception when passed un-acceptable parameters.
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            DoSomethingClass.example1(intArrays, 5);
        });
    }

    @Test
    void example2a() {
        Integer[] intArrays = new Integer[0];
        //verify that method throws out of bound exception when passed less than 100 lines
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            DoSomethingClass.example2(intArrays);
        });
    }

    @Test
    void example2b() {
        // generate 100 random numbers
        RandomHundredInts ints = new RandomHundredInts();
        // run the method
        DoSomethingClass.example2(ints.nums);
        // verify the logic to standard out with the output of the iterator
        Assertions.assertEquals(outContent.toString(), ints.correctOutput());
        // verify there were no logs to error out.
        Assertions.assertEquals(errContent.toString(), "");
    }

    @Test
    void example3a() {
        Integer[] digits = new Integer[] { 1, 2, 3, 4, 6, 7, 8, 9, 0};
        // set case single case a
        DoSomethingClass.example3(digits);
        // verify the logic to standard out with no matches
        Assertions.assertEquals(outContent.toString(), "None of the search values were found.\r\n");
        Assertions.assertEquals(errContent.toString(), "");
    }

    @Test
    void example3b() {
        Integer[] digits = new Integer[] { 1, 2, 3, 4, 6, 7, 8, 9, 5};
        // set case single case a
        DoSomethingClass.example3(digits);
        // verify the logic to standard out with no matches
        Assertions.assertEquals(outContent.toString(), "The value of a was found in the int array.\r\n");
        Assertions.assertEquals(errContent.toString(), "");
    }

    @Test
    void example3b1() {
        Integer[] digits = new Integer[] { 1, 2, 3, 4, 6, 7, 8, 5, 5};
        // set case single case a
        DoSomethingClass.example3(digits);
        // verify the logic to standard out with no matches with multiple matches
        Assertions.assertEquals(outContent.toString(), "The value of a was found in the int array.\r\n"
                        + "The value of a was found in the int array.\r\n"
                );
        Assertions.assertEquals(errContent.toString(), "");
    }

    @Test
    void example3b2() {
        Integer[] digits = new Integer[] { 1, 2, 3, 4, 6, 7, 8, 5, 10};
        // set case single case a
        DoSomethingClass.example3(digits);
        // technically a bug as there is both a and b case, but the logs only say there is a b case.
        Assertions.assertEquals(outContent.toString(), "The value of a was found in the int array.\r\n"
                + "The value of b was found in the int array.\r\n"
        );
        Assertions.assertEquals(errContent.toString(), "");
    }

    private static class RandomHundredInts {
        public Integer[] nums;
        public RandomHundredInts() {
            nums = new Integer[100];
            fillNums();
        }

        private void fillNums() {
            int count = 0;
            int low = 10;
            int high = 100;
            Random r = new Random();
            while (count < 100) {
                int result = r.nextInt(high-low) + low;
                nums[count] = result;
                count++;
            }
        }

        private String correctOutput() {
            String results = "";
            for(Integer i : nums) {
                results += i + "\r\n";
            }
            return results;
        }

    }
}
