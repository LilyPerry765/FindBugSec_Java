@javax.persistence.Entity
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
}

[...]
@Controller
class UserController {

    @GetMapping("/user/{id}")
    public UserEntity getUser(@PathVariable("id") String id) {

        return userService.findById(id).get(); //Return the user entity with ALL fields.
    }

}

//CWE-213: Intentional Information Exposure
