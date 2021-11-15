package tp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


import org.junit.Test;

import junit.framework.Assert;

public class PanelTest {

	@Test(expected=IllegalArgumentException.class)
	public void panel1() {
		Panel.panel(5, 1);
	}

	@Test
	public void panelSizes() {
		Assert.assertEquals(3, Panel.panel(0, 2).size());
		Assert.assertEquals(1, Panel.panel(2, 2).size());
		Assert.assertEquals(5, Panel.panel(-2, 2).size());
	}

	@Test
	public void panelIterator() {
		Random random = new Random();
		for(int i=0; i<1000; i++) {
			int start = random.nextInt();
			List<Integer> panel = Panel.panel(start, start + 99);
			Assert.assertEquals(100, panel.size());

			int j = start;
			for(int value: panel) {
				Assert.assertEquals(j++, value);
			}
		}
	}

	@Test
	public void panelIterator2() {
		Random random = new Random();
		for(int i=0; i<1000; i++) {
			int start = random.nextInt();
			List<Integer> panel = Panel.panel(start, start + 73);
			Iterator<Integer> it = panel.listIterator();
			for(int j = start; j <= start + 73; j++) {
				Assert.assertEquals(j, (int)it.next());
			}
			Assert.assertFalse(it.hasNext());
		}
	}

	//	  @Test(expected=NoSuchElementException.class)
	//	  public void panelIteratorNSEE() {
		//	    Iterator<Integer> it = Panel.panel(2, 2).iterator();
	//	    it.next();	//2
	//	    it.next();	//doit lever une exception car rien
	//	  }
	//	  
	//	  @Test
	//	  public void panelRandomList() {
	//	    Assert.assertTrue(Panel.panel(0, 7) instanceof RandomAccess);
	//	  }
}
