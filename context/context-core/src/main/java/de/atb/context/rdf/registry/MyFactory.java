package de.atb.context.rdf.registry;

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


import org.protege.owl.codegeneration.CodeGenerationFactory;
import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.FactoryHelper;
import org.protege.owl.codegeneration.impl.ProtegeJavaMapping;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.protege.owl.codegeneration.inference.SimpleInference;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import de.atb.context.rdf.registry.impl.DefaultDeployer_OntologyWrapper;
import de.atb.context.rdf.registry.impl.DefaultSW_Service_Configuration_OntologyWrapper;
import de.atb.context.rdf.registry.impl.DefaultSW_Service_OntologyWrapper;

import java.util.Collection;

/**
 * A class that serves as the entry point to the generated code providing access
 * to existing individuals in the ontology and the ability to create new individuals in the ontology.<p>
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: MyFactory<br>
 * @version generated on Mon Oct 05 21:07:01 BST 2015 by Giovanni
 */
public class MyFactory implements CodeGenerationFactory {
    private OWLOntology ontology;
    private ProtegeJavaMapping javaMapping = new ProtegeJavaMapping();
    private FactoryHelper delegate;
    private CodeGenerationInference inference;

    public MyFactory(OWLOntology ontology) {
	    this(ontology, new SimpleInference(ontology));
    }
    
    public MyFactory(OWLOntology ontology, CodeGenerationInference inference) {
        this.ontology = ontology;
        this.inference = inference;
        javaMapping.initialize(ontology, inference);
        delegate = new FactoryHelper(ontology, inference);
    }

    public OWLOntology getOwlOntology() {
        return ontology;
    }
    
    public void saveOwlOntology() throws OWLOntologyStorageException {
        ontology.getOWLOntologyManager().saveOntology(ontology);
    }
    
    public void flushOwlReasoner() {
        delegate.flushOwlReasoner();
    }
    
    public boolean canAs(WrappedIndividual resource, Class<? extends WrappedIndividual> javaInterface) {
    	return javaMapping.canAs(resource, javaInterface);
    }
    
    public  <X extends WrappedIndividual> X as(WrappedIndividual resource, Class<? extends X> javaInterface) {
    	return javaMapping.as(resource, javaInterface);
    }
    
    public Class<?> getJavaInterfaceFromOwlClass(OWLClass cls) {
        return javaMapping.getJavaInterfaceFromOwlClass(cls);
    }
    
    public OWLClass getOwlClassFromJavaInterface(Class<?> javaInterface) {
	    return javaMapping.getOwlClassFromJavaInterface(javaInterface);
    }
    
    public CodeGenerationInference getInference() {
        return inference;
    }

    /* ***************************************************
     * Class http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#DeployerComponent
     */

    {
        javaMapping.add("http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#DeployerComponent", Deployer_OntologyWrapper.class, DefaultDeployer_OntologyWrapper.class);
    }

    /**
     * Creates an instance of type Deployer_OntologyWrapper.  Modifies the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     * @return Deployer_OntologyWrapper
     */
    public Deployer_OntologyWrapper createDeployerOntologyWrapper(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_DEPLOYER_ONTOLOGYWRAPPER, DefaultDeployer_OntologyWrapper.class);
    }

    /**
     * Gets an instance of type Deployer_OntologyWrapper with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     * @return Deployer_OntologyWrapper
     */
    public Deployer_OntologyWrapper getDeployerOntologyWrapper(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_DEPLOYER_ONTOLOGYWRAPPER, DefaultDeployer_OntologyWrapper.class);
    }

    /**
     * Gets all instances of Deployer_OntologyWrapper from the ontology.
     * @return Deployer_OntologyWrapper
     */
    public Collection<? extends Deployer_OntologyWrapper> getAllDeployerOntologyWrapperInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_DEPLOYER_ONTOLOGYWRAPPER, DefaultDeployer_OntologyWrapper.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#ProSEcoSWService
     */

    {
        javaMapping.add("http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#ProSEcoSWService", SW_Service_OntologyWrapper.class, DefaultSW_Service_OntologyWrapper.class);
    }

    /**
     * Creates an instance of type SW_Service_OntologyWrapper.  Modifies the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     * @return SW_Service_Configuration_OntologyWrapper
     */
    public SW_Service_OntologyWrapper createSWServiceOntologyWrapper(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SW_SERVICE_ONTOLOGYWRAPPER, DefaultSW_Service_OntologyWrapper.class);
    }

    /**
     * Gets an instance of type SW_Service_OntologyWrapper with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     * @return SW_Service_Configuration_OntologyWrapper
     */
    public SW_Service_OntologyWrapper getSWServiceOntologyWrapper(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SW_SERVICE_ONTOLOGYWRAPPER, DefaultSW_Service_OntologyWrapper.class);
    }

    /**
     * @return Gets all instances of SW_Service_OntologyWrapper from the ontology.
     */
    public Collection<? extends SW_Service_OntologyWrapper> getAllSWServiceOntologyWrapperInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SW_SERVICE_ONTOLOGYWRAPPER, DefaultSW_Service_OntologyWrapper.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#SWService_Configuration
     */

    {
        javaMapping.add("http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#SWService_Configuration", SW_Service_Configuration_OntologyWrapper.class, DefaultSW_Service_Configuration_OntologyWrapper.class);
    }

    /**
     * Creates an instance of type SW_Service_Configuration_OntologyWrapper.  Modifies the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     * @return SW_Service_Configuration_OntologyWrapper
     */
    public SW_Service_Configuration_OntologyWrapper createSWServiceConfigurationOntologyWrapper(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SW_SERVICE_CONFIGURATION_ONTOLOGYWRAPPER, DefaultSW_Service_Configuration_OntologyWrapper.class);
    }

    /**
     * Gets an instance of type SW_Service_Configuration_OntologyWrapper with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     * @return SW_Service_Configuration_OntologyWrapper
     */
    public SW_Service_Configuration_OntologyWrapper getSWServiceConfigurationOntologyWrapper(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SW_SERVICE_CONFIGURATION_ONTOLOGYWRAPPER, DefaultSW_Service_Configuration_OntologyWrapper.class);
    }

    /**
     * Gets all instances of SW_Service_Configuration_OntologyWrapper from the ontology.
     * @return SW_Service_Configuration_OntologyWrapper
     */
    public Collection<? extends SW_Service_Configuration_OntologyWrapper> getAllSWServiceConfigurationOntologyWrapperInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SW_SERVICE_CONFIGURATION_ONTOLOGYWRAPPER, DefaultSW_Service_Configuration_OntologyWrapper.class);
    }


}
