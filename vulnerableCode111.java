String author = request.getParameter(AUTHOR_PARAMETER);
// ...
Cookie cookie = new Cookie("author", author);
response.addCookie(cookie);
//CWE-93: Improper Neutralization of CRLF Sequences ('CRLF Injection')
