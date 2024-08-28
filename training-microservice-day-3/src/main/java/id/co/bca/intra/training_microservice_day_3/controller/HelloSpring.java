package id.co.bca.intra.training_microservice_day_3.controller;

import com.netflix.discovery.EurekaClient;
import id.co.bca.intra.training_microservice_day_3.Form.TemplateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    @GetMapping("/hello")
    public String printHello(){
        return "Hello, Spring Boot!";
    }
}
