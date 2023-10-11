///<reference types="Cypress" />

describe('Sample Automation script for demo', () => {
  it('passes', () => {
    cy.visit('https://rahulshettyacademy.com/AutomationPractice/')
   // cy.get("//input[@value='radio1']").should('be.visible')
    cy.get("input#checkBoxOption2").should('be.visible')

    //Selecting Radio Buttons
    cy.get("input#checkBoxOption2").check().should('be.checked')
  })
})