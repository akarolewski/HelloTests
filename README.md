# Hello Tests

Welcome to Hello application tests example repository.

Project is using Rest Assured library with Java as programming language.

In order to run a test suite, please follow:

## Project setup

```
git clone git@github.com:akarolewski/HelloTests.git
cd HelloTests
mvn clean test
```

## Docker

In order to run the application as a Docker container, while in project's root directory please run following commands:

```
git clone git@github.com:akarolewski/HelloTests.git
cd HelloTests
docker build . -t hello
docker run -it -p 8080:8080 hello  # After this command, the appliaction server should be running.

Now open a separate terminal window and type:
cd HelloTests
mvn clean test
```

Other questions? - > `akarolewskia@gmail.com`
