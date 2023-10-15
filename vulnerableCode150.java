<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:eval expression="'${param.lang}'=='fr'" var="languageIsFrench" />
//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
