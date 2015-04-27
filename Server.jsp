<%@ page import = "dataentry" %>
<% 
	String name = request.getParameter("username");
	String password = request.getParameter("password");
	String action = request.getParameter("action");
	
	
	if(action.equals("auth")){
		if(name == null || password == null){
			out.print("Authentication Failed");
		}
		else
			out.print("Authentication Passed");

	}
	else if(action.equals("add")){
		if(name == null || password == null){
			out.print("Adding User Failed");
		}
		else
			out.print("Adding User Passed");
		DataEntry e = new DataEntry();
		e.urlConnection();
	}

%>