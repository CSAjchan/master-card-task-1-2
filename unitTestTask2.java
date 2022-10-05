import static org.junit.Assert.*;

import org.junit.Test;

public class unitTestTask2 {

    @Test
    public void test(){
        Task2 task = new Task2();
        String greeting = "Hello World";
        String smallString = "ab";
        String random = "abasdamkopilcetarsis";
        assertEquals(task.reverseIteratively(greeting), "dlroW olleH");
        assertEquals(task.reverseRecursively(greeting), "dlroW olleH");
        assertEquals(task.reverseIteratively(smallString), "ba");
        assertEquals(task.reverseRecursively(smallString), "ba");
        assertEquals(task.reverseIteratively(random), "sisrateclipokmadsaba");
        assertEquals(task.reverseRecursively(random), "sisrateclipokmadsaba");
    }

    @Test
    public void testPalindrome(){
        Task2 task = new Task2();
        String palindrome = "racecar";
        String palindrome1 = "level";
        String palindrome2 = "aabaa";
        assertEquals(task.reverseIteratively(palindrome), "racecar");
        assertEquals(task.reverseRecursively(palindrome), "racecar");
        assertEquals(task.reverseIteratively(palindrome1), "level");
        assertEquals(task.reverseRecursively(palindrome1), "level");
        assertEquals(task.reverseIteratively(palindrome2), "aabaa");
        assertEquals(task.reverseRecursively(palindrome2), "aabaa");
    }

    @Test
    public void testEmpty(){
        Task2 task = new Task2();
        String emptyString = "";
        assertEquals(task.reverseIteratively(emptyString), "");
        assertEquals(task.reverseRecursively(emptyString), "");
    }

    @Test
    public void testNull(){
        Task2 task = new Task2();
        String nullString = null;
        assertEquals(task.reverseIteratively(nullString), null);
        assertEquals(task.reverseRecursively(nullString), null);
    }

    @Test
    public void testOneLetter(){
        Task2 task = new Task2();
        String aString = "a";
        String bString = "b";
        assertEquals(task.reverseIteratively(aString), "a");
        assertEquals(task.reverseRecursively(aString), "a");
        assertEquals(task.reverseIteratively(bString), "b");
        assertEquals(task.reverseRecursively(bString), "b");
    }

}
