package in.sp.main.controller;

import in.sp.main.entities.User;
import in.sp.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUserDetial()
    {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id)
    {
       User user= userService.getUser(id).orElse(null);
       if(user!=null)
       {
           return ResponseEntity.ok().body(user);
       }
       else
       {
           return ResponseEntity.notFound().build();
       }
    }
}
