$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/search.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "I want to search on google site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.step({
  "name": "I am on the google site",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003ckeyword\u003e\" as a keyword",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the search button",
  "keyword": "And "
});
formatter.step({
  "name": "I should see at least \u003ccount\u003e results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword",
        "count"
      ]
    },
    {
      "cells": [
        "selenium",
        "2"
      ]
    },
    {
      "cells": [
        "java",
        "5"
      ]
    },
    {
      "cells": [
        "spring",
        "7"
      ]
    }
  ]
});
formatter.scenario({
  "name": "I want to search on google site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.step({
  "name": "I am on the google site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.launchSite()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"selenium\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.enterKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 2 results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.verifyResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to search on google site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.step({
  "name": "I am on the google site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.launchSite()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"java\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.enterKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 5 results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.verifyResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to search on google site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.step({
  "name": "I am on the google site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.launchSite()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"spring\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.enterKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 7 results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.springselenium.bdd.MyStepdefs.verifyResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});