<%
	String s1="test1.jsp";
%>
Hello
<%@ include file="%= s1" %>

<!--
" " is unable to

including is happening in composing we can not use any run time parameters in case of directive include.
while going for directive, Servlet is runtime environment.

we can not include servlet files in jsp/runtime paramers.

by using

RequestDispatchers include is dynamic .


-->