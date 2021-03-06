package de.atb.context.persistence;

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

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

import java.io.*;

/**
 * ModelOutputLanguage
 *
 * @author scholze
 * @version $LastChangedRevision: 703 $
 *
 */
public enum ModelOutputLanguage {

	DEFAULT(null),

	RDFXML("RDF/XML"),

	N3("N3"),

	N_TRIPLE("N-TRIPLE"),

	RDFXML_ABBREV("RDF/XML-ABBREV"),

	TURTLE("TURTLE"),

	TTL("TTL");

	private final String language;

	ModelOutputLanguage(final String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public String getModelAsString(final Model model) {
		final StringWriter writer = new StringWriter();
		model.write(writer, getLanguage());
		return writer.toString();
	}

	public Model getModelFromString(final String modelString) {
		final Model model = ModelFactory.createDefaultModel();
		final StringReader reader = new StringReader(modelString);
		model.read(reader, null, getLanguage());
		reader.close();
		return model;
	}

	public void writeModelToFile(final Model model, final File file)
			throws IOException { // TODO this should maybe replace by a call to DRM API
		FileWriter writer = null;
		writer = new FileWriter(file);
		model.write(writer, getLanguage());
	}

	@Override
	public String toString() {
		return language;
	}

}
