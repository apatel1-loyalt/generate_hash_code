#!/bin/bash

mvn clean install

# Compile the Java program
javac src/main/java/org/hashcode/main.java

# Run the compiled program
java target/classes/org/hashcode/main



