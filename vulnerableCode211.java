Template template = cfg.getTemplate(inputTemplate);
[...]
template.process(data, swOut);
//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
