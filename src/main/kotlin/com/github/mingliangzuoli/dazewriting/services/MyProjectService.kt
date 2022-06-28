package com.github.mingliangzuoli.dazewriting.services

import com.intellij.openapi.project.Project
import com.github.mingliangzuoli.dazewriting.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
