[...]
Cookie cookie = new Cookie("email", email);
cookie.setMaxAge(60*60*24*365);
[...]
//CWE-539: Information Exposure Through Persistent Cookies
