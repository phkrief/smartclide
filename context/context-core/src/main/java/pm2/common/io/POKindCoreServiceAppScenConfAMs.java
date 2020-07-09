package pm2.common.io;

/*-
 * #%L
 * ATB Context Extraction Core Lib
 * %%
 * Copyright (C) 2016 - 2020 ATB
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
 * limitations under the License.
 * #L%
 */
import pm2.common.application.ObjectKinds;

public interface POKindCoreServiceAppScenConfAMs {
    
    boolean POKindCoreServiceAppScenConfOpenAM(String name, String path, ObjectKinds kind);
    
    boolean POKindCoreServiceAppScenConfCloseAM(String name, ObjectKinds kind);
    
    byte[] POKindCoreServiceAppScenConfReadAM(String name, String path, ObjectKinds kind,
                                              int count, int offset);
    
    boolean POKindCoreServiceAppScenConfWriteAM(String name, ObjectKinds kind, byte[] buf);

}