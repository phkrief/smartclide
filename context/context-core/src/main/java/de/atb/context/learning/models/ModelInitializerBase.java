package de.atb.context.learning.models;

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.atb.context.common.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

/**
 * ModelInitializerBase
 *
 * @author scholze
 * @version $LastChangedRevision: 703 $
 */
public abstract class ModelInitializerBase implements IModelInitializer {

    private final Logger logger = LoggerFactory
            .getLogger(ModelInitializerBase.class);

    public abstract String getModelSkeleton();

    /*
     * (non-Javadoc)
     *
     * @see de.atb.context.learning.models.IModelInitializer#initializeModel()
     */
    @Override
    public final boolean initializeModel(final String filePath) { // TODO this should maybe replace by a call to DRM API
        if (filePath == null) {
            throw new NullPointerException("FilePath may not be null");
        }
        final File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            return true;
        }

        if (FileUtils.ensureDirectoryExists(filePath)) {
            try (FileWriter writer = new FileWriter(filePath);) {
                writer.write(getModelSkeleton());
                writer.flush();
                return true;
            } catch (final IOException e) {
                logger.error(e.getMessage(), e);
            }
        } else {
            try (FileWriter writer = new FileWriter(filePath);) {
                final File source = new File(filePath);
                if (source.createNewFile()) {
                    writer.write(getModelSkeleton());
                    writer.flush();
                }
                return true;
            } catch (final IOException ex) {
                java.util.logging.Logger.getLogger(
                        ModelInitializerBase.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
        return false;
    }
}
