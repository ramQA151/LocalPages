///<reference types="Cypress" />

describe('Sample Automation script for demo', () => {
    it('passes', () => {
      cy.visit('https://rahulshettyacademy.com/AutomationPractice/')
    // cy.get("//input[@value='radio1']").should('be.visible')
     
    //Selecting all the check boxes at a time without using loop
        cy.get('//input[contains(@id,"checkBoxOption")]').check().should('be.checked')

    //Unselecting all the check boxes at a time without using loop
    //    cy.get('//input[contains(@id,"checkBoxOption")]').uncheck().should('not.be.checked')





    })
  })