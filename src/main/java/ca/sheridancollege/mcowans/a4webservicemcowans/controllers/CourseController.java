package ca.sheridancollege.mcowans.a4webservicemcowans.controllers;


import ca.sheridancollege.mcowans.a4webservicemcowans.beans.Course;
import ca.sheridancollege.mcowans.a4webservicemcowans.repository.DatabaseAccess;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private DatabaseAccess da;

    public CourseController(DatabaseAccess da) {this.da=da;}

    @GetMapping
    public List<Course> getCourseCollection() {return da.findAll();}


    @PostMapping(consumes = "application/json")
    public String postCourse(@RequestBody Course course) {
        return "http://localhost:8080/courses/" + da.save(course);
    }

    @PutMapping(consumes = "application/json")
    public String putCourseCollection(@RequestBody List<Course> courseList)
    {
        da.deleteAll();
        da.saveAll(courseList);
        return "Total Records: " + da.count();
    }
    @DeleteMapping
    public String deleteAllCourse()
    {
        da.deleteAll();
        return "Total Records: " + da.count();
    }

}