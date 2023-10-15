NamingEnumeration<SearchResult> answers = context.search("dc=People,dc=example,dc=com",
        "(uid=" + username + ")", ctrls);
//CWE-90: Improper Neutralization of Special Elements used in an LDAP Query ('LDAP Injection')
