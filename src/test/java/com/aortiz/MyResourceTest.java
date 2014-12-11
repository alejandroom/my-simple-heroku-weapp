package com.aortiz;

import static org.junit.Assert.*;

import javax.ws.rs.core.*;

import org.glassfish.jersey.server.*;
import org.glassfish.jersey.test.*;
import org.junit.*;

public class MyResourceTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(MyResource.class);
	}

	/**
	 * Test to see that the message "Got it!" is sent in the response.
	 */
	@Test
	public void testGetIt() {
		final String responseMsg = target().path("myresource").request().get(String.class);

		assertEquals("Hola pequeñita! *3*!!", responseMsg);
	}
}
