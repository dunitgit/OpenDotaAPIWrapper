# Open Dota API Wrapper

Java wrapper for the Open Dota API <br>

Please respect the usage limitations (keep request rate to approximately 3/s) <br>

For more information: [OpenDota API ](https://docs.opendota.com)

## Usage

Build

```
mvn install
```

Dependency

```
<dependency>
    <groupId>me.dunit.dota</groupId>
    <artifactId>open-dota-api-wrapper</artifactId>
    <version>$VERSION</version>
</dependency>
```

Example 1
```
JSONArray heroes = OpenDotaAPIWrapper.getHeroStats();
```

Example 2
```
OpenDotaAPIWrapper.getHeroImage(hero.getId(), IMAGE_LOCATION);
```

## Todo

- Optional query parameters support
- Implement missing API calls
- Handle hero id/index more gracefully
- Test bad API GET response
- Test bad API POST response
- Correctness tests