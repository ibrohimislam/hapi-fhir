package ca.uhn.fhir.rest.annotation;

/*-
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2020 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
<<<<<<< HEAD
 * limitations under the LBoicense.
=======
 * limitations under the License.
>>>>>>> 5db90d3e6edd7e238f33ea42f5bd1f8bcad37fba
 * #L%
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation should be placed on the parameter of a
 * {@link GraphQL @GraphQL} annotated method. The given
 * parameter will be populated with the specific graphQL
 * query being requested.
 *
 * <p>
 *    This parameter should be of type {@link String}
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
<<<<<<< HEAD
public @interface GraphQLQueryUrl {
=======
<<<<<<< HEAD:hapi-fhir-base/src/main/java/ca/uhn/fhir/rest/annotation/GraphQLQueryBody.java
public @interface GraphQLQueryBody {
=======
public @interface GraphQLQueryUrl {
>>>>>>> 5db90d3e6edd7e238f33ea42f5bd1f8bcad37fba:hapi-fhir-base/src/main/java/ca/uhn/fhir/rest/annotation/GraphQLQueryUrl.java
>>>>>>> 5db90d3e6edd7e238f33ea42f5bd1f8bcad37fba
	// ignore
}
