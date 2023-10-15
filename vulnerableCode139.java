protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    [...]
    resp.sendRedirect(req.getParameter("redirectUrl"));
    [...]
}
//CWE-601: URL Redirection to Untrusted Site ('Open Redirect')
