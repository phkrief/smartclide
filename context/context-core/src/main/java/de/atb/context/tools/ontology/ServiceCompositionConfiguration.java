/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.atb.context.tools.ontology;

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


import de.atb.context.modules.broker.process.services.PESRunningService;

import java.util.HashMap;

/**
 *
 * @author Giovanni
 */
public class ServiceCompositionConfiguration extends Configuration {

    HashMap<String, PESRunningService> runningServices;

    public ServiceCompositionConfiguration() {
        super(ServiceCompositionConfiguration.class.getSimpleName());
    }

    public HashMap<String, PESRunningService> getRunningServices() {
        return runningServices;
    }

    public void setRunningServices(HashMap<String, PESRunningService> runningServices) {
        this.runningServices = runningServices;
    }
    
    
}
