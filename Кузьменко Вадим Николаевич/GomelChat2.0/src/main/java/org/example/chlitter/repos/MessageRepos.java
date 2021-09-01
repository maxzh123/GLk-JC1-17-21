package org.example.chlitter.repos;

import org.example.chlitter.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepos extends CrudRepository<Message, Long> {
   List<Message> findByTag (String tag);
}
