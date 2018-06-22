# JavaFX Utilities Library
[![Build Status](https://travis-ci.com/qbicsoftware/javafx-utils-lib.svg?branch=development)](https://travis-ci.com/qbicsoftware/javafx-utils-lib)[![Code Coverage]( https://codecov.io/gh/qbicsoftware/javafx-utils-lib/branch/development/graph/badge.svg)](https://codecov.io/gh/qbicsoftware/javafx-utils-lib)

JavaFX Utilities Library, version 1.0.0-SNAPSHOT - Library containing JavaFX-specific code.

## Author
Created by Luis de la Garza (luis.delagarza@qbic.uni-tuebingen.de).

## Description
The purpose of this library is to be able to isolate JavaFX code since JavaFX is a system dependency outside the scope of Maven. Using JavaFX in Travis the easy way means to use Oracle's JDK and we are using OpenJDK.

There is [an issue](https://github.com/qbicsoftware/javafx-utils-lib/issues/1) about that already.

## How to Install
This is a library and the most common way to use this library in particular is by including it in your pom.xml as a dependency. If you are using our [parent poms](https://github.com/qbicsoftware/parent-poms) you do not need to specify a version to include this dependency.

```xml
<dependency>
  <groupId>life.qbic</groupId>
  <artifactId>javafx-utils-lib</artifactId>
</dependency>
```

