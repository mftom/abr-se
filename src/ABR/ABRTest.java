package ABR;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ABRTest {

	@Test
	public void testIsEmpty() {
		ABR a = new ABR();
		assertEquals(true, a.isEmpty()); 
	}
	
	@Test
	public void testInsert() {
		ABR a = new ABR();
		a.insert(3);
		assertFalse(a.isEmpty());
	}
	
	@Test
	public void testContains() {
		ABR a = new ABR();
		a.insert(4);
		assertEquals(true, a.contains(4));
	}
	
	@Test
	public void testToList() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(0);
		ABR a = new ABR();
		a.toList(l);
		assertEquals(true, a.contains(4));
	}

}
