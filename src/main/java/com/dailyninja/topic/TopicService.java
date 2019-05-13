package com.dailyninja.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
//	private List<Topic> topics = new ArrayList<>(
//			Arrays.asList(
//					new Topic(1, "Java", "A Hight Level Language"),
//					new Topic(2, "Java Script", "A High level Scripting Language")
//					)
//			);

	public List<Topic> getAllTopics() {
//		return topics;
		ArrayList<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
				.forEach(topics::add);
		return topics;
	}

	public Topic getTopic(int id) {
//		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
//		topics.add(topic);
		System.out.println("Hello world "+ topic.getDescription());
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, int id) {
//		Topic tp = topics.stream().filter(t -> t.getId() == id).findFirst().get();
//		if(tp != null) {
//			tp.setName(topic.getName());
//			tp.setDescription(topic.getDescription());
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(int id) {
//		for(int i = 0; i < topics.size(); i++) {
//			if(topics.get(i).getId() == id) {
//				topics.remove(i);
//				return;
//			}
//		}
		topicRepository.deleteById(id);
	}

}
