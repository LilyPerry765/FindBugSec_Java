String input = request.getParameter("lang");
GetMethod get = new GetMethod("http://www.host.com/viewDetails");
get.setQueryString("lang=" + input + "&user_id=" + userId);
get.execute();
//CWE-134: Use of Externally-Controlled Format String
