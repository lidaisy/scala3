#!/bin/bash

./../valhalla/build/*/images/jdk/bin/java -cp library/target/scala-library-nonbootstrapped/scala-library-3.8.1-RC1-bin-SNAPSHOT-nonbootstrapped.jar:tests/valhalla/bin --enable-preview Main

clean="true"

while getopts n flag
do
    case "${flag}" in
        n) clean="false";;
    esac
done

if [[ "$clean" == "true" ]]; then
  cd tests/valhalla/bin
  rm -rf *
fi
