package com.github.alphameo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.github.alphameo.university.AdministrativePerson;
import com.github.alphameo.university.Course;
import com.github.alphameo.university.Faculty;
import com.github.alphameo.university.Institute;
import com.github.alphameo.university.Lecturer;
import com.github.alphameo.university.Project;
import com.github.alphameo.university.ProjectParticipation;
import com.github.alphameo.university.ResearchPerson;
import com.github.alphameo.university.University;

public class App {
    public static void main(String[] args) {
        var vsu = new University();

        var mathPhysicaEq = new Course("1a", "Equations of Math and Physics", 4);

        var krylovetsky = new Lecturer("Krylovetsky", "111", "kryl@mail.ru",
                "Extremal Algorythms");
        krylovetsky.addCourse(mathPhysicaEq);

        var fedutinov = new ResearchPerson("Fedutinov", "222", "fed@mai.ru", "idk");
        var nuzhnykh = new ResearchPerson("Nuzhnykh", "000", "nuzhnykh@mail.ru", "GoodPain)");
        var admin = new AdministrativePerson("Adminsky", "adm-01", "vsu-admin@mail.ru");
        vsu.hireEmployee(krylovetsky);
        vsu.hireEmployee(fedutinov);
        vsu.hireEmployee(nuzhnykh);
        vsu.hireEmployee(admin);

        var csFaculty = new Faculty("CS", krylovetsky);
        var ammFaculty = new Faculty("amm", fedutinov);
        vsu.addFaculty(csFaculty);
        vsu.addFaculty(ammFaculty);

        var piit = new Institute("Programming and Information Technologies", "Universitetskaya square, 1, cab. 381a");
        var ct = new Institute("Digital Technologies", "Universitetskaya square, 1, cab. ---");
        csFaculty.addInstitute(piit);
        csFaculty.addInstitute(ct);
        krylovetsky.assignToInstitute(ct);
        fedutinov.assignToInstitute(piit);

        var goodEdu = new Project("GoodEducation", LocalDateTime.now(),
                LocalDateTime.now().plusDays(12));
        var projectParticipations = List.of(new ProjectParticipation(12, goodEdu, nuzhnykh));
        System.out.println("\n\n\n");

        var projectsReview = projectParticipations.stream()
                .map(ProjectParticipation::toString)
                .collect(Collectors.joining("\n", "projectParticipations=[\n", "\n]"));

        System.out.println(vsu);
        System.out.println(projectsReview);
    }
}
