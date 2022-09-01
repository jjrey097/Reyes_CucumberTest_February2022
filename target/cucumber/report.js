$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BackgroundColor.feature");
formatter.feature({
  "line": 2,
  "name": "Background Color functionality validation",
  "description": "",
  "id": "background-color-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ChangeColorFeauture"
    }
  ]
});
formatter.before({
  "duration": 2429108800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to set the background sky blue",
  "description": "",
  "id": "background-color-functionality-validation;user-should-be-able-to-set-the-background-sky-blue",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "ColorChangeStepDefinition.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 529870800,
  "status": "passed"
});
formatter.match({
  "location": "ColorChangeStepDefinition.user_clicks_on_the_button()"
});
formatter.result({
  "duration": 3061465300,
  "status": "passed"
});
formatter.match({
  "location": "ColorChangeStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 33082400,
  "status": "passed"
});
formatter.after({
  "duration": 657534500,
  "status": "passed"
});
formatter.before({
  "duration": 1222968800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to set the background white",
  "description": "",
  "id": "background-color-functionality-validation;user-should-be-able-to-set-the-background-white",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User clicks on button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "ColorChangeStepDefinition.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 455846600,
  "status": "passed"
});
formatter.match({
  "location": "ColorChangeStepDefinition.user_clicks_on_button()"
});
formatter.result({
  "duration": 3057768700,
  "status": "passed"
});
formatter.match({
  "location": "ColorChangeStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 29886900,
  "status": "passed"
});
formatter.after({
  "duration": 639400100,
  "status": "passed"
});
});