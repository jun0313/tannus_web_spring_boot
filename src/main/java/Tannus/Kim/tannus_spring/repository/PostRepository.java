package Tannus.Kim.tannus_spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public String getPost() {
        System.out.println("레포지토리까찌 요청 왔다갔음");
        return "레포지토리에서 보낸 박영감 스타못함";
    }
}
