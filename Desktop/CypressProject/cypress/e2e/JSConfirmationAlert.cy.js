///<reference types="Cypress" />

describe('JS Confirm Alert Handling', () => {
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
        })