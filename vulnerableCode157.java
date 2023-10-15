protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String input1 = req.getParameter("input1");
    [...]
    resp.getWriter().write(input1);
}
//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
