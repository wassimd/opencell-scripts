This project has **two plugins** to upload scripts to an opencell instance: 
### Using Maven 
To upload scripts automatically to a running Opencell instance use the following command : 

```bash
mvn opencell:deploy-scripts@deploy-scripts
```

It is possible also to specify a different Opencell URL and a specific file :

```bash
mvn opencell:deploy-scripts@deploy-scripts  -DjavaFile=src/main/java/com/opencell/script/SampleScript.java -Dopencell.url=http://integration.i.opencellsoft.com
```

### Generate a postman Collection
To export scripts to a Postman file for a later use, use the following command :

```bash
mvn opencell:create-postman@create-postman
```

