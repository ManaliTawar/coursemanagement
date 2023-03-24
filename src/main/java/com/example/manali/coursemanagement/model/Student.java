package com.example.manali.coursemanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="student")
public class Student{
        public Student(String name, String program, Integer credits, String course, Integer gpa) {
                super();
                this.name = name;
                this.program = program;
                this.credits = credits;
                this.course = course;
                this.gpa = gpa;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        public Student() {

        }
        public int getId() {
                return id;
        }
        public void setId(int id) {
                this.id = id;
        }
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getProgram() {
                return program;
        }

        public void setProgram(String program) {
                this.program = program;
        }

        public Integer getCredits() {
                return credits;
        }

        public void setCredits(Integer credits) {
                this.credits = credits;
        }

        public String getCourse() {
                return course;
        }

        public void setCourse(String course) {
                this.course = course;
        }

        public Integer getGpa() {
                return gpa;
        }

        public void setGpa(Integer gpa) {
                this.gpa = gpa;
        }

        @Column(name = "name")
        @NotNull
        private String name;

        @Column(name="program")
        @NotNull

        String program;
        @Column(name="credits")
        @NotNull

        Integer credits;
        @Column(name="course")
        @NotNull

        String course;
        @Column(name="gpa")
        @NotNull
        Integer gpa;

}
