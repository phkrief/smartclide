package de.atb.context.monitoring.analyser.file;

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


import java.io.File;
import java.util.List;

import de.atb.context.monitoring.config.models.InterpreterConfiguration;
import de.atb.context.monitoring.index.Indexer;
import de.atb.context.monitoring.models.IMonitoringDataModel;
import org.apache.lucene.document.Document;
import org.javatuples.Pair;

import de.atb.context.tools.ontology.AmIMonitoringConfiguration;
import de.atb.context.monitoring.analyser.IndexingAnalyser;
import de.atb.context.monitoring.config.models.DataSource;

/**
 * FilePairAnalyser
 *
 * @author scholze
 * @version $LastChangedRevision: 143 $
 */
public abstract class FilePairAnalyser<OutputType extends IMonitoringDataModel<?, ?>> extends
    IndexingAnalyser<OutputType, Pair<File, File>> {

    public FilePairAnalyser(final DataSource dataSource, final InterpreterConfiguration interpreterConfiguration, final Indexer indexer, final Document document, final AmIMonitoringConfiguration amiConfiguration) {
        super(dataSource, interpreterConfiguration, indexer, document, amiConfiguration);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * IndexingAnalyser#analyseObject
     * (java.lang.Object, org.apache.lucene.document.Document)
     */
    @Override
    public final List<OutputType> analyseObject(final Pair<File, File> filePair, final Document document) {
        // some generic handling stuff could be done here
        // like indexing file creation, modification etc.

        return analyseObject(filePair);
    }

    public abstract List<OutputType> analyseObject(Pair<File, File> filePair);

}
