/*
 * Copyright (c) 2015 Complexible Inc. <http://complexible.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.complexible.pinto.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p></p>
 *
 * @author  Michael Grove
 * @since   1.0
 * @version 1.0
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface RdfProperty {

	/**
	 * The URI value (or qname) of the RDF property the field or method is mapped to
	 * @return the property URI
	 */
	public String value() default "";

	/**
	 * Where or not to process multiple values in a collection as an rdf:List
	 * @return True to process values as an rdf:List, false to process them as multiple assertions on the property.
	 * Default value is false.
	 */
	public boolean isList() default false;

	/**
	 * For literal valued properties, this specifies which language tag to retrieve and save from the RDF
	 * @return the language value, such as 'en' or 'fr' or the empty string for any language typed literals including
	 * those without language types specified.
	 */
	public String language() default "";

	public String datatype() default "";
}
