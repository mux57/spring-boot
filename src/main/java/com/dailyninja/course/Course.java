package com.dailyninja.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dailyninja.topic.Topic;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	
//	private int topicId;
	//	many to one mapping 
	@ManyToOne
	private Topic topic;
	
//	public int getTopicId() {
//		return topicId;
//	}
//
//	public void setTopicId(int topicId) {
//		this.topicId = topicId;
//	}


	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {
	}

	public Course(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = getTopic();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
