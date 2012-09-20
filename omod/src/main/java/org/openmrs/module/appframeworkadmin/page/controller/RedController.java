package org.openmrs.module.appframeworkadmin.page.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.appframework.AppDescriptor;
import org.openmrs.module.appframework.api.AppFrameworkService;
import org.openmrs.ui.framework.page.PageModel;


public class RedController {

	private static Log log = LogFactory.getLog(RedController.class);
	
	public void controller(PageModel pageModel) {
		AppFrameworkService service = Context.getService(AppFrameworkService.class);

		List<AppDescriptor> apps = service.getAppsForUser(Context.getAuthenticatedUser());
		
		log.error("apps list: " + apps.size());
        pageModel.addAttribute("apps", apps);
    }
	
}
