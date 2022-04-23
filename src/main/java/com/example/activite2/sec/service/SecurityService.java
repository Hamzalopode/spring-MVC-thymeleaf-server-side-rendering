package com.example.activite2.sec.service;

import com.example.activite2.sec.Entity.AppRole;
import com.example.activite2.sec.Entity.AppUser;

public interface SecurityService {
    AppUser saveNewUser(String username, String password, String passwordV);
    AppRole saveNewRole(String role, String description);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
}
