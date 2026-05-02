package com.example.studentapp.controller;

import com.example.studentapp.entity.Course;
import com.example.studentapp.entity.Student;
import com.example.studentapp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    private final StudentService service;

    public ViewController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students-page")
    public String showStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }

    @GetMapping("/add-student")
    public String showForm() {
    return "add-student";
}

@PostMapping("/students/add-form")
public String addStudentFromForm(@RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam int courseId,
                                 Model model) {

    try {
        Student s = new Student();
        s.setName(name);
        s.setEmail(email);

        Course c = new Course();
        c.setId(courseId);
        s.setCourse(c);

        service.saveStudent(s);

        return "redirect:/students-page";

    } catch (Exception e) {
        model.addAttribute("error", "Invalid course ID or data issue");
        return "error-page";
    }
}
@GetMapping("/update-student")
public String showUpdateForm(@RequestParam int id, Model model) {
    Student s = service.getAllStudents()
                       .stream()
                       .filter(st -> st.getId() == id)
                       .findFirst()
                       .orElse(null);

    model.addAttribute("student", s);
    return "update-student";
}

@PostMapping("/students/update-form")
public String updateStudentFromForm(@RequestParam int id,
                                    @RequestParam String name,
                                    @RequestParam String email,
                                    @RequestParam int courseId) {

    Student s = new Student();
    s.setName(name);
    s.setEmail(email);

    Course c = new Course();
    c.setId(courseId);
    s.setCourse(c);

    service.updateStudent(id, s);

    return "redirect:/students-page";
}

}