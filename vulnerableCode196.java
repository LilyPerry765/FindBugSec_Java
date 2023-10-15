public void doSomething(HttpServletRequest req, String activateProperty) {
    //..

    req.getSession().setAttribute(activateProperty,"true");

}

//CWE-501: Trust Boundary Violation
