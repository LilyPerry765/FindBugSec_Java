public void evaluateExpression(String expression) {
    FacesContext context = FacesContext.getCurrentInstance();
    ExpressionFactory expressionFactory = context.getApplication().getExpressionFactory();
    ELContext elContext = context.getELContext();
    ValueExpression vex = expressionFactory.createValueExpression(elContext, expression, String.class);
    return (String) vex.getValue(elContext);
}
//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
