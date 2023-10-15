public void logUser(User user) {
    log.info("Current logged in user : " + user.getUsername());
    //...
}
//CWE-95: Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')
