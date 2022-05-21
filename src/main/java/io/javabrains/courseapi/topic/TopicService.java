package io.javabrains.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics1 = new ArrayList<>();
        topicRepository.findAll().forEach(topics1::add);
        return topics1;
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
