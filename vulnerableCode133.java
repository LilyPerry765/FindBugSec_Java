public class RegistrationForm extends ValidatorForm {

    private String name;
    private String email;

    [...]

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        //Validation code for name and email parameters passed in via the HttpRequest goes here
    }
}

//CWE-106: Struts: Plug-in Framework not in Use
