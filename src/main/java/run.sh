#!/bin/bash

javac -d . */*.java
java -cp . controller/Main

find . -name "*.class" -delete