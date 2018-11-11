package com.luoxiao.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;

import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authz.AuthorizationFilter;

public class AnyRolesAuthorizationFilter extends AuthorizationFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mapValue) throws Exception {
		
		Subject subject = getSubject(request, response);
		String[] rolesArray = (String[]) mapValue;
		if(rolesArray == null || rolesArray.length == 0){
			return true;
		}
		Set<String> roles = CollectionUtils.asSet(rolesArray);
		for(String role : roles){
			if(subject.hasRole(role)){
				return true;
			}
		}
		return false;
	}

}
