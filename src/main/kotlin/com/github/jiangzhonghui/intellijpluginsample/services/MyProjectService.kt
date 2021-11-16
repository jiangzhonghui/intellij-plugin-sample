package com.github.jiangzhonghui.intellijpluginsample.services

import com.intellij.openapi.project.Project
import com.github.jiangzhonghui.intellijpluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
