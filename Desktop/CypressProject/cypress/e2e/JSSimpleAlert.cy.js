describe('Alert Handling', () => {

    //1. JS Simple Alert
    it('JS Alert', () =>{

      cy.visit('https://the-internet.herokuapp.com/javascript_alerts')
      
      cy.get("button[onclick='jsAlert()']").click()

      cy.on('window:alert', (t)=>{
        expect(t).to.contains('I am a JS Alert')

      })

      //Alert window automatically closed
      cy.get('p#result').contains('You successfully clicked an alert')
      //cy.get('p#result').should('have.text','You successfully clicked an alert')

    })
})