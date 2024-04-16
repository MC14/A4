package ca.sheridancollege.mcowans.a4webservicemcowans.repository;


import ca.sheridancollege.mcowans.a4webservicemcowans.beans.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatabaseAccess extends JpaRepository<Course, Long> {

    List<Course> findCourseByName(String name);

    List<Course> findAll();
}