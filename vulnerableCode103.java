public void runCustomTrigger(String script) {
    ScriptEngineManager factory = new ScriptEngineManager();
    ScriptEngine engine = factory.getEngineByName("JavaScript");

    engine.eval(script); //Bad things can happen here.
}
//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
