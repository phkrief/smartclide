package de.atb.context.monitoring.rdf.util;

/*
 * #%L
 * ATB Context Monitoring Core Services
 * %%
 * Copyright (C) 2015 - 2020 ATB
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
import de.atb.context.common.util.BusinessCase;

/**
 * Namespace
 * $Id
 *
 * @author scholze
 * @version $LastChangedRevision: 156 $
 */
public enum MonitoringDataNamespace implements IMonitoringDataResource {

    /**
     * Represents the context (base) Namespace.
     */
    Base(BusinessCase.NS_BASE_ID, BusinessCase.NS_BASE_URL),

    /**
     * Represents the dummy Namespace.
     */
    Dummy(BusinessCase.NS_DUMMY_ID, BusinessCase.NS_DUMMY_URL);

    /**
     * Contains the prefix for the Namespace.
     */
    private String localName;

    private String uri;

    MonitoringDataNamespace(final String localName, final String uri) {
        this.localName = localName;
        this.uri = uri;
    }

    public String getUri() {
        return this.uri;
    }

    @Override
    public String getLocalName() {
        return this.localName;
    }

    @Override
    public String getUri(final Model model) {
        return model.getNsPrefixURI(this.getLocalName());
    }

    @Override
    public String getNameSpacePrefix() {
        return this.getLocalName();
    }

    @Override
    public String getNameSpace(final Model model) {
        return model.getNsPrefixURI(this.getLocalName());
    }

}
