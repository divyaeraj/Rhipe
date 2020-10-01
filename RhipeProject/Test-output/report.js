$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Rhipe Signup webpage",
  "description": "",
  "id": "rhipe-signup-webpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "To check the Rhipe Signup functionality",
  "description": "",
  "id": "rhipe-signup-webpage;to-check-the-rhipe-signup-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User opens URL \"https://dev-rhipe-signup.azurewebsites.net/\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters General Information",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Authorised Signatory Contact details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupRhype.launch_Chrome_browser()"
});
formatter.result({
  "duration": 6540519700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://dev-rhipe-signup.azurewebsites.net/",
      "offset": 16
    }
  ],
  "location": "SignupRhype.user_opens_URL(String)"
});
formatter.result({
  "duration": 7742325900,
  "status": "passed"
});
formatter.match({
  "location": "SignupRhype.user_enters_General_Information()"
});
formatter.result({
  "duration": 1414521500,
  "status": "passed"
});
formatter.match({
  "location": "SignupRhype.user_enters_Authorised_Signatory_Contact_details()"
});
formatter.result({
  "duration": 566642300,
  "status": "passed"
});
formatter.match({
  "location": "SignupRhype.click_on_Sign_up_button()"
});
formatter.result({
  "duration": 56700,
  "status": "passed"
});
});