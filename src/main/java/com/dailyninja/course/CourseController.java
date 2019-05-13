package com.dailyninja.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dailyninja.topic.Topic;
import com.dailyninja.topic.TopicService;

@RestController
@RequestMapping("/topics/{id}/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private TopicService topicService;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	List<Course> index(@PathVariable int id) {
		return courseService.getAllCourses(id);
	}

	@RequestMapping(value = "/{courseId}", produces = "application/json")
	Course show(@PathVariable("id") int id, @PathVariable("courseId") int courseId) {
		return courseService.getCourse(courseId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "", produces = "application/json")
	@ResponseStatus
	public @ResponseBody void addCourse(@RequestBody Course course, @PathVariable int id) {
		Topic topic = topicService.getTopic(id);
		course.setTopic(topic);
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{courseId}", produces = "application/json")
	@ResponseStatus
	public @ResponseBody void updateCourse(@RequestBody Course course,@PathVariable int id, @PathVariable int courseId) {
		Topic topic = topicService.getTopic(id);
		course.setTopic(topic);
		courseService.updateCourse(course);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{courseId}", produces = "application/json")
	@ResponseStatus
	public @ResponseBody void deleteCourse(@PathVariable int courseId) {
		courseService.deleteCourse(courseId);
	}
}
