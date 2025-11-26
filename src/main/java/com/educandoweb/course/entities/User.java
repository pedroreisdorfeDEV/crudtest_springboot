package com.educandoweb.course.entities;


import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

// o Serializable é usado para que meu objeto possa ser trafegado entre arquivos, pois assim perminite que o objeto seja transformado
// em cadeias de bites
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    private String Name;
    private String Email;
    private String Phone;
    private String Password;

    public User() {
    }

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        Name = name;
        Email = email;
        Phone = phone;
        Password = password;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
