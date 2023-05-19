package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// The annotation indicates this is for a business service. In that regard, this is treated as a singleton
@Service
public class TopicService {
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring", "spring framework", "spring framweork description"), 
//			new Topic("java", "spring java", "java coffee description"),
//			new Topic("python", "pandas framework", "panda description")));
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id); 
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
