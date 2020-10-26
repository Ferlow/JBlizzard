# JBlizzard
## About
An experimental API wrapper for the [blizzard API](https://develop.battle.net/), written in java. Use at your own risk.
For now, I will focus on implementing the API for World of Warcraft (retail).

## [Project status](https://github.com/Ferlow/JBlizzard/projects)

## Usage
### Create ClientID & Client secret
Head to the official [blizzard API access page](https://develop.battle.net/access/clients) and create your client.
Make sure, that you do not leak these credentials to anyone!

### request examples
```java
public class Run {
    public static void main(String[] args) {
        String clientId = "<YOUR CLIENT_ID HERE";
        String clientSecret = "YOUR CLIENT_SECRET HERE";
        JBlizzardClient cli = new JBlizzardClient(clientId, clientSecret, Locale.EN_GB);
        System.out.println(cli.getEuRegion().getRealms().get(0).getId());
    }
}
```
```Output: 500```

