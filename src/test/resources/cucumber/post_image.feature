@post
Feature: Instagram user can post a new image from Library

  Scenario: As Instagram user, I can post a new image
    Given I login to Instagram app with credentials:
      |Username |  igor       |
      |Password |  password   |
    Then I tap on post button
    And I verify post image screen
    Then I tap on choose_image button
    And I tap on "OK" button
    And I tap on Camera Roll button
    Then I select 1st image from Gallery
    And I verify post image screen
    And I tap on post_image button
    And I tap on OK button

#   Homework: create new scenario for posting a picture with following steps

#    1. Create new unique user i.e mike2016
#    2. Post new image from gallery with message "Hi from Mike" under this user
#    3. Logout
#    4. Create another new user i.e alex2016
#    5. Check if mike2016 is followed. if not follow him
#    6. Go to "feed" screen and verify "Hi from Mike" message
#    7. Logout






