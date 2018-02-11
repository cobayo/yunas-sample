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

## Create Executable Jar
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

## Integration Vue.js + webpack + Yunas

ES6 JS Files in src/javascript/packs/

build with Webpack
```
sh ./bin/webpacker
```
-> Output files in resources/static/packs/

Example
```
<script src="yourdomain/packs/xxxx.js></script>
```
