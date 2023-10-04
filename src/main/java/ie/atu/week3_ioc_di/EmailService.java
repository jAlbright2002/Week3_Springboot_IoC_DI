package ie.atu.week3_ioc_di;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String sendEmail(String name, String email) {
        return "Welcome to our platform" + name + " your email is + " + email;
    }

}
