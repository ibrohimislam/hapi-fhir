package ca.uhn.fhir.validation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEachClass;
import org.junit.jupiter.api.Test;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.util.TestUtil;

public class ValidatorInstantiatorDstu2Test {


	@AfterAll
	public static void afterClassClearContext() {
		TestUtil.clearAllStaticFieldsForUnitTest();
	}


	private static FhirContext ourCtx = FhirContext.forDstu2();
   @Test
   public void testValidator() {
      
      FhirValidator val = ourCtx.newValidator();
      val.validateWithResult(new Patient());
      
      // We have a full classpath, so take advantage
      assertTrue(val.isValidateAgainstStandardSchema());
      assertTrue(val.isValidateAgainstStandardSchematron());
      
   }
   
}
