@echo off
cd desafio-gateway
call gradle build 
cd ..\
call java -jar "desafio-gateway/build/libs/desafio-gateway-1.0.0.jar"
