package ua.com.juja.week3.changeXY;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/
public class MainTest {

    @Test
    public void test1 (){
        assertMethod("codex", "codey");
    }
    @Test
    public void test2 (){
        assertMethod("x", "y");
    }
    @Test
    public void test3 (){
        assertMethod("xay", "yay");
    }
    @Test
    public void test4 (){
        assertMethod("xxxyyxxx", "yyyyyyyy");
    }
    @Test
    public void test5 (){
        assertMethod("", "");
    }
    @Test
    public void test6 (){
        assertMethod("ho ho", "ho ho");
    }

    private static void assertMethod(String input, String expected){
        String actual = Main.changeXY(input);
        assertEquals(expected, actual);
    }

}
