#!/bin/bash

javac -d . *.java
java -cp . Main

find . -name "*.class" -delete