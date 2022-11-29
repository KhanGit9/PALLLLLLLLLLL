package app.model;


import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private int age;
    private String lastname;

    public User(String name, int age, String lastname) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Users attributes: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lastname='" + lastname + '\'' +
                '.';
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
