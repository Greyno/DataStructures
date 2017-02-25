import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gillianreynolds-titko on 2/25/17.
 */
public class MyLinkedListTest<T> {


    MyLinkedList<String> myLinkedList;
    MyLinkedList<String> myLinkedListAdd;

    @Before
    public void setUp(){
        myLinkedList = new MyLinkedList<>();
        myLinkedList.add("First string");
        myLinkedList.add("Second string");
        myLinkedList.add("Third string");

        myLinkedListAdd = new MyLinkedList<>();
    }

    @Test
    public void addTest(){
       String expected = "Test";
       myLinkedListAdd.add("Test");
       String actual = myLinkedListAdd.get(0);
       assertEquals("Expected similar strings from the add test", expected, actual);
    }

    @Test
    public void removeTest(){
        int expected = 2;
        myLinkedList.remove(1);
        int actual = myLinkedList.size();
        assertEquals("Expected size reduced by 1", expected, actual);
    }

    @Test
    public void containsTrueTest(){
        assertTrue(myLinkedList.contains("Second String"));

    }

    @Test
    public void containsFalseTest(){
        assertFalse(myLinkedList.contains("Second fiddle"));
    }

    @Test
    public void findElementExistsTest(){
        int expected = 2;
        int actual = myLinkedList.find("Third string");
        assertEquals("Expected item to be found in the list", expected, actual);
    }

    @Test
    public void findElementDoesNotExistTest(){
        int expected = -1;
        int actual = myLinkedList.find("Waldo");
        assertEquals("Expected item not to be found in the list", expected, actual);
    }

    @Test
    public void sizeTest(){
        int expected = 4;
        myLinkedList.add("Waldo");
        int actual = myLinkedList.size();
        assertEquals("Expected to have similar sizes", expected, actual);
    }

    @Test
    public void getItemFoundTest(){
        String expected = "Waldo";
        myLinkedList.add("Waldo");
        String actual = myLinkedList.get(3);
        assertEquals("Expected the two strings to be equal", expected, actual);
    }

    @Test
    public void getItemNotFoundTest(){
        String expected = "Pioneer";
        String actual = myLinkedList.get(1);
        assertEquals("Expected the two strings to be equal", expected, actual);
    }

    @Test
    public void copyTest(){
        assertEquals(myLinkedList, myLinkedList.copy());
    }

    @Test
    public void sortTest(){
        String[] expected = {"First string", "Second string", "Third string", "Waldo"};
        myLinkedList.add("Waldo");
        String[] actual = myLinkedList.sort();
        assertArrayEquals("Expected the arrays to be equal", expected, actual);
    }

}
