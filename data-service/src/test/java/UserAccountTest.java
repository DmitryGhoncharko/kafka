import org.junit.jupiter.api.Test;
import pl.piomin.services.organization.model.UserAccount;

import static org.assertj.core.api.Assertions.assertThat;

class UserAccountTest {

    @Test
    void testUserAccountGettersAndSetters() {
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1L);
        userAccount.setLogin("user1");
        userAccount.setPassword("password123");
        userAccount.setEmail("user1@example.com");
        assertThat(userAccount.getId()).isEqualTo(1L);
        assertThat(userAccount.getLogin()).isEqualTo("user1");
        assertThat(userAccount.getPassword()).isEqualTo("password123");
        assertThat(userAccount.getEmail()).isEqualTo("user1@example.com");
    }

    @Test
    void testUserAccountConstructor() {
        UserAccount userAccount = new UserAccount();
        assertThat(userAccount).isNotNull();
    }
}
