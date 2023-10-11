
describe('Handling Tab add Windows', (() =>{

    it('Approach1', () => {

        cy.visit('https://the-internet.herokuapp.com/windows')  //Parent tab/window
        
        cy.wait(5000);
        cy.get('.example >a').invoke('removeAttr','target').click(); // Clicking on link

        cy.wait(5000);
        cy.url().should('include','https://the-internet.herokuapp.com/windows/new')

        cy.wait(5000);

        //operations
        cy.go('back'); // back to parent
    
      //  cy.get("a[href='/windows/new']").click();

        
    })

    it.skip('Approach2', () => {

        cy.visit('https://the-internet.herokuapp.com/windows')  //Parent tab/window
        
        cy.get('.example >a').then((e) =>{

            let url=e.prop('href');

            cy.visit(url);
        }) 

        cy.url().should('include','https://the-internet.herokuapp.com/windows/new')

        cy.wait(5000);

        //operations
        cy.go('back'); // back to parent
  
      //if the domains(https://the-internet.herokuapp.com) are different then this approach will not work
      


        
    })
}))