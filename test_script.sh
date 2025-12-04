#!/bin/bash

./../valhalla/build/*/images/jdk/bin/java -cp library/target/scala-library-nonbootstrapped/scala-library-3.8.1-RC1-bin-SNAPSHOT-nonbootstrapped.jar:tests/valhalla/bin --enable-preview Main

cd tests/valhalla/bin
rm -rf *