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

## Local Kubernetes Cluster via Minikube

Make sure to have Minikube and Docker installed.
```
While in project directory run the following:

minikube start --driver=docker

minikube dashboard   # you can run this command if you want to see a graphical dashboard of your local cluster status


Now if you chose to run minikube-dashboard command, you might need to open a new terminal window and again navigate to project source root.

In here perform:

eval $(minikube -p minikube docker-env)  #skip slash if present
docker build . -t hello
kubectl create -f hello.yml
kubectl expose deployment hello --type=NodePort --port=8080
kubectl get services hello
minikube service hello


After the last command, your service should be enabled on your localhost:

Example output:

antonikarolewski@antek HelloTests (master) $ minikube service hello
|-----------|-------|-------------|---------------------------|
| NAMESPACE | NAME  | TARGET PORT |            URL            |
|-----------|-------|-------------|---------------------------|
| default   | hello |        8080 | http://192.168.49.2:30323 |
|-----------|-------|-------------|---------------------------|
🏃  Starting tunnel for service hello.
|-----------|-------|-------------|------------------------|
| NAMESPACE | NAME  | TARGET PORT |          URL           |
|-----------|-------|-------------|------------------------|
| default   | hello |             | http://127.0.0.1:61095 |
|-----------|-------|-------------|------------------------|
🎉  Opening service default/hello in default browser...
❗  Because you are using a Docker driver on darwin, the terminal needs to be open to run it.

As you can see, the service is available on port 61095 on your localhost.

Feel free to test it in your browser: 

http://127.0.0.1:61095/Minikube

Hi there, Minikube!
```

Other questions? - > `akarolewskia@gmail.com`
