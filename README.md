[![Build Status](https://travis-ci.org/acejudo/Spring-Boot-CommandLineRunner-Skeleton.svg?branch=master)](https://travis-ci.org/acejudo/Spring-Boot-CommandLineRunner-Skeleton)

# Simple Srping Boot CommandLine Application
- Using properties
- A simple service
- Unit test

# Run app:
  mvn spring-boot:run

# Test app
  mvn test
  
# Package with profile
  mvn clean package
  mvn clean package -P dev
  mvn clean package -P pro
  
# Docker build
  docker build -t centos-ansible-adri:1.0 .

# Run image as a containter
  docker run --publish 8000:8080 --detach --name containerName myapp

# View logs
  docker logs containerName

# Run image with ansible and share volume (docker-ansible folder)
  docker run --name centos-ansible-adri -v C:\Users\adrian.cejudo\Documents\docker\share:/opt/ansible/share -it centos-ansible-adri:1.0 /bin/bash
    
### Output:
```sh
C:\Proyectos\Spring-Boot-CommandLineRunner-Skeleton\docker-ansible> docker run --name centos-ansible-adri -v C:\Users\adrian.cejudo\Documents\docker\share:/opt/ansible/share -it centos-ansible-adri:1.0 /bin/bash
 [WARNING]: provided hosts list is empty, only localhost is available


PLAY [This is a playbook example] ************************************************************************************************************************************************************************************
TASK [Gathering Facts] ***********************************************************************************************************************************************************************************************ok: [localhost]

TASK [Create a file called 'test.txt' with the content 'hello world'.] ***********************************************************************************************************************************************ok: [localhost]

TASK [provides ifconfig] *********************************************************************************************************************************************************************************************changed: [localhost]

TASK [Ensure repo is up-to-date] *************************************************************************************************************************************************************************************ok: [localhost]

TASK [Install java] **************************************************************************************************************************************************************************************************changed: [localhost]

TASK [Install maven] *************************************************************************************************************************************************************************************************changed: [localhost]

TASK [mvn clean package -P pro] **************************************************************************************************************************************************************************************changed: [localhost]

TASK [Run jar] *******************************************************************************************************************************************************************************************************changed: [localhost]

TASK [debug] *********************************************************************************************************************************************************************************************************ok: [localhost] => {
    "output.stdout_lines": [
        "",
        "  .   ____          _            __ _ _",
        " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\",
        "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\",
        " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )",
        "  '  |____| .__|_| |_|_| |_\\__, | / / / /",
        " =========|_|==============|___/=/_/_/_/",
        " :: Spring Boot ::        (v2.2.1.RELEASE)",
        "",
        "2020-05-22 09:10:10.265  INFO 1439 --- [           main] c.a.c.CommandLineRunnerApplication       : Starting CommandLineRunnerApplication v0.0.1-SNAPSHOT on b4900f366b51 with PID 1439 (/opt/ansible/share/SpringBoot/target/commandLineRunner-0.0.1-SNAPSHOT-spring-boot.jar started by root in /usr/local/bin)",
        "2020-05-22 09:10:10.267  INFO 1439 --- [           main] c.a.c.CommandLineRunnerApplication       : No active profile set, falling back to default profiles: default",
        "2020-05-22 09:10:10.943  INFO 1439 --- [           main] c.a.c.CommandLineRunnerApplication       : Started CommandLineRunnerApplication in 1.196 seconds (JVM running for 1.893)",
        "2020-05-22 09:10:10.945  INFO 1439 --- [           main] c.a.c.CommandLineRunnerApplication       : hi! pro"
    ]
}

PLAY RECAP ***********************************************************************************************************************************************************************************************************localhost                  : ok=9    changed=5    unreachable=0    failed=0

[root@b4900f366b51 ansible]#
```



