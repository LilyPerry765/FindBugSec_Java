def doGet(value:String) = Action {
    WS.url(value).get().map { response =>
        Ok(response.body)
    }
}
//CWE-918: Server-Side Request Forgery (SSRF)
