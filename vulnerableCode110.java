public void evaluateScript(String script) {
  GroovyShell shell = new GroovyShell();
  shell.evaluate(script);
}

//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
