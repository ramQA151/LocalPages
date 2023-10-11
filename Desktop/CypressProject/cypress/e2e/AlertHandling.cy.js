///<reference types="Cypress" />


/*No need to write seperate code for alert handling in Cypress as it automatically
handles the alert but we just need to verify it by using assertion
*/
describe('Alert Handling', () => {

    //1. JS Simple Alert
    it('JS Alert', () => {

        cy.visit('https://the-internet.herokuapp.com/javascript_alerts')

        cy.get("button[onclick='jsAlert()']").click()

        cy.on('window:alert', (t) => {
            expect(t).to.contains('I am a JS Alert')

        })

        //Alert window automatically closed
        cy.get('p#result').contains('You successfully clicked an alert')
        //cy.get('p#result').should('have.text','You successfully clicked an alert')

    })
})
//2. Javascript Conformation Alert *It will have some conformation text 'Ok' and 'Cancel' buttons

it.skip('JS Confirm Alert - OK', () => {

    cy.visit('https://the-internet.herokuapp.com/javascript_alerts')

    cy.get("button[onclick='jsConfirm()']").click()

    cy.on('window:confirm', (t) => {
        expect(t).to.contains('I am a JS Confirm')

        //Cypress automatically closed alert window by using 'ok' button-bydefault
        cy.get('p#result').should('have.text', 'You clicked: Ok')

    })
})
it('JS Confirm Alert- Cancel', () => {

    cy.visit('https://the-internet.herokuapp.com/javascript_alerts')

    cy.get("button[onclick='jsConfirm()']").click()

    cy.on('window:confirm', (t) => {
        expect(t).to.contains('I am a JS Confirm')

    })
    cy.on('window:confirm', () => false); //cypress closes the alert window using cancel button

    cy.get('p#result').should('have.text', 'You clicked: Cancel')

})

//3 Javascript Prompt Alert enter value in textbox and click on ok
it.skip('JS Prompt Alert', () => {

    cy.visit('https://the-internet.herokuapp.com/javascript_alerts')

    cy.window().then((win) => {
        cy.stub(win, 'prompt').returns('Welcome Ram');

    })
    cy.get("button[onclick='jsPrompt()']").click();

    //Cypress will automatically close prompted alert - it will use OK button - bydefault

    //  cy.on('window:prompt',() => false); //cypress closes the alert window using cancel button

    cy.get("#result").should('have.text', 'You entered: Welcome Ram')


})


//4. Authentication ALert 
it.skip('Authentication Alert', () => {

    /*  cy.visit("https://the-internet.herokuapp.com/basic_auth",{auth: 
                                                                      {username: "admin",
                                                                       password:"admin"
                                                                      }
                                                                  }
                                                                  );
      */
    cy.visit("https://admin:admin@the-internet.herokuapp.com/basic_auth")

})
