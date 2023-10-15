@RequestMapping("/redirect")
public String redirect(@RequestParam("url") String url) {
    [...]
    return "redirect:" + url;
}
//CWE-601: URL Redirection to Untrusted Site ('Open Redirect')
