package Tannus.Kim.tannus_spring.service;

import Tannus.Kim.tannus_spring.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public String getPost() {
        String result = postRepository.getPost();
        return result;
    }
}
