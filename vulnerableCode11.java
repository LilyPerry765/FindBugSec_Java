import java.lang.Runtime;

Runtime r = Runtime.getRuntime();
r.exec("/bin/sh -c some_tool" + input);
//CWE-78: Improper Neutralization of Special Elements used in an OS Command ('OS Command Injection')
