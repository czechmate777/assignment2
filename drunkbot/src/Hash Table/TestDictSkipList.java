import java.util.LinkedList;

import junit.framework.TestCase;


public class TestDictSkipList extends TestCase 
{ 
	public void testGetAll()
	{
		DictSkipList<Integer, Integer> test = new DictSkipList<Integer, Integer>();
		test.put(4, 5);
		test.put(4, 6); 
		test.put(4, 7);
		
		LinkedList<Integer> iterable = test.getAll((Integer) 4);
		
		assertEquals(test.get(4), (Integer) 5);
		assertEquals(iterable.getFirst(), (Integer) 5 );
		iterable.removeFirst();
		assertEquals(iterable.getFirst(), (Integer) 6 );
		iterable.removeFirst();
		assertEquals(iterable.getFirst(), (Integer) 7);
		
	}
	
	public void testRemoveAll()
	{
		DictSkipList<Integer, Integer> test = new DictSkipList<Integer, Integer>();
		test.put(4, 5);
		test.put(4, 6);
		test.put(4, 7);
		
		test.removeAll(4);
		
		assertEquals(test.containsKey(4), false);
	}
}
