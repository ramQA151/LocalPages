///<reference types="Cypress" />
import 'cypress-iframe'
describe('Handling Frames', (() =>{

    it('Approach1', () => {

        cy.visit('https://the-internet.herokuapp.com/iframe')  
         
       const iframe= cy.get("#mce_0_ifr")
        .its ('0.contentDocument.body')
        .should ('be.visible')
        .then(cy.wrap);

        iframe.clear().type("welcome {ctrl+a}" );

        cy.get("[aria-label='Bold']").click();
    })

    it('Approach2 By using custom command', () => {

        cy.visit('https://the-internet.herokuapp.com/iframe')  
         
      cy.getIframe('#mce_0_ifr').clear().type("welcome {ctrl+a}" );

        cy.get("[aria-label='Bold']").click();
    })

    it('Approach3  By using Cypress-iframe Plugin', () => {

        cy.visit('https://the-internet.herokuapp.com/iframe')  
         
        cy.frameLoaded('#mce_0_ifr'); //this will load the frame

        cy.iframe('#mce_0_ifr').clear().type("Hello RAM Have a good day {ctrl+a}");

        cy.get("[aria-label='Bold']").click();
     
    })
}))