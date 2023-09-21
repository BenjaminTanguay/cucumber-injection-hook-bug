#!/bin/bash

echo "======================================================================"
echo "The current version doesn't inject the dependency in the hook properly"
echo "======================================================================"


./mvnw clean test -Pcurrent-version-fail

echo ""
echo "================================="
echo "But it worked in an older version"
echo "================================="

./mvnw clean test -Polder-version-works
