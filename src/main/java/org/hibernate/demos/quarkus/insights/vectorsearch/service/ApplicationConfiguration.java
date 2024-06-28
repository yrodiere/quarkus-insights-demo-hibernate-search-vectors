package org.hibernate.demos.quarkus.insights.vectorsearch.service;

import java.nio.file.Path;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "app")
public interface ApplicationConfiguration {

	Path imagesRootPath();

}
