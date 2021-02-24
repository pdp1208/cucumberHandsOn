$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipseWorkSpace/CucumberFramework/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks in Cucumber",
  "description": "Description: testing Hooks in Cucumber",
  "id": "hooks-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1098164,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add New Customer",
  "description": "",
  "id": "hooks-in-cucumber;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Add Customer Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Added all Details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefination.user_is_on_Add_Customer_Page()"
});
formatter.result({
  "duration": 369224374,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefination.user_Added_all_Details()"
});
formatter.result({
  "duration": 438753,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefination.customer_is_added()"
});
formatter.result({
  "duration": 476384,
  "status": "passed"
});
formatter.after({
  "duration": 480660,
  "status": "passed"
});
formatter.before({
  "duration": 1014347,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Edit Customer",
  "description": "",
  "id": "hooks-in-cucumber;edit-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on Edit Customer Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User Edit contact details",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Contact Details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefination.user_is_on_Edit_Customer_Page()"
});
formatter.result({
  "duration": 506318,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefination.user_Edit_contact_details()"
});
formatter.result({
  "duration": 651714,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefination.contact_Details_updated()"
});
formatter.result({
  "duration": 519575,
  "status": "passed"
});
formatter.after({
  "duration": 482799,
  "status": "passed"
});
formatter.before({
  "duration": 664115,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Delete Customer",
  "description": "",
  "id": "hooks-in-cucumber;delete-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "User is on Delete Customer Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Delete Customer",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Customer Deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefination.user_is_on_Delete_Customer_Page()"
});
formatter.result({
  "duration": 449871,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefination.user_Delete_Customer()"
});
formatter.result({
  "duration": 607668,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefination.customer_Deleted()"
});
formatter.result({
  "duration": 197567,
  "status": "passed"
});
formatter.after({
  "duration": 156514,
  "status": "passed"
});
});