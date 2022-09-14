
import junit.framework.TestCase;
public class SetTest extends TestCase {
    Set empty = new Set();
    Set one = new Set();
    Set many = new Set();

    @Override
    protected void setUp() throws Exception {
        one.add("1");
        many.add("1");
        many.add("2");
    }

    public void testEmpty()
    {
        assertTrue(empty.isEmpty());
        assertFalse(one.isEmpty());
        assertFalse(many.isEmpty());
    }
    public void testSize()
    {
        assertEquals(1,one.size());
        assertEquals(0,empty.size());
        assertTrue(many.size() >1 );
    }
    public void testContains()
    {
        assertTrue(one.contains("1"));
        assertFalse(one.contains("2"));
        assertFalse(empty.contains("1"));
        assertTrue(many.contains("1"));
        assertTrue(many.contains("2"));
        assertFalse(many.contains("3"));
    }
    public void testDelete()
    {
        Set deleteSet = new Set();
        deleteSet.add("1");
        deleteSet.add("2");
        deleteSet.delete("1");
        assertFalse(deleteSet.contains("1"));
        assertTrue(deleteSet.contains("2"));
        assertEquals(1,deleteSet.size());

    }
    public void testDuplicate()
    {
        one.add("1");
        assertEquals(1,one.size());
    }
    public void testGrow()
    {
        Set growset = new Set(2);
        growset.add("1");
        growset.add("2");
        growset.add("3");
        assertTrue(growset.size() > 2);
        assertTrue(growset.contains("3"));
    }













}
