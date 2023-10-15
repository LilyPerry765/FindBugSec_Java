public void getUserProperty(String property) {
  [...]
  //The first argument is the dynamic expression.
  return ognlUtil.getValue("user."+property, ctx, root, String.class);
}

//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
