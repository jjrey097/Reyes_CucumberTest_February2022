@ChangeColorFeauture
Feature:Background Color functionality validation 

@Scenario1
Scenario: User should be able to set the background sky blue
Given Set SkyBlue Background button exists
When User clicks on the button
Then The background color will change to sky blue

@Scenario2
Scenario: User should be able to set the background white
Given Set SkyWhite Background button exists
When User clicks on button
Then The background color will change to white
