import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.accounting.capability.AccountingEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.accounting {
	
	exports org.nasdanika.models.accounting;
	exports org.nasdanika.models.accounting.impl;
	exports org.nasdanika.models.accounting.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	
	provides CapabilityFactory with 
		AccountingEPackageResourceSetCapabilityFactory;
	
}