package zmacadam.springpractice.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Manager {

    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder(); // <1>

    private @Id
    @GeneratedValue
    Long id; // <2>

    private String name; // <2>

    private @JsonIgnore String password; // <2>

    private String[] roles; // <2>

    public void setPassword(String password) { // <3>
        this.password = PASSWORD_ENCODER.encode(password);
    }

    protected Manager() {}

    public Manager(String name, String password, String... roles) {

        this.name = name;
        this.setPassword(password);
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(id, manager.id) &&
                Objects.equals(name, manager.name) &&
                Objects.equals(password, manager.password) &&
                Arrays.equals(roles, manager.roles);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, name, password);
        result = 31 * result + Arrays.hashCode(roles);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
