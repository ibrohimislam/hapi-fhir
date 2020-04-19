package ca.uhn.fhir.jpa.testutil;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.AfterEachClass;
import org.junit.jupiter.api.Test;

import ca.uhn.fhir.util.TestUtil;

public class SpringFileTest {

	@AfterAll
	public static void afterClassClearContext() {
		TestUtil.clearAllStaticFieldsForUnitTest();
	}


	@Test
	public void testNoBadResources() throws Exception {
		String text = IOUtils.toString(SpringFileTest.class.getResourceAsStream("/hapi-fhir-server-resourceproviders-dstu2.xml"));
//		assertThat(text, not(containsString("OperationDefinition")));
	}
	
}
