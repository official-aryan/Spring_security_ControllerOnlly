package com.SpringSecurity.SpringSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class test {
    public static void main(String[] args) {

     PasswordEncoder passwordEncoder= new  BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("Manish123"));

        //$2a$10$08oEb.mqq7Mli3d/CndCKuZGVSN/HcUOat2Nr8pHYxgIraGdKHTXO
    }
}
