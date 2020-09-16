package de.atb.context.rdf.registry.impl;

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


import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;
import de.atb.context.rdf.registry.Deployer_OntologyWrapper;
import de.atb.context.rdf.registry.SW_Service_Configuration_OntologyWrapper;
import de.atb.context.rdf.registry.SW_Service_OntologyWrapper;
import de.atb.context.rdf.registry.Vocabulary;

import java.util.Collection;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultDeployer_OntologyWrapper <br>
 *
 * @version generated on Mon Oct 05 21:07:01 BST 2015 by Giovanni
 */
public class DefaultDeployer_OntologyWrapper extends WrappedIndividualImpl implements Deployer_OntologyWrapper {

    public DefaultDeployer_OntologyWrapper(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#hasDeployer_SWServices
     */

    public Collection<? extends SW_Service_OntologyWrapper> getHasDeployerSWServices() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASDEPLOYER_SWSERVICES,
                DefaultSW_Service_OntologyWrapper.class);
    }

    public boolean hasHasDeployerSWServices() {
        return !getHasDeployerSWServices().isEmpty();
    }

    public void addHasDeployerSWServices(SW_Service_OntologyWrapper newHasDeployerSWServices) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASDEPLOYER_SWSERVICES,
                newHasDeployerSWServices);
    }

    public void removeHasDeployerSWServices(SW_Service_OntologyWrapper oldHasDeployerSWServices) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASDEPLOYER_SWSERVICES,
                oldHasDeployerSWServices);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#hasSWService_Configuration
     */

    public Collection<? extends SW_Service_Configuration_OntologyWrapper> getHasSWServiceConfiguration() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASSWSERVICE_CONFIGURATION,
                DefaultSW_Service_Configuration_OntologyWrapper.class);
    }

    public boolean hasHasSWServiceConfiguration() {
        return !getHasSWServiceConfiguration().isEmpty();
    }

    public void addHasSWServiceConfiguration(SW_Service_Configuration_OntologyWrapper newHasSWServiceConfiguration) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASSWSERVICE_CONFIGURATION,
                newHasSWServiceConfiguration);
    }

    public void removeHasSWServiceConfiguration(SW_Service_Configuration_OntologyWrapper oldHasSWServiceConfiguration) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASSWSERVICE_CONFIGURATION,
                oldHasSWServiceConfiguration);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#hasSWService_Deployer
     */

    public Collection<? extends Deployer_OntologyWrapper> getHasSWServiceDeployer() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASSWSERVICE_DEPLOYER,
                DefaultDeployer_OntologyWrapper.class);
    }

    public boolean hasHasSWServiceDeployer() {
        return !getHasSWServiceDeployer().isEmpty();
    }

    public void addHasSWServiceDeployer(Deployer_OntologyWrapper newHasSWServiceDeployer) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASSWSERVICE_DEPLOYER,
                newHasSWServiceDeployer);
    }

    public void removeHasSWServiceDeployer(Deployer_OntologyWrapper oldHasSWServiceDeployer) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASSWSERVICE_DEPLOYER,
                oldHasSWServiceDeployer);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#IdName
     */

    public Collection<? extends String> getIdName() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDNAME, String.class);
    }

    public boolean hasIdName() {
        return !getIdName().isEmpty();
    }

    public void addIdName(String newIdName) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDNAME, newIdName);
    }

    public void removeIdName(String oldIdName) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDNAME, oldIdName);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#status
     */

    public Collection<? extends String> getStatus() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATUS, String.class);
    }

    public boolean hasStatus() {
        return !getStatus().isEmpty();
    }

    public void addStatus(String newStatus) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATUS, newStatus);
    }

    public void removeStatus(String oldStatus) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATUS, oldStatus);
    }


}
