$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SearchHotel.feature");
formatter.feature({
  "name": "To validate Adactinhotelapp page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Adactinhotelapp webpage with all valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter \"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoom type\u003e\",\"\u003cNo of rooms\u003e\",\"\u003cCheckin Date\u003e\",\"\u003cCheckout Date\u003e\",\"\u003cAdults per room\u003e\",\"\u003cChildren per room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the page navigates to SearchHotel page",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter select the hotel and click the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cBillingAddress\u003e\",\"\u003ccardNumber\u003e\",\"\u003ccardType\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\",\"\u003ccvv\u003e\",",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the Book now button",
  "keyword": "And "
});
formatter.step({
  "name": "user should Print the order confirmation number",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "Location",
        "Hotels",
        "Room type",
        "No of rooms",
        "Checkin Date",
        "Checkout Date",
        "Adults per room",
        "Children per room",
        "FirstName",
        "LastName",
        "BillingAddress",
        "cardNumber",
        "cardType",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "manimani",
        "Doodle",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2 - Two",
        "25/03/2021",
        "26/03/2021",
        "3 - Three",
        "1 - One",
        "Bhuvanesh",
        "E",
        "EB Nagar,Sydney",
        "1234567890123456",
        "American Express",
        "April",
        "2022",
        "9876"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Adactinhotelapp webpage with all valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"manimani\" and \"Doodle\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"Sydney\",\"Hotel Creek\",\"Standard\",\"2 - Two\",\"25/03/2021\",\"26/03/2021\",\"3 - Three\",\"1 - One\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify the page navigates to SearchHotel page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter select the hotel and click the continue button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter the \"Bhuvanesh\",\"E\",\"EB Nagar,Sydney\",\"1234567890123456\",\"American Express\",\"April\",\"2022\",\"9876\",",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click the Book now button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should Print the order confirmation number",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Verifying mandatory functions only",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user is should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter \"\u003cLocation\u003e\",\"\u003cNo of rooms\u003e\",\"\u003cCheckin Date\u003e\",\"\u003cCheckout Date\u003e\",\"\u003cAdults per room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the page navigates to SearchHotel page",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter select the hotel and click the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cBillingAddress\u003e\",\"\u003ccardNumber\u003e\",\"\u003ccardType\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\",\"\u003ccvv\u003e\",",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the Book now button",
  "keyword": "And "
});
formatter.step({
  "name": "user should Print the order confirmation number",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "Location",
        "No of rooms",
        "Checkin Date",
        "Checkout Date",
        "Adults per room",
        "FirstName",
        "LastName",
        "BillingAddress",
        "cardNumber",
        "cardType",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "manimani",
        "Doodle",
        "Sydney",
        "2 - Two",
        "25/03/2021",
        "26/03/2021",
        "3 - Three",
        "Bhuvanesh",
        "E",
        "EB Nagar,Sydney",
        "1234567890123456",
        "American Express",
        "April",
        "2022",
        "9876"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying mandatory functions only",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user is should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"manimani\" and \"Doodle\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"Sydney\",\"2 - Two\",\"25/03/2021\",\"26/03/2021\",\"3 - Three\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify the page navigates to SearchHotel page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter select the hotel and click the continue button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter the \"Bhuvanesh\",\"E\",\"EB Nagar,Sydney\",\"1234567890123456\",\"American Express\",\"April\",\"2022\",\"9876\",",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click the Book now button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should Print the order confirmation number",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Verifying checkin date and checkout date",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter \"\u003cLocation\u003e\",\"\u003cNo of rooms\u003e\",\"\u003cCheckin Date\u003e\",\"\u003cCheckout Date\u003e\",\"\u003cAdults per room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "Location",
        "Hotels",
        "Room type",
        "No of rooms",
        "Checkin Date",
        "Checkout Date",
        "Adults per room"
      ]
    },
    {
      "cells": [
        "manimani",
        "Doodle",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2 - Two",
        "25/03/2021",
        "26/03/2021",
        "3 - Three"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying checkin date and checkout date",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"manimani\" and \"Doodle\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"Sydney\",\"2 - Two\",\"25/03/2021\",\"26/03/2021\",\"3 - Three\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify the error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Verifying without entering any fields and click search hotel button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "manimani",
        "Doodle"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying without entering any fields and click search hotel button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is should move to Adactinhotelapp page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter \"manimani\" and \"Doodle\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});