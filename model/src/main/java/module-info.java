import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.agent.capability.AgentEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.agent {
	
	exports org.nasdanika.models.agent;
	exports org.nasdanika.models.agent.impl;
	exports org.nasdanika.models.agent.util;
	opens org.nasdanika.models.agent;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.governance.ai;
	
	provides CapabilityFactory with 
		AgentEPackageResourceSetCapabilityFactory;
	
}