package com.mysite.sbb;


import com.mysite.sbb.domain.question.entity.Question;
import com.mysite.sbb.domain.question.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SbbApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q = questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
    }
}
