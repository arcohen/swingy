#!/bin/bash

javac -d . */*.java
#java -cp . controller/Main
java -cp . controller/TestMain

find . -name "*.class" -delete