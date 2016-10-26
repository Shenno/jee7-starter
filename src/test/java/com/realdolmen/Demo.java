package com.realdolmen;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.BeforeClass;
import org.junit.Test;

import com.realdolmen.course.domain.Gran;
import com.realdolmen.course.service.PersonServiceBean;

public class Demo {
	static Weld weld = new Weld();
	static WeldContainer container;

	@BeforeClass
	public static void init() {
		container = weld.initialize();
	}

	@Test
	public void testWeldWorks() {

		PersonServiceBean psb = container.instance().select(PersonServiceBean.class).get();
		System.out.println(psb);
		assertNotNull(psb);
	}

	@Test
	public void testGran() {

		Gran gran = container.instance().select(Gran.class).get();
		System.out.println(gran);
		assertTrue(gran.bark());
	}
}