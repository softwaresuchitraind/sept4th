<%@ page import="java.util.*" %>

<%!
	int i=20;
	int test()
	{
		return i*i;
	}
%>

<%
	Date d1=new Date();
	int []x={10,20,40,50};
%>

<%= d1 %><br/>
<%=Arrays.toString(x) %>
<%= i %><br/>
<%= test() %>