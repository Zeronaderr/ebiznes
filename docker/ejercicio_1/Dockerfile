FROM ubuntu:latest

MAINTAINER 'Wojciech Kuczyński'
# ENV DEBIAN_FRONTEND noninteractive
# ENV http_proxy 'http://mainproxy.ucm.conti.de:8980'
# ENV https_proxy 'https://mainproxy.ucm.conti.de:8980'

# Java 8
RUN apt-get update && apt-get upgrade -y;
RUN apt-get install -y openjdk-8-jdk;
RUN apt-get install -y ant;
RUN apt-get clean;
RUN apt-get install wget -y;
# scala
RUN apt-get remove scala-library scala && \
    wget http://scala-lang.org/files/archive/scala-2.12.1.deb && \
    dpkg -i scala-2.12.1.deb && \
    apt-get update && \
    apt-get install scala -y;

# SBT
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list && \
    apt-get install gnupg -y && \
    apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823 && \
    apt-get update && \
    apt-get install sbt -y;

# vim, git, unzip
RUN apt-get install vim -y;
RUN apt-get install git -y;
RUN apt-get install unzip -y;

#npm
RUN apt-get install curl -y;
RUN curl -sL https://deb.nodesource.com/setup_10.x | bash;
RUN apt-get install nodejs -y;
RUN npm install npm@6.8.0

#ports 8000, 9000, 5000, 8888
EXPOSE 8000
EXPOSE 9000
EXPOSE 5000
EXPOSE 8888

WORKDIR /home/wkuczynski/project