<%
	String s1 = "test1.jsp";
%>

i am @ test8.jsp begin<br/>
<jsp:include page="<%= s1 %>" />

i am @ test8.jsp end <br/>

<%--
it is working in action directives but not in page directive

it is perfectly request dispatchers include,it will work in Servlets also
--%>