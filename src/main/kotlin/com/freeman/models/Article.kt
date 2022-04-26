package com.freeman.models

import java.util.concurrent.atomic.AtomicInteger

class Article
private constructor(val id:Int, var title:String,var body:String){
    companion object{
        private val idArticle = AtomicInteger()
        fun newEntry(title: String,body: String) = Article(idArticle.getAndIncrement(), title, body)
    }
}

val articles = mutableListOf(
    Article.newEntry("Empezando con Ktor","El framework para crear páginas dinamicas")
)