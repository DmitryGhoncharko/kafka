package pl.piomin.services.organization.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.piomin.services.organization.model.UserAccount;
import pl.piomin.services.organization.repository.UserAccountRepository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserAccountController {

    @Autowired
    private UserAccountRepository userAccountRepository;


    @PostMapping
    public ResponseEntity<UserAccount> createUser(@RequestBody UserAccount userAccount) {
        UserAccount savedUser = userAccountRepository.save(userAccount);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<UserAccount>> getAllUsers() {
        List<UserAccount> users = userAccountRepository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserAccount> getUserById(@PathVariable Long id) {
        Optional<UserAccount> userAccount = userAccountRepository.findById(id);
        return userAccount.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserAccount> updateUser(@PathVariable Long id, @RequestBody UserAccount userAccount) {
        if (!userAccountRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        userAccount.setId(id);
        UserAccount updatedUser = userAccountRepository.save(userAccount);
        return ResponseEntity.ok(updatedUser);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (!userAccountRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        userAccountRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

