package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Jinhsi {

    // Khai báo thuộc tính
    private String element;
    private String weapon;
    private String skill;

    // Constructor 
    public Jinhsi() {
        this.element = "Spectro";
        this.weapon = "Blade";
        this.skill = "One Turn Skill";
    }

    // Getter và Setter
    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    // Phương thức khởi tạo sau khi bean được tạo ra 
@PostConstruct
    public void init() {
        System.out.println("Element: " + element);
        System.out.println("Weapon: " + weapon);
        System.out.println("Skill: " + skill);
    }

    // Phương thức gọi khi đối tượng bị hủy
    @PreDestroy
    public void ultimate() {
        System.out.println("Destroying Jinhsi - Ultimate");
    }
}
