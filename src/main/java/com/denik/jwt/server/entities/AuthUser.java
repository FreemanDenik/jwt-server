package com.denik.jwt.server.entities;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AUTH_USERS")
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String email;
    @ElementCollection
    @CollectionTable(
            name="roles",
            joinColumns=@JoinColumn(name="user_id")
    )
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
    /*@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Collection<Role> role;*/
   /* @Column
    private String roles;
    public void setRoles(Set<EnumRole> roles){
        this.roles = String.join(",", roles.stream().map(role->role.name()).toArray(String[]::new));
    }
    public Set<EnumRole> getRoles(){
        return Arrays.stream(roles.split(",")).map(w-> EnumRole.valueOf(w)).collect(Collectors.toSet());
    }*/

}