def login(redirectUrl:String) = Action {
    [...]
    Redirect(url)
}
//CWE-601: URL Redirection to Untrusted Site ('Open Redirect')
