$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TimesPaidJourney.feature");
formatter.feature({
  "line": 1,
  "name": "Times paid Journey",
  "description": "As a Times customer\r\nI want to register Times with Creditcard payment\r\nSo that I can access the Times content",
  "id": "times-paid-journey",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Time Paid Journey",
  "description": "",
  "id": "times-paid-journey;time-paid-journey",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Times"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on \"Times\" web page with \"TEST_MP110\" promocode",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I fill personal details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I submit personal details",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I choose \"credit card\" payment option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I fill card details",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I fill billing address section",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I choose home delivery option",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I submit payment details",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see review Order section",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I agree to \"Times\" terms and condition",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click submit the review order form",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see Times Thank You page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I take screenshot of the current state",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Times",
      "offset": 9
    },
    {
      "val": "TEST_MP110",
      "offset": 31
    }
  ],
  "location": "TimespaidStepDef.i_am_on_web_page_with_promocode(String,String)"
});
formatter.result({
  "duration": 6481048441,
  "error_message": "java.lang.NullPointerException\r\n\tat Acquisition.AcquisitionPage.acceptCookies(AcquisitionPage.java:23)\r\n\tat StepDefinations.TimespaidStepDef.i_am_on_web_page_with_promocode(TimespaidStepDef.java:27)\r\n\tat ✽.Given I am on \"Times\" web page with \"TEST_MP110\" promocode(TimesPaidJourney.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TimespaidStepDef.i_fill_personal_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_submit_personal_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "credit card",
      "offset": 10
    }
  ],
  "location": "TimespaidStepDef.i_choose_payment_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_fill_card_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_fill_billing_address_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_choose_home_delivery_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_submit_payment_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_should_see_review_Order_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Times",
      "offset": 12
    }
  ],
  "location": "TimespaidStepDef.i_agree_to_terms_and_condition(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_click_submit_the_review_order_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_should_see_Times_Thank_You_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimespaidStepDef.i_take_screenshot_of_the_current_state()"
});
formatter.result({
  "status": "skipped"
});
});