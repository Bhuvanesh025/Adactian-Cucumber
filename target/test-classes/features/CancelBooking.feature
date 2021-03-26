Feature: To validate Adactinhotelapp page Cancel Booking Details

  
  Scenario Outline: Verify Adactinhotelapp webpage with cancelling the generated order id
  
    Given user should move to Adactinhotelapp page
    When user should enter "<userName>" and "<password>"
    And user should click login button
    And user should enter "<Location>","<Hotels>","<Room type>","<No of rooms>","<Checkin Date>","<Checkout Date>","<Adults per room>","<Children per room>"
    And user should enter search button
    And user should verify the page navigates to SearchHotel page
    And user should enter select the hotel and click the continue button
    And user should enter the "<FirstName>","<LastName>","<BillingAddress>","<cardNumber>","<cardType>","<month>","<year>","<cvv>"
    And user should click the Book now button
    And user should Print the order confirmation number
    And user should click My Itineary button
    And user should search confirmation number and click go
    Then user should cancel the selected order id and should accept the alert
    
    

    Examples: 
      | userName | password | Location | Hotels      | Room type | No of rooms | Checkin Date | Checkout Date | Adults per room | Children per room | FirstName | LastName | BillingAddress  | cardNumber       | cardType         | month | year | cvv  |
      | manimani | Doodle   | Sydney   | Hotel Creek | Standard  | 2 - Two     | 25/03/2021   | 26/03/2021    | 3 - Three       | 1 - One           | Bhuvanesh | E        | EB Nagar,Sydney | 1234567890123456 | American Express | April | 2022 | 9876 |


#@Reg
Scenario Outline: Verify Adactinhotelapp webpage with cancelling the already existing order id

    Given user should move to Adactinhotelapp page
    When user should enter "<userName>" and "<password>"
    And user should click login button
    And user should enter "<Location>","<Hotels>","<Room type>","<No of rooms>","<Checkin Date>","<Checkout Date>","<Adults per room>","<Children per room>"
    And user should enter search button
    And user should verify the page navigates to SearchHotel page
    And user should enter select the hotel and click the continue button
    And user should enter the "<FirstName>","<LastName>","<BillingAddress>","<cardNumber>","<cardType>","<month>","<year>","<cvv>"
    And user should click the Book now button
    And user should Print the order confirmation number
    And user should click My Itineary button
    And user should select the desired order id to delete and click cancel selected button
    Then user should accept the alert
    
     Examples: 
      | userName | password | Location | Hotels      | Room type | No of rooms | Checkin Date | Checkout Date | Adults per room | Children per room | FirstName | LastName | BillingAddress  | cardNumber       | cardType         | month | year | cvv  |
      | manimani | Doodle   | Sydney   | Hotel Creek | Standard  | 2 - Two     | 25/03/2021   | 26/03/2021    | 3 - Three       | 1 - One           | Bhuvanesh | E        | EB Nagar,Sydney | 1234567890123456 | American Express | April | 2022 | 9876 |
    

