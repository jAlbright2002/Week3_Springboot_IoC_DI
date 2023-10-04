package ie.atu.week3_ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService us;

    @Autowired
    public void setService(UserService us) {
        this.us = us;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        us.registerUser(name, email);
        return "Hello";
    }

}
