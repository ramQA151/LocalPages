
///<reference types="Cypress" />
import 'cypress-file-upload';
describe('File Upload Handling', () => {

    
    it('Upload File', () =>{

        cy.visit('https://the-internet.herokuapp.com/upload');
        
        cy.wait(3000)
        cy.get('input#file-upload').attachFile('javanotes.pdf')

        cy.get('input#file-submit').click();
        cy.wait(7000);
        cy.get('.example').should('have.text','File Uploaded');
  
    })
})