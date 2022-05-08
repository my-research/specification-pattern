package com.example.before;

import com.example.before.domain.Factor;
import com.example.before.domain.IdGenerator;
import com.example.before.domain.Identity;

public class Main {

    public static void main(String[] args) {
        Factor student = Factor.of("student");
        Factor teacher = Factor.of("teacher");

        IdGenerator idGenerator = new IdGenerator();

        Identity studentIdentity = idGenerator.generateBy(student);
        Identity teacherIdentity = idGenerator.generateBy(teacher);

        System.out.println("studentIdentity = " + studentIdentity);
        System.out.println("teacherIdentity = " + teacherIdentity);
    }
}
