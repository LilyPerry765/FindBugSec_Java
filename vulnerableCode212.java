PebbleTemplate compiledTemplate = engine.getLiteralTemplate(inputFile);
[...]
compiledTemplate.evaluate(writer, context);
//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
