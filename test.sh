#!/usr/bin/env bash 
mvn package -Dmaven.test.skip=true

echo '拷贝新数据'
cp web/target/web.war /home/jeff/tomcat/apache-tomcat-7.0.47/webapps/Freeline.war

cd /home/jeff/tomcat/apache-tomcat-7.0.47/bin

echo '关闭服务器'
./shutdown.sh

echo '删除旧数据'
cd /home/jeff/tomcat/apache-tomcat-7.0.47/webapps/
rm -r Freeline

echo '重启服务器'
cd /home/jeff/tomcat/apache-tomcat-7.0.47/bin
./startup.sh


