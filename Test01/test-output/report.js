$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "I want to go to Techfios site  test site to check the check box",
  "description": "",
  "id": "i-want-to-go-to-techfios-site--test-site-to-check-the-check-box",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "i-want-to-go-to-techfios-site--test-site-to-check-the-check-box;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user goes to Techfios Site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_goes_to_Techfios_Site()"
});
formatter.result({
  "duration": 6840151400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.Page_should_be_displayed()"
});
formatter.result({
  "duration": 19800,
  "status": "passed"
});
});