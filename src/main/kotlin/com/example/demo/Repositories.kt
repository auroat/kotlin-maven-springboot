package com.example.demo

import org.springframework.data.repository.CrudRepository
import com.example.demo.Entities.Article
import com.example.demo.Entities.User

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}