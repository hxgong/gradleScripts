buildscript {
	ext { springBootVersion = '1.3.0.RELEASE' }
	repositories {
		// NOTE: You should declare only repositories that you need here
		mavenLocal()
		mavenCentral()
		maven { url "http://repo.spring.io/release" }
		maven { url "http://repo.spring.io/milestone" }
		maven { url "http://repo.spring.io/snapshot" }
	}
	dependencies { classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}") }
}

apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'spring-boot'

sourceCompatibility = 1.8
version = '1.0'
jar {
    manifest {
        attributes 'Implementation-Title': 'Gradle Quickstart',
                   'Implementation-Version': version
    }
}

repositories {
   jcenter()
	mavenCentral()
	maven {
		url "https://repo.typesafe.com/typesafe/maven-releases"
	}
	maven {
		url "https://repo.eclipse.org/content/repositories/paho-releases/"
	}
	ivy {
		name "typesafe-ivy-release"
		url "https://repo.typesafe.com/typesafe/ivy-releases"
		layout "ivy"
	}
	maven { url "http://repo.spring.io/release" }
	maven { url "http://repo.spring.io/milestone" }
	maven { url "http://repo.spring.io/snapshot" }
}

dependencies {
	
	compile("org.springframework.boot:spring-boot-starter")
//	compile("org.springframework.boot:spring-boot-starter-web")
//	compile("org.springframework.boot:spring-boot-starter-actuator")
}
