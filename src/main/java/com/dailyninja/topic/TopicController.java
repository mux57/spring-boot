package com.dailyninja.topic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping(method = RequestMethod.GET,produces = "application/json")
	List<Topic> index() {
		return topicService.getAllTopics();
	}

	@RequestMapping(value="/{id}",produces = "application/json")
	Topic show(@PathVariable("id") int id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "",produces = "application/json")
	@ResponseStatus
    public
    @ResponseBody
	void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
//		return {"status": 201, "message": "Record Created"}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "{id}",produces = "application/json")
	@ResponseStatus
    public
    @ResponseBody
	void updateTopic(@RequestBody Topic topic, @PathVariable int id) {
		topicService.updateTopic(topic,id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "{id}",produces = "application/json")
	@ResponseStatus
    public
    @ResponseBody
	void deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
	}
}
