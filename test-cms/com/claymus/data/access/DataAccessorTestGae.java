package com.claymus.data.access;

import org.junit.After;
import org.junit.Before;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

public class DataAccessorTestGae extends DataAccessorTest {

	private final LocalServiceTestHelper helper =
			new LocalServiceTestHelper( new LocalDatastoreServiceTestConfig() );
	
	@Before
    public void setUp() {
        helper.setUp();
    }

    @After
    public void tearDown() {
        helper.tearDown();
    }
	
}
