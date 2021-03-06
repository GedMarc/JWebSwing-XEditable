import com.jwebmp.plugins.xeditable.implementations.XEditableInclusionsModule;

module com.jwebmp.plugins.xeditable {

	exports com.jwebmp.plugins.xeditable;
	exports com.jwebmp.plugins.xeditable.options;
	exports com.jwebmp.plugins.xeditable.options.items;
	exports com.jwebmp.plugins.xeditable.components;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.xeditable.XEditablePageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.xeditable.implementations.XEditableExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with XEditableInclusionsModule;
	
	requires com.jwebmp.core;

	requires java.logging;
	requires com.jwebmp.plugins.jqueryui;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.fasterxml.jackson.databind;

	opens com.jwebmp.plugins.xeditable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.options.items to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.xeditable.components to com.fasterxml.jackson.databind, com.jwebmp.core;
}
