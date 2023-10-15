public void loginEvent(HttpServletRequest req, String userSubmitted) {
    //..

    req.getSession().setAttribute("user",userSubmitted);
}

//CWE-501: Trust Boundary Violation
