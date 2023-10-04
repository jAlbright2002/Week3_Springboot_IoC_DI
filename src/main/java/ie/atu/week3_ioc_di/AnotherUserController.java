package ie.atu.week3_ioc_di;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherUserController {
    @PostMapping("users")
    @ResponseStatus(HttpStatus.CREATED)
    public Users registerUser(@RequestBody Users user) {

        System.out.println("User ID: " + user.getName());
        System.out.println("User Password: " + user.getPassword());
        return user;
    }

}
