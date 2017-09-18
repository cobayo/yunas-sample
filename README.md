## Run in Local
Read application-local.properties  
```
export YUNAS_PROFILES_ACTIVE=local
```

Run
```
gradle run
```

## Run test
```
gradle test
```

## Create Excutable Jar
```
gradle fatJar
```

## Launch from Jar (Production)  
Read application.properties  
```
unset YUNAS_ACTIVE_PROFILE
```
OR  
```
export YUNAS_ACTIVE_PROFILE=production
```

```
java -jar xxxxxx.jar
```

