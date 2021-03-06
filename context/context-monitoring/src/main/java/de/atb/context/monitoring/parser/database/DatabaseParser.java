package de.atb.context.monitoring.parser.database;

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

import de.atb.context.monitoring.analyser.IndexingAnalyser;
import de.atb.context.monitoring.config.models.DataSource;
import de.atb.context.monitoring.config.models.InterpreterConfiguration;
import de.atb.context.monitoring.index.Indexer;
import de.atb.context.monitoring.models.IDatabase;
import de.atb.context.monitoring.models.IMonitoringDataModel;
import de.atb.context.monitoring.parser.IndexedFields;
import de.atb.context.monitoring.parser.IndexingParser;
import de.atb.context.monitoring.parser.file.IndexedFileFields;
import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.Document;
import de.atb.context.tools.ontology.AmIMonitoringConfiguration;

import java.util.Date;

import static de.atb.context.monitoring.parser.IndexedFields.MonitoredAt;
import static de.atb.context.monitoring.parser.IndexedFields.Uri;

/**
 * DatabaseParser
 * $Id
 *
 * @author scholze
 * @version $LastChangedRevision: 143 $
 */
public abstract class DatabaseParser extends IndexingParser<IDatabase> {

    protected IndexingAnalyser<? extends IMonitoringDataModel<?, ?>, IDatabase> serviceAnalyser;

    public DatabaseParser(final DataSource dataSource,
                          final InterpreterConfiguration interpreterConfiguration,
                          final Indexer indexer, final AmIMonitoringConfiguration amiConfiguration) {
        super(dataSource, interpreterConfiguration, indexer, amiConfiguration);
        this.serviceAnalyser = this.interpreterConfiguration.createAnalyser(
            dataSource, indexer, this.document, amiConfiguration);
    }

    @Override
    public final synchronized boolean parse(final IDatabase object) {
        this.document.add(IndexedFields.createField(Uri,
            String.valueOf(object.getURI())));
        this.document.add(IndexedFields.createField(IndexedFileFields.FilePath,
            String.valueOf(object.getURI())));
        this.document.add(IndexedFields.createField(MonitoredAt,
            DateTools.timeToString(new Date().getTime(),
                DateTools.Resolution.SECOND)));

        return parseObject(object, this.document);
    }

    @Override
    public final synchronized IndexingAnalyser<? extends IMonitoringDataModel<?, ?>, IDatabase> getAnalyser() {
        return this.serviceAnalyser;
    }

    /**
     * Abstract method to be implemented by the webservice specific parser.
     *
     * @param service  the actual webservice to parsed.
     * @param document the document to add indexed fields to.
     * @return <code>true</code> if parsing was successful, <code>false</code>
     * otherwise.
     */
    protected abstract boolean parseObject(IDatabase service,
                                           Document document);

}
