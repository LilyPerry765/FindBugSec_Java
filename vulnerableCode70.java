@Controller
public class UnsafeController {

    @RequestMapping("/path")
    public void writeData() {
        // State-changing operations performed within this method.
    }
}
//CWE-352: Cross-Site Request Forgery (CSRF)
