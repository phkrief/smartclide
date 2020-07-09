package de.atb.context.monitoring.config.models;

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


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Monitor
 *
 * @author scholze
 * @version $LastChangedRevision: 143 $
 */
@Root(strict = false)
public class Monitor {

    @Attribute()
    protected String id;

    @Attribute(name = "datasource")
    protected String dataSourceId;

    @Attribute(name = "interpreter")
    protected String interpreterId;

    @Attribute(name = "index")
    protected String indexId;

    private Config parentContainer;

    final void setParentContainer(final Config config) {
        this.parentContainer = config;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(final String id) {
        this.id = id;
    }

    public final String getDataSourceId() {
        return this.dataSourceId;
    }

    public final DataSource getDataSource() {
        return this.parentContainer.getDataSource(this.dataSourceId);
    }

    public final void setDataSourceId(final String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public final String getInterpreterId() {
        return this.interpreterId;
    }

    public final Interpreter getInterpreter() {
        return this.parentContainer.getInterpreter(this.interpreterId);
    }

    public final void setInterpreterId(final String interpreterId) {
        this.interpreterId = interpreterId;
    }

    public final String getIndexId() {
        return this.indexId;
    }

    public final Index getIndex() {
        return this.parentContainer.getIndex(this.indexId);
    }

    public final void setIndexId(final String indexId) {
        this.indexId = indexId;
    }

    @Override
    public final String toString() {
        return String.format("%s => %s @ %s", this.dataSourceId, this.interpreterId, this.indexId);
    }
}
