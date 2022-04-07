package alahyaoui.curriculum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import alahyaoui.curriculum.business.Program;
import alahyaoui.curriculum.model.Course;
import alahyaoui.curriculum.model.Section;
import alahyaoui.curriculum.service.ProgramService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProgramRestController {

    @Autowired
    private final ProgramService programService;

    @GetMapping("/api/program")
    public ResponseEntity<Program> getProgramView(@RequestParam(required = true) Section section) throws Exception {
        return new ResponseEntity<>(programService.getStudentProgram(section), HttpStatus.OK);
    }

    /**
     * This method is used to update the student program and get the new computed
     * student program.
     * 
     * @param model   The Model object is a Map that is used to pass information
     *                between the controller
     *                and the view.
     * @param program The program to be updated.
     * @return The program page is being returned.
     */
    @PostMapping("/api/program")
    public ResponseEntity<List<Course>> submitProgram(Program program) {
        // @TOFIX Update two times in case of not properly treated courses
        programService.updateProgram(program);
        programService.updateProgram(program);
        return new ResponseEntity<>(programService.getAnnualStudentProgram(program), HttpStatus.OK);
    }
}
