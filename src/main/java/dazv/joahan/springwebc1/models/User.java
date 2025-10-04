package dazv.joahan.springwebc1.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String name;
    private String lastName;
    private String email;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
