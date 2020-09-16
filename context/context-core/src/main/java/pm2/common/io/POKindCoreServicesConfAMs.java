package pm2.common.io;

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
import pm2.common.application.ObjectKinds;

public interface POKindCoreServicesConfAMs {
    
    boolean POKindCoreServicesConfOpenAM(String name, String path, ObjectKinds kind);
    
    boolean POKindCoreServicesConfCloseAM(String name, ObjectKinds kind);
    
    byte[] POKindCoreServicesConfReadAM(String name, String path, ObjectKinds kind,
                                        int count, int offset);
    
    boolean POKindCoreServicesConfWriteAM(String name, ObjectKinds kind, byte[] buf);

}
