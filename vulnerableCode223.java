...
String returnURL = request.getParameter("returnURL");
Return new ActionForward(returnURL);
...
//CWE-552: Files or Directories Accessible to External Parties
