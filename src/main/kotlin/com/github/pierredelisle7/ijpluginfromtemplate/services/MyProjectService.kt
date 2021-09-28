package com.github.pierredelisle7.ijpluginfromtemplate.services

import com.intellij.openapi.project.Project
import com.github.pierredelisle7.ijpluginfromtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
