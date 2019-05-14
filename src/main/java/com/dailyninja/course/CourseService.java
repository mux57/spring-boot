package com.dailyninja.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(int id) {
		ArrayList<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id)
				.forEach(courses::add);
		return courses;
	}

	public Course getCourse(int courseId) {
		return courseRepository.findById(courseId).get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}

}
