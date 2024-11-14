package pl.piomin.services.organization.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.piomin.services.organization.model.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}