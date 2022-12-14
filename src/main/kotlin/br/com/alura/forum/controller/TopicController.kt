package br.com.alura.forum.controller

import br.com.alura.forum.model.Topic
import br.com.alura.forum.service.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(
    private val service: TopicService
) {
    @GetMapping
    fun getTopics(): List<Topic> {
        return service.get()
    }

    @GetMapping("/{id}")
    fun getTopicById(
        @PathVariable id: Long
    ): Topic {
        return service.getById(id)
    }
}