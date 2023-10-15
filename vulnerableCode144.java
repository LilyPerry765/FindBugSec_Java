@javax.persistence.Entity
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private Long role;
}

[...]
@Controller
class UserController {

    @PutMapping("/user/")
    @ResponseStatus(value = HttpStatus.OK)
    public void update(UserEntity user) {

        userService.save(user); //ALL fields from the user can be altered
    }

}

//CWE-915: Improperly Controlled Modification of Dynamically-Determined Object Attributes
