<%

int [] data = {12,56,60,50};
int i =20;
int j =data[2];
i++;
j+=10;

%>

array content:
<%= java.util.Arrays.toString(data) %></br>
i value :<%= i %><br/>
j value :<%= j %><br/>