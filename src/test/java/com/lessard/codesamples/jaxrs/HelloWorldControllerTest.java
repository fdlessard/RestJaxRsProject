package com.lessard.codesamples.jaxrs;

import org.junit.Test;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;

import javax.ws.rs.core.Application;

public class HelloWorldControllerTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(HelloWorldController.class);
	}

	@Test
	public void hello() {
		String response = target("hello/").request().get(String.class);
		Assert.assertTrue("Hello World".equals(response));
	}
}
