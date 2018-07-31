package com.spring.rucken.entity;

import java.time.LocalDate;
import java.util.Set;

public class User {

    private Long id;
    private String password;
    private LocalDate lastLogin;
    private Boolean isSuperuser;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isStaff;
    private Boolean isActive;
    private LocalDate dateJoined;
    private LocalDate dateOfBirth;
    private Set<Group> groups;

//    async makePassword(password: string) {
//        const h = new hashers.PBKDF2PasswordHasher();
//        const hash = await h.encode(password, h.salt());
//        return hash;
//    }
//
//    async verifyPassword(password: string) {
//        const h = new hashers.PBKDF2PasswordHasher();
//        return await h.verify(password, this.password);
//    }
//
//    async setPassword(password: string) {
//        if (password) {
//            this.password = await this.makePassword(password);
//        }
//        return this;
//    }

//    checkPermissions(permissions: string[]) {
//        permissions = permissions.map(permission => permission.toLowerCase());
//        return this.groups.filter(group =>
//                group && group.permissions.filter(permission =>
//                permissions.indexOf(permission.name.toLowerCase()) !== -1
//            ).length > 0
//        ).length > 0;
//    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getSuperuser() {
        return isSuperuser;
    }

    public void setSuperuser(Boolean superuser) {
        isSuperuser = superuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStaff() {
        return isStaff;
    }

    public void setStaff(Boolean staff) {
        isStaff = staff;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", lastLogin=" + lastLogin +
                ", isSuperuser=" + isSuperuser +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isStaff=" + isStaff +
                ", isActive=" + isActive +
                ", dateJoined=" + dateJoined +
                ", dateOfBirth=" + dateOfBirth +
                ", groups=" + groups +
                '}';
    }
}
