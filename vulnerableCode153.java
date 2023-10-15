<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:out value="${param.test_param}" escapeXml="false"/>
//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
