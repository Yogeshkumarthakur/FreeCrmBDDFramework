$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is freeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "After Login Free CRM title Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;after-login-free-crm-title-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user is already logged In",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "verify title of home page is CRMPRO",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Print title on console",
  "keyword": "Then "
});
formatter.match({
  "location": "TitleStepDefination.user_is_already_logged_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TitleStepDefination.verify_title_of_home_page_is_CRMPRO()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TitleStepDefination.Print_title_on_console()"
});
formatter.result({
  "status": "skipped"
});
});