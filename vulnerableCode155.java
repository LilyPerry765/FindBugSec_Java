<%
String taintedInput = (String) request.getAttribute("input");
%>
[...]
<%= taintedInput %>
//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
