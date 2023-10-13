describe('Mouse Handling', () => {

    
    it('Mouse Double Click', () =>{

        cy.visit('https://www.cypress.io/')

        cy.scrollTo(0, 500) // Scroll the window 500px down
        cy.wait(3000)
        cy.get('h2#Notes').scrollIntoView({duration: 3000})
        //cy.get('#footer').scrollIntoView
    })
})