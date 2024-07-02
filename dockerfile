FROM kasmweb/java-dev:1.13.1-rolling
COPY . /myapp
WORKDIR /myapp
RUN java -version