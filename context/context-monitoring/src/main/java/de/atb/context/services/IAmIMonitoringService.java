package de.atb.context.services;

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


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import de.atb.context.infrastructure.ServiceInfo;
import de.atb.context.services.interfaces.IService;
import de.atb.context.tools.ontology.AmIMonitoringConfiguration;

/**
 * $Id
 *
 * @author scholze
 */
@WebService(name = "AmIMonitoringService", targetNamespace = "http://atb-bremen.de/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@XmlSeeAlso({AmIMonitoringConfiguration.class})
public interface IAmIMonitoringService extends IService {

    @WebMethod(operationName = "getReposData")
    ServiceInfo getReposData();
}
