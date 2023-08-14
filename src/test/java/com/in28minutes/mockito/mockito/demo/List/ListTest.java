package com.in28minutes.mockito.mockito.demo.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

private Object listMock;
@Test
void simpletest() {

	
	List ListMock = mock(List.class);
	
	when(ListMock.size()).thenReturn(3);
	assertEquals(3, ListMock.size());	
}
@Test
void multipleReturns() {
	List ListMock = mock(List.class);
	when(ListMock.size()).thenReturn(1).thenReturn(2);
	assertEquals(1, ListMock.size());
	assertEquals(2, ListMock.size());	
	assertEquals(2, ListMock.size());
	assertEquals(2, ListMock.size());
	assertEquals(2, ListMock.size());
	}
@Test
void parameters() {
	List ListMock = mock(List.class);
	when(ListMock.get(0)).thenReturn("SomeString");
	assertEquals("SomeString", ListMock.get(0));
	assertEquals(null, ListMock.get(1));
}
@Test
void genericparameters() {
	List ListMock = mock(List.class);
	when(ListMock.get(Mockito.anyInt())).thenReturn("SomeotherString");
	assertEquals("SomeotherString", ListMock.get(0));
	assertEquals("SomeotherString", ListMock.get(1));
}

}
