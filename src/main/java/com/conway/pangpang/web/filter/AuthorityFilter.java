package com.conway.pangpang.web.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.conway.pangpang.domain.Module;
import com.conway.pangpang.domain.User;
import com.conway.pangpang.support.constants.CachedPropertyNameDefine;
import com.conway.pangpang.support.constants.PageNameDefine;
import com.conway.pangpang.support.constants.RequestPathDefine;

public class AuthorityFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		if(request instanceof HttpServletRequest){
			HttpServletRequest req = (HttpServletRequest)request;
			String currentPath = req.getRequestURI();
			if(currentPath.endsWith(RequestPathDefine.ACTION_PATH_LOGIN)){
				chain.doFilter(request, response);
				return ;
			}
			
			HttpSession session = req.getSession();
			User user = (User) session.getAttribute(CachedPropertyNameDefine.CURRENT_USER_IN_SESSION);
			if(user == null){
				RequestDispatcher dispatcher = request.getRequestDispatcher(RequestPathDefine.ACTION_PATH_LOGIN);
				dispatcher.forward(request, response);
				return ;
			}
			//user.getMoulde
			List<Module> modules = new ArrayList<Module>();
			for(Module module: modules){
				if(currentPath.equals(module.getURL())){
					chain.doFilter(request, response);
					return ;
				}
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(PageNameDefine.PAGE_NO_AUTH_ERROR_JSP);
			dispatcher.forward(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

}
