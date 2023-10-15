public void parseExpressionInterface(Person personObj,String property) {

        ExpressionParser parser = new SpelExpressionParser();

        //Unsafe if the input is control by the user..
        Expression exp = parser.parseExpression(property+" == 'Albert'");

        StandardEvaluationContext testContext = new StandardEvaluationContext(personObj);
        boolean result = exp.getValue(testContext, Boolean.class);
[...]
//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
