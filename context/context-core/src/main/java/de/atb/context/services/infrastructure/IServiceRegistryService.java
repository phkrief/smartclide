/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.atb.context.services.infrastructure;

/*-
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


import de.atb.context.services.faults.ContextFault;
import de.atb.context.infrastructure.Node;
import de.atb.context.infrastructure.Nodes;
import de.atb.context.services.config.models.SWService;
import de.atb.context.services.interfaces.IPrimitiveService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Giovanni
 */
@WebService(name = "ServiceRegistryService", targetNamespace = "http://atb-bremen.de/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface IServiceRegistryService extends IPrimitiveService {

	@WebMethod(operationName = "register")
    boolean registerSWServices(@WebParam(name = "node") Node node) throws ContextFault;

	@WebMethod(operationName = "unregister")
    boolean unregisterSWServices(@WebParam(name = "node") Node node) throws ContextFault;

	@WebMethod(operationName = "get")
    Nodes getConnectedServices() throws ContextFault;

	@WebMethod(operationName = "getReposData")
    SWService getReposData() throws ContextFault;
}
