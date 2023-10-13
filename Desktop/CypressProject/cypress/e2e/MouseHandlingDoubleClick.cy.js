
describe('Mouse Handling', () => {

    
    it('Mouse Double Click', () =>{

        cy.visit('https://demo.guru99.com/test/simple_context_menu.html')

       cy.get('button[ondblclick="myFunction()"]').dblclick();

  
    })
})