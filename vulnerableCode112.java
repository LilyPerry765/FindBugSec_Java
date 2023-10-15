String val = request.getParameter("user");
String metadata = request.getParameter("metadata");
[...]
if(authenticated) {
    log.info("User " + val + " (" + metadata + ") was authenticated successfully");
}
else {
    log.info("User " + val + " (" + metadata + ") was not authenticated");
}

//CWE-93: Improper Neutralization of CRLF Sequences ('CRLF Injection')
