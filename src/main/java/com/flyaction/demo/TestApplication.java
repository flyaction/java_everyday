package com.flyaction.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author action
 */
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		String jarPath = "/Users/action/dnmp_www_localhost/money/power/src/main/resources/lib/sgcc-dlsc-linkalgorithm-1.0.0.jar"; // 替换为你的JAR文件路径
		Properties manifestProperties = readManifest(jarPath);

		String groupId = manifestProperties.getProperty("Bundle-GroupId");
		String artifactId = manifestProperties.getProperty("Bundle-ArtifactId");

		if (groupId == null) {
			groupId = manifestProperties.getProperty("Implementation-Vendor-Id");
		}
		if (artifactId == null) {
			artifactId = manifestProperties.getProperty("Implementation-Title");
		}

		System.out.println("groupId: " + groupId);
		System.out.println("artifactId: " + artifactId);
	}

	private static Properties readManifest(String jarPath) {
		Properties manifestProperties = new Properties();
		try (InputStream is = MetadataReader.class.getResourceAsStream("/META-INF/MANIFEST.MF")) {
			manifestProperties.load(new BufferedReader(new InputStreamReader(is)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return manifestProperties;
	}

}
