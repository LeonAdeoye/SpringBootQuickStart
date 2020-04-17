# Quick Start Micro-service

**The steps below enable you to setup your micro-service using a quick-start clone:**

- [ ] Clone the quick start micro-service
```
git clone https://github.com/LeonAdeoye/SpringBootQuickStart.git
mv SpringBootQuickStart/ <service-name>/
cd <service-name>
rm -rf .git/
```

- [ ] Update artifact Id in **pom.xml** file
```
<groupId>com.leon</groupId>
<artifactId>service-name</artifactId>
<version>0.1.0</version>
```

- [ ] Change name of service in the **./idea/.name** file from **quick-start** to \<service-name>

- [ ] Open the **./idea/compiler.xml** file and replace all 3 module references of the text **quick-start** with \<service-name>

- [ ] Open the **./idea/workspace.xml** file and replace all references of the text **quick-start** with \<service-name>

- [ ] Rename file **./quick-start.iml** to \<service-name>.iml

- [ ] Update **THIS_COMPONENT_NAME** private static variable in the **services/ConfigurationServiceImpl** java file.

- [ ] Update port number in **application.properties** file in src/main/resources/

- [ ] Update the **quick-start.log** appender file names in src/main/resources/logback.xml

- [ ] Run `mvn install` to ensure everything compiles.
