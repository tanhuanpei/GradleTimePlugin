package com.thp.plugin



import org.gradle.api.Plugin
import org.gradle.api.Project

public class TimeImpl implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.gradle.addListener(new TimeListener())
    }
}