Formatter formatter = new Formatter(Locale.US);
String format = "The customer: %s %s has the balance %4$." + userInput + "f";
formatter.format(format, firstName, lastName, accountNo, balance);
//CWE-134: Use of Externally-Controlled Format String
