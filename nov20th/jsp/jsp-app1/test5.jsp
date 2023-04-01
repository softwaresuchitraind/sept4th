
<%! 
	int i =10;
	int test()
	{
		return (i*i);
	}
%>
<%
	int i = 20;
%>
i value :<%= i %></br>
i value :<%= this.i %></br>
test() :<%= test() %></br>