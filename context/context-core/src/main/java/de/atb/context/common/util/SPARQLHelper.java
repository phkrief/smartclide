package de.atb.context.common.util;

/*
 * #%L
 * ATB Context Extraction Core Lib
 * %%
 * Copyright (C) 2020 ATB
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import thewebsemantic.Namespace;
import thewebsemantic.RdfType;

/**
 * SPARQLHelper
 *
 * @author scholze
 * @version $LastChangedRevision: 417 $
 *
 */
public class SPARQLHelper {
	private SPARQLHelper() {}

	public static String appendDefaultPrefixes(final String sparqlQuery) {
		final StringBuilder builder = new StringBuilder();
		builder.append(SPARQLPrefixMappings.getAllAsPrefixString());
		builder.append(sparqlQuery);
		return builder.toString();
	}

	public static synchronized <T> String getRdfNamespace(
			final Class<T> clazz) {
		final Namespace namespaceAnnotation = clazz
				.getAnnotation(Namespace.class);
		if (namespaceAnnotation == null) {
			throw new IllegalArgumentException(
					"Clazz must be annotated with thewebsemantic.Namespace annotation.");
		}
		return namespaceAnnotation.value().endsWith("/") ? namespaceAnnotation
				.value() : namespaceAnnotation.value() + "/";
	}

	public static synchronized <T> String getRdfType(final Class<T> clazz) {
		final RdfType typeAnnotation = clazz.getAnnotation(RdfType.class);
		if (typeAnnotation == null) {
			throw new IllegalArgumentException(
					"Clazz must be annotated with thewebsemantic.RdfType annotation.");
		}
		return typeAnnotation.value();
	}

	public static synchronized <T> String getRdfPropertyQualifier(
            final Class<T> clazz, final String propertyName) {
		return String.format("<%s%s>", SPARQLHelper.getRdfNamespace(clazz),
				propertyName);
	}

	public static synchronized <T> Property createProperty(
            final Class<T> clazz, final String propertyName) {
		return ResourceFactory.createProperty(String.format("%s%s",
				SPARQLHelper.getRdfNamespace(clazz), propertyName));
	}

	public static synchronized <T> String getRdfClassQualifier(
			final Class<T> clazz) {
		return String.format("<%s%s>", SPARQLHelper.getRdfNamespace(clazz),
				SPARQLHelper.getRdfType(clazz));
	}

	public static synchronized <T> String getRdfClassQualifierWithoutBraces(
			final Class<T> clazz) {
		return String.format("%s%s", SPARQLHelper.getRdfNamespace(clazz),
				SPARQLHelper.getRdfType(clazz));
	}
}
