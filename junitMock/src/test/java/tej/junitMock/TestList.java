package tej.junitMock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class TestList {

	@Test  
    public void testList_ReturnsSingle_value() {  
  
        List mocklist = mock(List.class);  
        when(mocklist.size()).thenReturn(1);  
  
        assertEquals(1, mocklist.size());  
        assertEquals(1, mocklist.size());  
          
        System.out.println( mocklist.size());  
        System.out.println(mocklist);  
    }  
	
	@Test   
    public void testList_Returns_MultipleValues() {  
      
		List mocklist = mock(List.class);  
		//    when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);  
		when(mocklist.size()).thenReturn(3); 
      
		//    assertEquals(1, mocklist.size());   
		//    assertEquals(2, mocklist.size());  
		assertEquals(3, mocklist.size());  
      
		System.out.println(mocklist.size());   
		System.out.println(mocklist);  
	}
	
	@Test   
    public void testList_get() {  
  
		List mocklist = mock(List.class);  
		  
		when(mocklist.get(1)).thenReturn("Mockito");  
		 
		assertEquals("Mockito", mocklist.get(1)); 
		//assertEquals("Mockito", mocklist.get(0));
		System.out.println(mocklist.get(1));  
	}  
	
	
}
	
