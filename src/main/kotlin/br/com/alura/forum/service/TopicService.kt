package br.com.alura.forum.service

import br.com.alura.forum.model.Course
import br.com.alura.forum.model.Topic
import br.com.alura.forum.model.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicService(private var topics: List<Topic> = ArrayList()) {

    init {
        val topic = Topic(
            1,
            "Topic 1",
            "GetMapping com Kotlin",
            course = Course(
                1,
                "Programação",
                "João Victor"
            ),
            author = User(
                1,
                name = "Joao",
                email = "joao@email.com"
            )
        )

        val topic2 = Topic(
            2,
            "Topic 2",
            "Topic 2 - Kotlin",
            course = Course(
                1,
                "Programação",
                "João Victor"
            ),
            author = User(
                1,
                name = "Joao",
                email = "joao@email.com"
            )
        )

        val topic3 = Topic(
            3,
            "Topic 3",
            "Topic 3 - Beans with Kotlin",
            course = Course(
                1,
                "Programação",
                "João Victor"
            ),
            author = User(
                1,
                name = "Joao",
                email = "joao@email.com"
            )
        )

        topics = Arrays.asList(topic, topic2, topic3)
    }

    fun get(): List<Topic> {
        return topics
    }

    fun getById(id: Long): Topic {
        return topics.stream().filter {
            it.id == id
        }.findFirst().get();
    }
}